package Clients;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.example.grpc.smartoffices.window.SmartWindowGrpc;
import com.example.grpc.smartoffices.window.WindowRequest;
import com.example.grpc.smartoffices.window.WindowResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class WindSensor {
    private final ConsulClient consulClient;
    private final String consulServiceName;

    public WindSensor(String consulHost, int consulPort, String consulServiceName) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        this.consulServiceName = consulServiceName;
    }

    public void controlWindow() {
        // Service discovery via Consul
        List<HealthService> services = consulClient.getHealthServices(consulServiceName, true, null).getValue();
        if (services.isEmpty()) {
            System.err.println("No healthy instances found.");
            return;
        }
        HealthService service = services.get(0); // Picking first instance for simplicity

        String host = service.getService().getAddress();
        int port = service.getService().getPort();

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        SmartWindowGrpc.SmartWindowStub stub = SmartWindowGrpc.newStub(channel);

        StreamObserver<WindowResponse> responseObserver = new StreamObserver<WindowResponse>() {
            @Override
            public void onNext(WindowResponse windowResponse) {
                System.out.println("Window status: " + (windowResponse.getWindowStatus() ? "Closed" : "Open"));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in WindSensor: " + t);
            }

            @Override
            public void onCompleted() {
                channel.shutdown();
            }
        };

        // Assuming we have a method that provides wind data
        // For the sake of this example, let's simulate some wind data
        double windSpeed = 5.0; // km/h
        double windTemperature = 9.0; // Celsius
        String windDirection = "North";

        StreamObserver<WindowRequest> requestObserver = stub.controlWindows(responseObserver);
        try {
            WindowRequest request = WindowRequest.newBuilder()
                    .setWindSpeed(windSpeed)
                    .setWindTemperature(windTemperature)
                    .setWindDirection(windDirection)
                    .build();
            requestObserver.onNext(request);
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();
    }

    public static void main(String[] args) {
        String consulHost = "localhost";
        int consulPort = 8500;
        String serviceName = "smart-window-service";

        WindSensor client = new WindSensor(consulHost, consulPort, serviceName);
        client.controlWindow();
    }
}

