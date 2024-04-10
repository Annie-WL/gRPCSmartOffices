package Clients;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.light.SmartLightServiceImpl.*;
import com.example.grpc.smartoffices.light.SmartLightsGrpc;
import com.example.grpc.smartoffices.light.LightRequest;
import com.example.grpc.smartoffices.light.LightResponse;

public class OccupancySensor {
    private final ManagedChannel channel;
    private final SmartLightsGrpc.SmartLightsBlockingStub blockingStub;
    private final SmartLightsGrpc.SmartLightsStub asyncStub;

    public OccupancySensor(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = SmartLightsGrpc.newBlockingStub(channel);
        asyncStub = SmartLightsGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void turnOn(String area) {
        LightRequest request = LightRequest.newBuilder().setArea(area).build();
        LightResponse response = blockingStub.turnOn(request);
        System.out.println("Response from server: " + response.getMessage());
    }

    public void turnOff(String area) {
        LightRequest request = LightRequest.newBuilder().setArea(area).build();
        LightResponse response = blockingStub.turnOff(request);
        System.out.println("Response from server: " + response.getMessage());
    }

    public void changeBrightness(String area, boolean increase) {
        LightRequest request = LightRequest.newBuilder().setArea(area).build();
        LightResponse response = increase ? blockingStub.brightnessUp(request) : blockingStub.brightnessDown(request);
        System.out.println("Response from server: " + response.getMessage());
    }

    public void streamStatus(String area) {
        LightRequest request = LightRequest.newBuilder().setArea(area).build();
        StreamObserver<LightResponse> responseObserver = new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse response) {
                System.out.println("Stream response from server: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Stream failed: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Stream completed.");
            }
        };
        asyncStub.streamLightStatus(request, responseObserver);
    }

    public static void main(String[] args) throws InterruptedException {
        OccupancySensor client = new OccupancySensor("localhost", 50051);
        try {
            client.turnOn("Office 1");
            Thread.sleep(1000); // Simulate time
            client.changeBrightness("Office 1", true);
            Thread.sleep(1000); // Simulate time
            client.streamStatus("Office 1");
            Thread.sleep(6000); // Wait for stream to complete
            client.turnOff("Office 1");
        } finally {
            client.shutdown();
        }
    }
}
