package com.project.Services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.heating.HeatingRequest;
import com.example.grpc.smartoffices.heating.HeatingResponse;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc.SmartHeatingImplBase;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class SmartHeatingServiceImpl extends SmartHeatingImplBase {
    private Server server;
    private final AtomicReference<Double> currentTemperature = new AtomicReference<>(20.0);
    private final AtomicBoolean heatingStatus = new AtomicBoolean(false);

    private void start() throws IOException {
        int port = 50083; // Unique port for the Heating service

        server = ServerBuilder.forPort(port)
                .addService(this)
                .build()
                .start();
        System.out.println("SmartHeating Server started, listening on " + port);

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
//            System.err.println("*** server shut down");
        }
    }

    @Override
    public void updateSettings(HeatingRequest req, StreamObserver<HeatingResponse> responseObserver) {
        try {
            double temp = req.getTemperature();
            boolean shouldTurnOn = shouldTurnHeatingOn(temp, heatingStatus.get());

            heatingStatus.set(shouldTurnOn);
            currentTemperature.set(temp); // Update the current temperature

            HeatingResponse response = HeatingResponse.newBuilder()
                    .setHeatingStatus(shouldTurnOn)
                    .setCurrentTemperature(temp)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Error processing request")
                    .withCause(e) // Optionally, you can pass the exception to the client
                    .asRuntimeException());
        }
    }

    private boolean shouldTurnHeatingOn(double temperature, boolean isCurrentlyOn) {
        final double LOWER_THRESHOLD = 19.0;
        final double UPPER_THRESHOLD = 23.0;

        if (temperature < LOWER_THRESHOLD) {
            return true; // Turn on heating if below lower threshold
        } else if (temperature > UPPER_THRESHOLD) {
            return false; // Turn off heating if above upper threshold
        }
        // If the temperature is within the range, maintain current state
        return isCurrentlyOn;
    }

    /////////////////////

    //////need to be modified!!改
    // 看孙哥是频，然后考虑 - 是否需要再proto中增加“double currentTemperature = 2; // Current temperature”

    ////////////////

    @Override
    public void monitorTemperature(HeatingRequest req, StreamObserver<HeatingResponse> responseObserver) {
        // This would need to be managed carefully to avoid concurrency issues,
        // especially if 'currentTemperature' and 'heatingStatus' are being updated elsewhere.
        try {
            while (!Thread.currentThread().isInterrupted()) {
                HeatingResponse response = HeatingResponse.newBuilder()
                        .setHeatingStatus(heatingStatus.get())
                        .setCurrentTemperature(currentTemperature.get())
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(15000); // Wait for the next update period
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Interrupted during temperature monitoring")
                    .withCause(e)
                    .asRuntimeException());
        }

        responseObserver.onCompleted();
    }



    ////////////////////
    private void registerToConsul() {

        System.out.println("Registering server to Consul...");

        // Load Consul configuration from smart-heating.properties file
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/smart-heating.properties")) {
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

//        // Set up HTTP check pointing to the HealthCheckServer
//        NewService.Check serviceCheck = new NewService.Check();
//        serviceCheck.setHttp("http://" + hostAddress + ":" + healthPort + "/health");
//        serviceCheck.setInterval(healthCheckInterval);
//        newService.setCheck(serviceCheck);

        // Register service with Consul
        consulClient.agentServiceRegister(newService);

        // Print registration success message
        System.out.println("Server registered to Consul successfully. Host: " + hostAddress);
    }



    public static void main(String[] args) throws IOException, InterruptedException {
        final SmartHeatingServiceImpl server = new SmartHeatingServiceImpl();
        server.start();
//        server.server.awaitTermination();
//        server.blockUntilShutdown();
        try {
            server.server.awaitTermination();
        } catch (InterruptedException e) {
            System.err.println("Server interrupted: " + e.getMessage());
        }

    }
}

