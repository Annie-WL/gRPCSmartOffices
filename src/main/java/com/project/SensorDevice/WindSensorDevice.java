package com.project.SensorDevice;

import com.project.grpc.smartoffices.window.SmartWindowGrpc;
import com.project.grpc.smartoffices.window.WindowRequest;
import com.project.grpc.smartoffices.window.WindowResponse;

import com.project.dataReader.WindReading;
import com.project.dataReader.WindCSVReader;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class WindSensorDevice {

    private final ManagedChannel channel;
    private final SmartWindowGrpc.SmartWindowStub asyncStub; // For streaming calls
    private final List<WindReading> windReadings;

    public WindSensorDevice(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.asyncStub = SmartWindowGrpc.newStub(channel);
        this.windReadings = WindCSVReader.loadWindData(); // load wind data from the CSV
    }

    public void startDataStreaming() {
        StreamObserver<WindowRequest> requestObserver = asyncStub.controlWindows(new StreamObserver<WindowResponse>() {
            @Override
            public void onNext(WindowResponse response) {
                System.out.println("Response from server: Window is " + (response.getWindowStatus() ? "closed." : "open."));
                System.out.println("Wind Speed is: " + (response.getWindSpeed()) + " km/h");

            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error from server: " + t.getMessage());
                channel.shutdownNow();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending responses.");
                channel.shutdownNow();
            }
        });

        // Sending data to the server
        try {
            for (WindReading reading : windReadings) {
                WindowRequest request = WindowRequest.newBuilder()
                        .setWindDirection(reading.getWindDirection())
                        .setWindSpeed(reading.getWindSpeed())
                        .setWindTemperature(reading.getWindTemperature())
                        .build();
                requestObserver.onNext(request);
                Thread.sleep(15000);  // Simulate time delay between sends
            }
            requestObserver.onCompleted(); // Signal completion after all data is sent
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            requestObserver.onError(e);  // Signal error if interrupted
        }
    }

    public static void main(String[] args) {
        String consulHost = "localhost";
        int consulPort = 50084;
        WindSensorDevice device = new WindSensorDevice(consulHost, consulPort);
        device.startDataStreaming();
    }

}//class
