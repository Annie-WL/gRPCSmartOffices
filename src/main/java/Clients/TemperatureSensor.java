package Clients;


import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import com.example.grpc.smartoffices.heating.TemperatureResponse;
import com.example.grpc.smartoffices.heating.TemperatureSettingRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TemperatureSensor {
    private final ManagedChannel channel;
    private final SmartHeatingGrpc.SmartHeatingStub asyncStub;

    public TemperatureSensor(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        asyncStub = SmartHeatingGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void sendTemperatureData(String area) {
        StreamObserver<TemperatureSettingRequest> requestObserver = asyncStub.monitorTemperature(new StreamObserver<TemperatureResponse>() {
            @Override
            public void onNext(TemperatureResponse response) {
                System.out.println("Server response: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Failed to send temperature data: " + t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished sending temperature data.");
            }
        });

        try {
            for (int temp = 18; temp <= 24; temp++) {
                System.out.println("Sending temperature: " + temp + "°C for area: " + area);
                TemperatureSettingRequest request = TemperatureSettingRequest.newBuilder()
                        .setArea(area)
                        .build();
                requestObserver.onNext(request);
                Thread.sleep(1000); // Simulate delay in temperature data
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            requestObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TemperatureSensor client = new TemperatureSensor("localhost", 50052);
        try {
            client.sendTemperatureData("Office 1");
        } finally {
            client.shutdown();
        }
    }
}
