package SensorDevice;

import com.dataReader.OccupancyCSVReader;
import com.dataReader.OccupancyReading;
import com.example.grpc.smartoffices.light.LightRequest;
import com.example.grpc.smartoffices.light.LightResponse;
import com.example.grpc.smartoffices.light.SmartLightGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;


public class OccupancySensorDevice {
    private final ManagedChannel channel;
    private final SmartLightGrpc.SmartLightStub asyncStub;

    public OccupancySensorDevice(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        asyncStub = SmartLightGrpc.newStub(channel);
    }

    // Method to start sending occupancy data
    public void startSendingOccupancyData() {
        List<OccupancyReading> occupancyReadings = OccupancyCSVReader.loadOccupancyData();
        StreamObserver<LightRequest> requestObserver = asyncStub.controlLights(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse value) {
                System.out.println("Light status updated: " + (value.getLightStatus() ? "ON" : "OFF"));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in sending occupancy data: " + t.getMessage());
                shutdownChannel();
            }

            @Override
            public void onCompleted() {
                System.out.println("Stream completed.");
                shutdownChannel();
            }
        });

        // Stream occupancy data
        for (OccupancyReading reading : occupancyReadings) {
            LightRequest request = LightRequest.newBuilder()
                    .setNumPeople(reading.getNumPeople())
                    .build();
            requestObserver.onNext(request);
            // Sleep is not necessary here unless you want to mimic real-time streaming
        }
        requestObserver.onCompleted();  // Complete the stream
    }


    private void shutdownChannel() {
        try {
            if (!channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)) {
                System.err.println("Channel did not terminate cleanly within 5 seconds. Forcing shutdown.");
                channel.shutdownNow();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // TODO: Replace with actual Consul service details
        String consulHost = "localhost";
        int consulPort = 8500;
        String consulServiceName = "smart-light-service";

        OccupancySensorDevice device = new OccupancySensorDevice(consulHost, consulPort);
        device.startSendingOccupancyData(); // Example data
    }
}