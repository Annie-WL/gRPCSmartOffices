package com.project.SensorDevice;

import com.example.grpc.smartoffices.heating.HeatingRequest;
import com.example.grpc.smartoffices.heating.HeatingResponse;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import com.project.dataReader.EnvironmentCSVReader;
import com.project.dataReader.EnvironmentReading;

public class EnvironmentSensorDevice {

    private final ManagedChannel channel;
    private final SmartHeatingGrpc.SmartHeatingStub asyncStub; // For streaming calls
    private final SmartHeatingGrpc.SmartHeatingBlockingStub blockingStub; // For unary calls
    private final List<EnvironmentReading> environmentReadings;

    public EnvironmentSensorDevice(String consulHost, int consulPort) {
        int smartHeatingServicePort = 50083;

        this.channel = ManagedChannelBuilder.forAddress(consulHost, consulPort).usePlaintext().build();
        this.asyncStub = SmartHeatingGrpc.newStub(channel);
        this.blockingStub = SmartHeatingGrpc.newBlockingStub(channel);
        this.environmentReadings = EnvironmentCSVReader.loadEnvironmentData();
    }


////////////////////
    // Method to send environmental data and start receiving heating updates
    public void monitorTemperature(EnvironmentReading reading) {
        HeatingRequest request = HeatingRequest.newBuilder()
                .setTemperature(reading.getTemperature())
                .setHumidity(reading.getHumidity())
                .setAirPollution(reading.getAirPollution())
                .build();

        StreamObserver<HeatingResponse> responseObserver = new StreamObserver<HeatingResponse>() {
            @Override
            public void onNext(HeatingResponse heatingResponse) {
                System.out.println("Received heating status update: " + (heatingResponse.getHeatingStatus() ? "ON" : "OFF"));
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in monitoring temperature: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed monitoring temperature");
                channel.shutdownNow(); // Shut down the channel after receiving all responses
            }
        };

        // Call the RPC method with the single request and the response observer
        asyncStub.monitorTemperature(request, responseObserver);
    }




    public static void main(String[] args) {
        // TODO: Replace with actual Consul service details
        String consulHost = "localhost";
        int consulPort = 8500;
        String consulServiceName = "smart-heating-service";

        EnvironmentSensorDevice device = new EnvironmentSensorDevice(consulHost, consulPort);
        List<EnvironmentReading> readings = EnvironmentCSVReader.loadEnvironmentData();

        // Assuming you want to monitor the temperature based on the first reading for simplicity
        if (!readings.isEmpty()) {
            device.monitorTemperature(readings.get(0));
        }

        // Keep the application running to receive stream updates
        // Monitor temperature based on all readings
        for (EnvironmentReading reading : readings) {
            device.monitorTemperature(reading);
            try {
                TimeUnit.SECONDS.sleep(15); // Wait for 15 seconds before sending the next reading
            } catch (InterruptedException e) {
                System.err.println("Interrupted while waiting to send the next reading: " + e.getMessage());
                Thread.currentThread().interrupt();
                break;
            }
        }

        // Do not to shut down immediately since server-side streaming is asynchronous
        // device.channel.shutdownNow();


    }
}
