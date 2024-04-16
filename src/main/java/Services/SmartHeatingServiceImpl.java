package Services;

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


public class SmartHeatingServiceImpl extends SmartHeatingImplBase {
    private Server server;
    private boolean isHeatingOn = false;//Track heating state

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
//        // Logic to process the request
//        HeatingResponse response = HeatingResponse.newBuilder()
//                .setHeatingStatus(req.getTemperature() < 19.0) // Simplified example logic
//                .build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
        double temp = req.getTemperature();
        boolean shouldHeat = temp < 19;
        boolean shouldStop = temp > 23;

        if (shouldHeat) isHeatingOn = true;
        if (shouldStop) isHeatingOn = false;

        HeatingResponse response = HeatingResponse.newBuilder()
                .setHeatingStatus(isHeatingOn)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorTemperature(HeatingRequest req, StreamObserver<HeatingResponse> responseObserver) {
//        // Logic to process the request and stream responses
//        // For example purposes, we're just sending one response
//        HeatingResponse response = HeatingResponse.newBuilder()
//                .setHeatingStatus(req.getTemperature() < 19.0 || req.getTemperature() > 23.0)
//                .build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
        try {
            for (int i = 0; i < 10; i++) { // Simulate continuous monitoring
                updateSettings(req, responseObserver);
                Thread.sleep(5000); // Simulate delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            responseObserver.onError(e);
        } finally {
            responseObserver.onCompleted();
        }

    }

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
        server.server.awaitTermination();
    }
}

