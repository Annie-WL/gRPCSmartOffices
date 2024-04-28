package com.project.Services;

import com.project.dataReader.WindReading;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.project.grpc.smartoffices.window.WindowRequest;
import com.project.grpc.smartoffices.window.WindowResponse;
import com.project.grpc.smartoffices.window.SmartWindowGrpc.SmartWindowImplBase;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class SmartWindowServiceImpl extends SmartWindowImplBase {
    private Server server;

    private boolean isWindowOpen = true;
    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService executor;


    private void start() throws IOException {
        int port = 50084;
        server = ServerBuilder.forPort(port)
                .addService(this)
                .build()
                .start();
        System.out.println("SmartWindow Server started, listening on " + port);

        registerToConsul();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    @Override
    // method for the Wind Sensor Device
    public StreamObserver<WindowRequest> controlWindows(StreamObserver<WindowResponse> responseObserver) {
        return new StreamObserver<WindowRequest>() {
            @Override
            public void onNext(WindowRequest request) {
                double windSpeed = request.getWindSpeed();
                double windTemperature = request.getWindTemperature();

                // the conditions to determine the window status
                boolean shouldCloseWindow = windTemperature < 9.0 || windSpeed > 64.0;
                if (shouldCloseWindow) {
                    isWindowOpen = false;
                } else {
                    isWindowOpen = true;
                }

                WindowResponse response = WindowResponse.newBuilder()
                        .setWindowStatus(!isWindowOpen) // True if window is closed, false if open
                        .setWindSpeed(windSpeed)
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in ControlWindows: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    // for the GUI part, the wind readings was use an ArrayList
    public void streamWindowStatus(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {

        List<WindReading> readings = Arrays.asList(
                new WindReading("SE", 21.6, 14.0),
                new WindReading("NW", 26.7, 6.3),
                new WindReading("W", 25.2, 9.3),
                new WindReading("S", 28.7, 14.5),
                new WindReading("NW", 27.2, 6.4),
                new WindReading("N", 17.8, 5.9),
                new WindReading("NW", 11.7, 3.8),
                new WindReading("SW", 28.6, 14.8),
                new WindReading("NE", 13.3, 14.9),
                new WindReading("W", 5.8, 7.5),
                new WindReading("SE", 23.2, 2.4),
                new WindReading("N", 17.2, 0.4),
                new WindReading("N", 9.4, 14),
                new WindReading("NE", 12.6, 8.7)
        );

        AtomicInteger index = new AtomicInteger(0);

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(() -> {

            if (index.get() < readings.size()) {
                WindReading reading = readings.get(index.getAndIncrement());
                boolean shouldCloseWindow = shouldWindowBeClosed(reading);

                WindowResponse response = WindowResponse.newBuilder()
                        .setWindowStatus(shouldCloseWindow)
                        .setWindSpeed(reading.getWindSpeed())
                        .build();
                responseObserver.onNext(response);
            } else {
                // Reset the index to loop over the readings again
                index.set(0);
            }
        }, 0, 15, TimeUnit.SECONDS); // Sends an update every 15 seconds.

    }

    // This method determines whether the window should be closed.
    private boolean shouldWindowBeClosed(WindReading reading) {
        return reading.getWindTemperature() < 9.0 || reading.getWindSpeed() > 64.0;
    }


    private void registerToConsul() {
        System.out.println("Registering server to Consul...");

        // Load Consul configuration from smart-window.properties file
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/smart-window.properties")) {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Extract Consul configuration properties
        String consulHost = props.getProperty("consul.host");
        int consulPort = Integer.parseInt(props.getProperty("consul.port"));
        String serviceName = props.getProperty("consul.service.name");
        int servicePort = Integer.parseInt(props.getProperty("consul.service.port"));
        String healthCheckInterval = props.getProperty("consul.service.healthCheckInterval");

        // Get host address
        String hostAddress;
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return;
        }

        // Create a Consul client
        ConsulClient consulClient = new ConsulClient(consulHost, consulPort);

        // Define service details
        NewService newService = new NewService();
        newService.setName(serviceName);
        newService.setPort(servicePort);
        newService.setAddress(hostAddress); // Set host address

        // Register service with Consul
        consulClient.agentServiceRegister(newService);

        // Print registration success message
        System.out.println("Server registered to Consul successfully. Host: " + hostAddress);
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        final SmartWindowServiceImpl server = new SmartWindowServiceImpl();
        server.start();
        server.server.awaitTermination();
    }

}//class