package Services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.heating.HeatingRequest;
import com.example.grpc.smartoffices.heating.HeatingResponse;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc.SmartHeatingImplBase;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.IOException;
import java.net.InetAddress;

public class SmartHeatingServiceImpl extends SmartHeatingImplBase {
    private Server server;

    private void start() throws IOException {
        int port = 50053; // Unique port for the Heating service
        server = ServerBuilder.forPort(port)
                .addService(this)
                .build()
                .start();
        System.out.println("SmartHeating Server started, listening on " + port);

        registerToConsul("smart-heating-service", port, "10s");

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
    public void updateSettings(HeatingRequest req, StreamObserver<HeatingResponse> responseObserver) {
        // Logic to process the request
        HeatingResponse response = HeatingResponse.newBuilder()
                .setHeatingStatus(req.getTemperature() < 19.0) // Simplified example logic
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorTemperature(HeatingRequest req, StreamObserver<HeatingResponse> responseObserver) {
        // Logic to process the request and stream responses
        // For example purposes, we're just sending one response
        HeatingResponse response = HeatingResponse.newBuilder()
                .setHeatingStatus(req.getTemperature() < 19.0 || req.getTemperature() > 23.0)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void registerToConsul(String serviceName, int servicePort, String healthCheckInterval) {
        try {
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            ConsulClient consulClient = new ConsulClient("localhost", 8500);

            NewService newService = new NewService();
            newService.setId(serviceName + "-" + servicePort);
            newService.setName(serviceName);
            newService.setPort(servicePort);
            newService.setAddress(hostAddress);

            NewService.Check serviceCheck = new NewService.Check();
            serviceCheck.setHttp("http://" + hostAddress + ":" + servicePort + "/health");
            serviceCheck.setInterval(healthCheckInterval);
            newService.setCheck(serviceCheck);

            consulClient.agentServiceRegister(newService);
            System.out.println("Service registered with Consul. Service name: " + serviceName + ", Port: " + servicePort);
        } catch (Exception e) {
            System.err.println("Could not register service with Consul: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final SmartHeatingServiceImpl server = new SmartHeatingServiceImpl();
        server.start();
        server.server.awaitTermination();
    }
}

