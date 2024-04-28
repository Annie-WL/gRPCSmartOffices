package com.project.SensorDevice;

import com.project.dataReader.OccupancyCSVReader;
import com.project.dataReader.OccupancyReading;
import com.project.grpc.smartoffices.light.LightRequest;
import com.project.grpc.smartoffices.light.LightResponse;
import com.project.grpc.smartoffices.light.SmartLightGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static com.project.dataReader.OccupancyCSVReader.occupancyReadings;

public class OccupancySensorDevice {
    private final ManagedChannel channel;
    private final SmartLightGrpc.SmartLightStub asyncStub;


    public OccupancySensorDevice(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.asyncStub = SmartLightGrpc.newStub(channel);
        ArrayList<OccupancyReading> occupancyReadings = OccupancyCSVReader.loadOccupancyData();
    }

    // Method to start sending occupancy data
    public void startSendingOccupancyData() {
        StreamObserver<LightRequest> requestObserver = asyncStub.controlLights(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse value) {
                System.out.println("Light status updated: " + (value.getLightStatus() ? "ON." : "OFF.") + "\nWith " + value.getNumPeople() + " people.");
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in sending occupancy data: " + t.getMessage());
                shutdownChannel();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending responses.");
                shutdownChannel();
            }
        });

        // Stream occupancy data
        try {
            for (OccupancyReading reading : occupancyReadings) {
                LightRequest request = LightRequest.newBuilder()
                        .setNumPeople(reading.getNumPeople())
                        .build();
                requestObserver.onNext(request);
                TimeUnit.SECONDS.sleep(15); // Sleep for 15s before sending the next reading
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            requestObserver.onCompleted(); // Ensure to complete the stream
        }
    }//

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
        String consulHost = "localhost";
        int consulPort = 50082;
        String consulServiceName = "smart-light-service";

        OccupancySensorDevice device = new OccupancySensorDevice(consulHost, consulPort);
        device.startSendingOccupancyData();

        // Wait for input to stop
        System.out.println("Press 'Q' to stop");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equalsIgnoreCase("Q")) {
        }

        device.shutdownChannel();
        scanner.close();
    }
}