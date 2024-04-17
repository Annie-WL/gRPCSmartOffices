package Services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.window.WindowRequest;
import com.example.grpc.smartoffices.window.WindowResponse;
import com.example.grpc.smartoffices.window.SmartWindowGrpc.SmartWindowImplBase;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;


public class SmartWindowServiceImpl extends SmartWindowImplBase {
    private Server server;

    private boolean isWindowOpen = true; // Track Window state, assuming window starts open


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