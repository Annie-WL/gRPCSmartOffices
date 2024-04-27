package com.project.Services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import com.project.grpc.smartoffices.heating.SmartHeatingGrpc.SmartHeatingImplBase;
import com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest;
import com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse;
import com.project.grpc.smartoffices.heating.TemperatureStreamRequest;
import com.project.grpc.smartoffices.heating.TemperatureStreamResponse;


public class SmartHeatingServiceImpl extends SmartHeatingImplBase {
    private Server server;
//    private final AtomicReference<Double> currentTemperature = new AtomicReference<>(20.0);
    private AtomicBoolean heatingStatus = new AtomicBoolean(false);

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
    public void adjustHeating(HeatingAdjustmentRequest request, StreamObserver<HeatingAdjustmentResponse> responseObserver) {
        try {
            double temperature = request.getTemperature();
            boolean currentStatus = heatingStatus.get();
            String message = "Hello! This is a unary response from the server";

            if (temperature < 19.0 && !currentStatus) {
                heatingStatus.set(true); // Turn on the heating
            } else if (temperature > 23.0 && currentStatus) {
                heatingStatus.set(false); // Turn off the heating
            }

            HeatingAdjustmentResponse response = HeatingAdjustmentResponse.newBuilder()
                    .setHeatingStatus(heatingStatus.get())
                    .setMessage(message) // Add the message to the response
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Error processing request")
                    .withCause(e)
                    .asRuntimeException());
        }
    }


    @Override
    public void streamTemperatureUpdates(TemperatureStreamRequest request, StreamObserver<TemperatureStreamResponse> responseObserver) {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                double temperature = generateRandomTemperature();
                double humidity = generateRandomHumidity();
                double airPollution = generateRandomAirPollution();

                String message = "This is a message from the server. Current time: " + LocalDateTime.now();

                // Decide the heating status based on temperature
                boolean currentStatus = temperature < 19.0; // Heating is ON if temperature is below 19°C

                // Update the AtomicBoolean heatingStatus
                heatingStatus.set(currentStatus);

                TemperatureStreamResponse response = TemperatureStreamResponse.newBuilder()
                        .setCurrentTemperature(temperature)
                        .setHeatingStatus(heatingStatus.get())
                        .setMessage(message)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(15000); // Simulate data stream delay
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
    ////////////////
    private double generateRandomTemperature() {
        Random randomTemp = new Random();
        double low = 10.0;
        double high = 25.0;
        double result = low + (high - low) * randomTemp.nextDouble();
        return result;
    }

    private double generateRandomHumidity() {
        Random randomTemp = new Random();
        double low = 40.0;
        double high = 60.0;
        double result = low + (high - low) * randomTemp.nextDouble();
        return result;
    }

    private double generateRandomAirPollution() {
        Random randomTemp = new Random();
        double low = 0.0;
        double high = 11.0;
        double result = low + (high - low) * randomTemp.nextDouble();
        return result;
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

