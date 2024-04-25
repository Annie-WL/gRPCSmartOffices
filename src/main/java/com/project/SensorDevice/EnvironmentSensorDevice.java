package com.project.SensorDevice;

import com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest;
import com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse;
import com.project.grpc.smartoffices.heating.TemperatureStreamRequest;
import com.project.grpc.smartoffices.heating.TemperatureStreamResponse;
import com.project.grpc.smartoffices.heating.SmartHeatingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EnvironmentSensorDevice {
        private final ManagedChannel channel;
        private final SmartHeatingGrpc.SmartHeatingBlockingStub blockingStub;
        private final SmartHeatingGrpc.SmartHeatingStub asyncStub;
        private final Random random = new Random();

        public EnvironmentSensorDevice(String host, int port) {
            this.channel = ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext()
                    .build();
            this.blockingStub = SmartHeatingGrpc.newBlockingStub(channel);
            this.asyncStub = SmartHeatingGrpc.newStub(channel);
        }

        public void shutdown() throws InterruptedException {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }

        public void adjustHeating() {
            double temperature = 10 + 15 * random.nextDouble();
            double humidity = 40 + 20 * random.nextDouble();
            double airPollution = 11 * random.nextDouble();

            HeatingAdjustmentRequest request = HeatingAdjustmentRequest.newBuilder()
                    .setTemperature(temperature)
                    .setHumidity(humidity)
                    .setAirPollution(airPollution)
                    .build();
            HeatingAdjustmentResponse response;
            try {
                response = blockingStub.adjustHeating(request);
                System.out.println("Server Response: " + response.getMessage());
            } catch (Exception e) {
                System.err.println("RPC failed: " + e.getMessage());
                return;
            }
        }

        public void streamTemperatureUpdates() {
            TemperatureStreamRequest request = TemperatureStreamRequest.newBuilder()
                    .setClientId("Client01")
                    .build();

            StreamObserver<TemperatureStreamResponse> responseObserver = new StreamObserver<TemperatureStreamResponse>() {
                @Override
                public void onNext(TemperatureStreamResponse response) {
                    String formattedTemperature = String.format("%.2f", response.getCurrentTemperature());

                    System.out.println("*Stream response: \n Temperature: " + formattedTemperature + "°C, " +
                            "\n Heating Status: " + response.getHeatingStatus() +
                            ".\n*Message: " + response.getMessage());
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

            asyncStub.streamTemperatureUpdates(request, responseObserver);
            try {
                // Await termination of the stream. This blocks forever typically in a real application.
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
            responseObserver.onCompleted(); // Complete the call properly
        }
        /////////




    public static void main(String[] args) throws InterruptedException {
        String consulHost = "localhost";
        int consulPort = 50083;
        String consulServiceName = "smart-heating-service";

        EnvironmentSensorDevice client = new EnvironmentSensorDevice(consulHost, consulPort);

        // Do not to shut down immediately since server-side streaming is asynchronous
        // device.channel.shutdownNow();
        try {
            client.adjustHeating();
            client.streamTemperatureUpdates();
        } finally {
            client.shutdown();
        }

    }
}
