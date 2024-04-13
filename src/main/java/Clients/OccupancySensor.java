package Clients;


import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.example.grpc.smartoffices.light.SmartLightGrpc;
import com.example.grpc.smartoffices.light.LightRequest;
import com.example.grpc.smartoffices.light.LightResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class OccupancySensor {
    private final ConsulClient consulClient;
    private final String consulServiceName;

    public OccupancySensor(String consulHost, int consulPort, String consulServiceName) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        this.consulServiceName = consulServiceName;
    }

    public void reportOccupancy() throws InterruptedException {
        // Discover SmartLight service through Consul
        List<HealthService> services = consulClient.getHealthServices(consulServiceName, true, null).getValue();
        if (services.isEmpty()) {
            System.err.println("No healthy instances found.");
            return;
        }
        HealthService service = services.get(0); // Picking first healthy instance for simplicity

        String host = service.getService().getAddress();
        int port = service.getService().getPort();

        // Create a channel to the SmartLight service
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        // Asynchronous stub for client-side streaming RPC calls
        SmartLightGrpc.SmartLightStub asyncStub = SmartLightGrpc.newStub(channel);

        CountDownLatch finishLatch = new CountDownLatch(1);

        StreamObserver<LightRequest> requestObserver = asyncStub.controlLights(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse lightResponse) {
                System.out.println("Light status changed: " + (lightResponse.getLightStatus() ? "ON" : "OFF"));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Report Occupancy Failed: " + t);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished reporting occupancy status.");
                finishLatch.countDown();
            }
        });

        try {
            // Here you would normally get this data from sensors, but we'll simulate it
            LightRequest request = LightRequest.newBuilder().setNumPeople(3).build();
            requestObserver.onNext(request);

            // Mark the end of requests
            requestObserver.onCompleted();

            // Receiving happens asynchronously, so wait for the finishLatch
            if (!finishLatch.await(1, TimeUnit.MINUTES)) {
                System.err.println("Occupancy report cannot finish within 1 minute");
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        } finally {
            // Shutdown the channel when done
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

    public static void main(String[] args) {
        String consulHost = "localhost";
        int consulPort = 8500;
        String serviceName = "smart-light-service";

        OccupancySensor client = new OccupancySensor(consulHost, consulPort, serviceName);
        try {
            client.reportOccupancy();
        } catch (InterruptedException e) {
            System.err.println("Interrupted: " + e.getMessage());
        }
    }
}

