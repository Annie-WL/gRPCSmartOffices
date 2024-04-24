package com.project.Services;

import com.project.grpc.smartoffices.light.SmartLightGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.project.grpc.smartoffices.light.LightRequest;
import com.project.grpc.smartoffices.light.LightResponse;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
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



    private void start() throws IOException {
        int port = 50082; // Unique port for the Light service

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
//            System.err.println("*** server shut down");
        }
    }


    @Override
    public StreamObserver<LightRequest> controlLights(StreamObserver<LightResponse> responseObserver) {
        return new StreamObserver<LightRequest>() {
            @Override
            public void onNext(LightRequest request) {
                boolean hasPeople = request.getNumPeople() > 0;
                updateLightStatus(hasPeople, responseObserver);
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


/////////要改！！
//    //////////////////
//    private void updateLightStatus() {
//        if (isLightOn) {
//            System.out.println("Turning lights ON");
//            scheduler.shutdownNow(); // Stop any ongoing off delay
//        } else {
//            System.out.println("Setting up to turn lights OFF after 30 seconds");
//            scheduler.schedule(() -> {
//                isLightOn = false;
//                System.out.println("Lights turned OFF after delay");
//            }, 30, TimeUnit.SECONDS);
//        }
//        // Consider writing the state to a CSV file or another persistence method here
//    }

    /**
     * Updates the light status based on the presence of people.
     * Turns the light on immediately if people are detected (hasPeople = true).
     * Schedules to turn the light off after a delay if no people are detected.
     * Cancels any pending off task if people are detected before the delay expires.
     *
     * @param hasPeople boolean indicating if people are currently detected in the room
     */
//    private void updateLightStatus(boolean hasPeople) {
//        boolean previousStatus = isLightOn;
//        if (hasPeople) {
//            if (!isLightOn) {
//                isLightOn = true;
//                System.out.println("Turning lights ON");
//                if (lightOffTask != null && !lightOffTask.isDone()) {
//                    lightOffTask.cancel(false);
//                }
//            }
//        } else {
//            if (isLightOn && (lightOffTask == null || lightOffTask.isDone() || lightOffTask.isCancelled())) {
//                System.out.println("Setting up to turn lights OFF after 30 seconds");
//                lightOffTask = scheduler.schedule(() -> {
//                    isLightOn = false;
//                    System.out.println("Lights turned OFF after delay");
//                }, 30, TimeUnit.SECONDS);
//            }
//        }
//    }

    private void updateLightStatus(boolean hasPeople, StreamObserver<LightResponse> responseObserver) {
        boolean previousStatus = isLightOn;

        if (hasPeople) {
            // If there are people in the room, turn the lights on.
            if (!isLightOn) {
                isLightOn = true;
                System.out.println("Turning lights ON");
                // If there was a task scheduled to turn off the lights, cancel it.
                if (lightOffTask != null && !lightOffTask.isDone()) {
                    lightOffTask.cancel(false);
                }
                // Notify the client that the lights are now ON.
                responseObserver.onNext(LightResponse.newBuilder().setLightStatus(isLightOn).build());
            }
        } else {
            // If the room is empty, schedule to turn the lights off after 30 seconds.
            if (isLightOn && (lightOffTask == null || lightOffTask.isDone() || lightOffTask.isCancelled())) {
                System.out.println("Setting up to turn lights OFF after 30 seconds");
                lightOffTask = scheduler.schedule(() -> {
                    isLightOn = false;
                    System.out.println("Lights turned OFF after delay");
                    // Notify the client that the lights are now OFF.
                    responseObserver.onNext(LightResponse.newBuilder().setLightStatus(isLightOn).build());
                }, 30, TimeUnit.SECONDS);
            }
        }

        // If the light status has changed, send an update to the client.
        if (previousStatus != isLightOn) {
            responseObserver.onNext(LightResponse.newBuilder().setLightStatus(isLightOn).build());
        }
    }


    ////
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
        final SmartLightServiceImpl server = new SmartLightServiceImpl();
        server.start();
        server.server.awaitTermination();
    }

}//class
