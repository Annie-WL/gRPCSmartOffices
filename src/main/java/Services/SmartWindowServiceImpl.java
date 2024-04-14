package Services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.window.WindowRequest;
import com.example.grpc.smartoffices.window.WindowResponse;
import com.example.grpc.smartoffices.window.SmartWindowGrpc.SmartWindowImplBase;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.IOException;
import java.net.InetAddress;


public class SmartWindowServiceImpl extends SmartWindowImplBase {
    private Server server;

    private void start() throws IOException {
        int port = 55054; // Unique port for the Window service
        server = ServerBuilder.forPort(port)
                .addService(this)
                .build()
                .start();
        System.out.println("SmartWindow Server started, listening on " + port);

        registerToConsul("smart-window-service", port, "10s");

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
    public StreamObserver<WindowRequest> controlWindows(StreamObserver<WindowResponse> responseObserver) {
        return new StreamObserver<WindowRequest>() {
            boolean windowClosed = false;

            @Override
            public void onNext(WindowRequest request) {
                // Logic to determine if the window should be closed
                windowClosed = request.getWindSpeed() > 4.8 || request.getWindTemperature() < 10.0;
                WindowResponse response = WindowResponse.newBuilder()
                        .setWindowStatus(windowClosed)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Stream error in SmartWindowServiceImpl: " + t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
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
        final SmartWindowServiceImpl server = new SmartWindowServiceImpl();
        server.start();
        server.server.awaitTermination();
    }
}
