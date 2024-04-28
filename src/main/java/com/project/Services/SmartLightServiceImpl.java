package com.project.Services;

import com.project.dataReader.OccupancyCSVReader;
import com.project.dataReader.OccupancyReading;
import com.project.grpc.smartoffices.light.SmartLightGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.project.grpc.smartoffices.light.LightRequest;
import com.project.grpc.smartoffices.light.LightResponse;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import javafx.fxml.FXML;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class SmartLightServiceImpl extends SmartLightGrpc.SmartLightImplBase {
    private Server server;
    private boolean isLightOn = false;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private ScheduledFuture<?> lightOffTask; // Task for turning off the light
    private final ArrayList<OccupancyReading> occupancyReadings = OccupancyCSVReader.loadOccupancyData();


    private void start() throws IOException {
        int port = 50082;

        server = ServerBuilder.forPort(port)
                .addService(this)
                .build()
                .start();
        System.out.println("SmartLight Server started, listening on " + port);

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
    // method for the Occupancy Sensor Device
    public StreamObserver<LightRequest> controlLights(StreamObserver<LightResponse> responseObserver) {
        return new StreamObserver<LightRequest>() {
            @Override
            public void onNext(LightRequest request) {
                System.out.println("Received request with number of people: " + request.getNumPeople());
                boolean hasPeople = request.getNumPeople() > 0;
                updateLightStatus(hasPeople, request.getNumPeople(), responseObserver);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in ControlLights: " + t.getMessage());
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                // Send final response when client finishes sending data
                responseObserver.onNext(LightResponse.newBuilder().setLightStatus(isLightOn).build());
                responseObserver.onCompleted();
            }


        };
    }

    /**
     * Updates the light status based on the presence of people.
     * Turn on the light immediately if people are detected (hasPeople = true).
     * Schedules to turn the light off after a delay if no people are detected.
     */
    private void updateLightStatus(boolean hasPeople, int numPeople, StreamObserver<LightResponse> responseObserver) {
        boolean previousStatus = isLightOn;
        if (hasPeople && !isLightOn) {
            isLightOn = true;
            System.out.println("Turning lights ON");
            cancelScheduledLightOff();
            responseObserver.onNext(LightResponse.newBuilder().setLightStatus(isLightOn).build());
        } else if (!hasPeople && isLightOn) {

            if (lightOffTask == null || lightOffTask.isDone() || lightOffTask.isCancelled()) {
                scheduleLightOff();
            }
        }

        LightResponse response = LightResponse.newBuilder()
                .setLightStatus(isLightOn)
                .setNumPeople(numPeople)
                .build();

        responseObserver.onNext(response);

    }

    private void scheduleLightOff() {
        if (lightOffTask != null && !lightOffTask.isDone()) {
            lightOffTask.cancel(true);
        }

        lightOffTask = scheduler.schedule(() -> {
            isLightOn = false;
            System.out.println("Lights turned OFF after delay");

        }, 5, TimeUnit.SECONDS);
    }

    private void cancelScheduledLightOff() {
        if (lightOffTask != null && !lightOffTask.isDone()) {
            lightOffTask.cancel(false);
            lightOffTask = null;
        }
    }

    @Override
    // method for the GUI part
    public void streamNumberOfPeople(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        occupancyReadings.forEach(reading -> {
            LightResponse response = LightResponse.newBuilder()
                    .setNumPeople(reading.getNumPeople())
                    .setLightStatus(reading.getNumPeople() > 0)
                    .build();
            responseObserver.onNext(response);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        responseObserver.onCompleted();
    }


    private void registerToConsul() {

        System.out.println("Registering server to Consul...");

        // Load Consul configuration from smart-light.properties file
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/smart-light.properties")) {
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
        final SmartLightServiceImpl server = new SmartLightServiceImpl();
        server.start();
        server.server.awaitTermination();
    }

}//class
