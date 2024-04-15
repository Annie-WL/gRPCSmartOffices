package Services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.light.LightRequest;
import com.example.grpc.smartoffices.light.LightResponse;
import com.example.grpc.smartoffices.light.SmartLightGrpc.SmartLightImplBase;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

public class SmartLightServiceImpl extends SmartLightImplBase {
    private Server server;

    private void start() throws IOException {
        int port = 55082; // Ensure different port for each service
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
    public StreamObserver<LightRequest> controlLights(StreamObserver<LightResponse> responseObserver) {
        return new StreamObserver<LightRequest>() {
            boolean lightOn = false;

            @Override
            public void onNext(LightRequest request) {
                lightOn = request.getNumPeople() > 0;
                LightResponse response = LightResponse.newBuilder().setLightStatus(lightOn).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Stream error in SmartLightServiceImpl: " + t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

//    private void registerToConsul(String serviceName, int servicePort, String healthCheckInterval) {
//        try {
//            String hostAddress = InetAddress.getLocalHost().getHostAddress();
//            ConsulClient consulClient = new ConsulClient("localhost", 8500);
//
//            NewService newService = new NewService();
//            newService.setId(serviceName + "-" + servicePort);
//            newService.setName(serviceName);
//            newService.setPort(servicePort);
//            newService.setAddress(hostAddress);
//
//            NewService.Check serviceCheck = new NewService.Check();
//            serviceCheck.setHttp("http://" + hostAddress + ":" + servicePort + "/health");
//            serviceCheck.setInterval(healthCheckInterval);
//            newService.setCheck(serviceCheck);
//
//            consulClient.agentServiceRegister(newService);
//            System.out.println("Service registered with Consul. Service name: " + serviceName + ", Port: " + servicePort);
//        } catch (Exception e) {
//            System.err.println("Could not register service with Consul: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }

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
}
