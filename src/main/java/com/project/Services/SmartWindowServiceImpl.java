package com.project.Services;

import com.project.dataReader.WindCSVReader;
import com.project.dataReader.WindReading;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.project.grpc.smartoffices.window.WindowRequest;
import com.project.grpc.smartoffices.window.WindowResponse;
import com.project.grpc.smartoffices.window.SmartWindowGrpc.SmartWindowImplBase;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import javafx.application.Platform;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class SmartWindowServiceImpl extends SmartWindowImplBase {
    private Server server;

    private boolean isWindowOpen = true; // Track Window state, assuming window starts open
    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private ScheduledExecutorService executor;


    private void start() throws IOException {
        int port = 50084; // Unique port for the Window service
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

//////////////////////////////

    @Override
    public StreamObserver<WindowRequest> controlWindows(StreamObserver<WindowResponse> responseObserver) {
        return new StreamObserver<WindowRequest>() {
            @Override
            public void onNext(WindowRequest request) {
                double windSpeed = request.getWindSpeed();
                double windTemperature = request.getWindTemperature();

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
    /////////////////////

//    @Override
//    public void streamWindowStatus(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
//        // Let's say you have a method that can get the latest readings.
//        // It might come from a database, a sensor, etc.
//        final List<WindReading> readings = getLatestWindReadings();
//
//        // Assuming you're using a scheduled executor to send updates at regular intervals.
//        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//        scheduledExecutorService.scheduleAtFixedRate(() -> {
//            // Loop through the readings, creating and sending a new response for each one.
//            for (WindReading reading : readings) {
//                boolean shouldCloseWindow = shouldWindowBeClosed(reading); // Implement this based on your logic
//                WindowResponse response = WindowResponse.newBuilder()
//                        .setWindowStatus(shouldCloseWindow)
//                        .setWindSpeed(reading.getWindSpeed())
//                        .build();
//                responseObserver.onNext(response);
//            }
//        }, 0, 1, TimeUnit.SECONDS); // Send an update every second, for example.
//
//        // Make sure to shut down the executor service when you're done
//        // to prevent resource leaks.
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            scheduledExecutorService.shutdown();
//            try {
//                if (!scheduledExecutorService.awaitTermination(5, TimeUnit.SECONDS)) {
//                    scheduledExecutorService.shutdownNow();
//                }
//            } catch (InterruptedException e) {
//                scheduledExecutorService.shutdownNow();
//                Thread.currentThread().interrupt();
//            }
//        }));
//    }
//
//    // Helper method to determine if the window should be closed based on a reading
//    private boolean shouldWindowBeClosed(WindReading reading) {
//        // Example logic: close the window if the wind speed is too high or temperature is too low
//        return reading.getWindTemperature() < 9.0 || reading.getWindSpeed() > 64.0;
//    }
//
//    // Helper method to fetch the latest wind readings.
//// This is a placeholder for your actual data retrieval logic.
//    private List<WindReading> getLatestWindReadings() {
//        // This should interact with your data source to get the latest readings.
//        // For example, it could query a database, read from a sensor, etc.
//        return new ArrayList<>(); // Return an actual list of readings.
//    }

    @Override
    public void streamWindowStatus(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
        // Predefined list of wind readings
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
            // Only proceed if the current index is within the bounds of the readings list
            if (index.get() < readings.size()) {
                WindReading reading = readings.get(index.getAndIncrement());
                boolean shouldCloseWindow = shouldWindowBeClosed(reading);

                WindowResponse response = WindowResponse.newBuilder()
                        .setWindowStatus(shouldCloseWindow)
                        .setWindSpeed(reading.getWindSpeed())
                        .build();
                responseObserver.onNext(response);
            } else {
                // Reset the index to loop over the readings again or stop the executor if done
                index.set(0); // Or if you want to stop sending: scheduledExecutorService.shutdown();
            }
        }, 0, 15, TimeUnit.SECONDS); // Sends an update every 15 seconds.

        // It's important to manage the lifecycle of your executor service
        // Add your shutdown logic here if necessary
    }

    // This method determines whether the window should be closed.
    private boolean shouldWindowBeClosed(WindReading reading) {
        // Example logic: close the window if the wind speed is too high or temperature is too low
        return reading.getWindTemperature() < 9.0 || reading.getWindSpeed() > 64.0;
    }





    // ver 2222
//    @Override
//    public void streamWindowStatus(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
//        // Replace WindCSVReader.loadWindData() with a predefined list
//        List<WindReading> readings = Arrays.asList(
//                new WindReading("SE", 21.6, 14.0),
//                new WindReading("NW", 26.7, 6.3),
//                new WindReading("W", 25.2, 9.3),
//                new WindReading("S", 28.7, 14.5),
//                new WindReading("NW", 27.2, 6.4),
//                new WindReading("N", 17.8, 5.9),
//                new WindReading("NW", 11.7, 3.8),
//                new WindReading("SW", 28.6, 14.8),
//                new WindReading("NE", 13.3, 14.9),
//                new WindReading("W", 5.8, 7.5),
//                new WindReading("SE", 23.2, 2.4),
//                new WindReading("N", 17.2, 0.4),
//                new WindReading("N", 9.4, 14),
//                new WindReading("NE", 12.6, 8.7)
//        );
//
//        AtomicInteger index = new AtomicInteger(0);
//
//        // Scheduled task to send wind data every 15 seconds
//        executor.scheduleAtFixedRate(() -> {
//            if (index.get() < readings.size()) {
//                WindReading reading = readings.get(index.getAndIncrement());
//                boolean shouldCloseWindow = reading.getWindTemperature() < 9.0 || reading.getWindSpeed() > 64.0;
//                WindowResponse response = WindowResponse.newBuilder()
//                        .setWindowStatus(shouldCloseWindow)
//                        .setWindSpeed(reading.getWindSpeed())
//                        .build();
//
//                responseObserver.onNext(response);
//            } else {
//                // Reset the index to 0 to loop the readings continuously
//                index.set(0);
//            }
//        }, 0, 15, TimeUnit.SECONDS); // Update interval as required
//    }
//
//    public void shutdown() {
//        executor.shutdown();
//        try {
//            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
//                executor.shutdownNow();
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }



    // ver 3333
//    private void streamReadings(List<WindReading> readings,
//                                StreamObserver<WindowResponse> responseObserver,
//                                AtomicInteger index) {
//        if (index.get() < readings.size()) {
//            WindReading reading = readings.get(index.getAndIncrement());
//            boolean shouldCloseWindow = reading.getWindTemperature() < 9.0 || reading.getWindSpeed() > 40.0;
//            WindowResponse response = WindowResponse.newBuilder()
//                    .setWindowStatus(shouldCloseWindow)
//                    .setWindSpeed(reading.getWindSpeed())
//                    .build();
//
//            System.out.println("Sending wind speed: " + reading.getWindSpeed());
//            responseObserver.onNext(response);
//
//            // Schedule next reading after 15 seconds
//            Platform.runLater(() -> streamReadings(readings, responseObserver, index), 15000);
//        } else {
//            responseObserver.onCompleted();
//        }
//    }
//
//    @Override
//    public void streamWindowStatus(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
//        List<WindReading> readings = WindCSVReader.loadWindData();
//        AtomicInteger index = new AtomicInteger(0);
//
//        // Start the recursive streaming
//        streamReadings(readings, responseObserver, index);
//    }





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