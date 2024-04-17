package SensorDevice;

import com.example.grpc.smartoffices.heating.HeatingRequest;
import com.example.grpc.smartoffices.heating.HeatingResponse;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import com.dataReader.EnvironmentCSVReader;
import com.dataReader.EnvironmentReading;

public class EnvironmentSensorDevice {

    private final ManagedChannel channel;
    private final SmartHeatingGrpc.SmartHeatingStub asyncStub; // For streaming calls
    private final SmartHeatingGrpc.SmartHeatingBlockingStub blockingStub; // For unary calls
    private final List<EnvironmentReading> environmentReadings;

    public EnvironmentSensorDevice(String consulHost, int consulPort) {
        this.channel = ManagedChannelBuilder.forAddress(consulHost, consulPort).usePlaintext().build();
        this.asyncStub = SmartHeatingGrpc.newStub(channel);
        this.blockingStub = SmartHeatingGrpc.newBlockingStub(channel);
        this.environmentReadings = EnvironmentCSVReader.loadEnvironmentData();
    }

    // Fetches heating service details from Consul and returns the first healthy instance.
//    private static HealthService getHealthyService(String consulServiceName) {
//        ConsulClient consulClient = new ConsulClient("localhost", 8500);
//        // Lookup service details from Consul
//        List<HealthService> healthServices = consulClient.getHealthServices(consulServiceName, true, null).getValue();
//        return healthServices.isEmpty() ? null : healthServices.get(0);
//    }
        // debug:
//        if (healthServices.isEmpty()) {
//            System.err.println("No healthy instances of " + consulServiceName + " found in Consul.");
//            return;
//        }
//        // Pick the first healthy instance (you can implement a load balancing strategy here)
//        HealthService healthService = healthServices.get(0);
//
//        // Debug output for service details
//        System.out.println("Service details from Consul:");
//        System.out.println("Service ID: " + healthService.getService().getId());
//        System.out.println("Service Name: " + healthService.getService().getService());
//        System.out.println("Service Address: " + healthService.getService().getAddress());
//        System.out.println("Service Port: " + healthService.getService().getPort());
//
//        // Extract host and port from the service details
//        String serverHost = healthService.getService().getAddress();
//        int serverPort = healthService.getService().getPort();
//
//        // Debug output for extracted host and port
//        System.out.println("Server host: " + serverHost);
//        System.out.println("Server port: " + serverPort);


    // Makes unary request to update settings based on sensor data
//    public void updateSettings(double temperature, double humidity, double airPollution) {
//        HeatingRequest request = HeatingRequest.newBuilder()
//                .setTemperature(temperature)
//                .setHumidity(humidity)
//                .setAirPollution(airPollution)
//                .build();
//
//        HeatingResponse response = blockingStub.updateSettings(request);
//        System.out.println("Heating status: " + (response.getHeatingStatus() ? "ON" : "OFF"));
//    }
//
//
//    // Monitors temperature and controls heating in streaming fashion
//    public void monitorTemperature() {
//        StreamObserver<HeatingResponse> responseObserver = new StreamObserver<HeatingResponse>() {
//            @Override
//            public void onNext(HeatingResponse value) {
//                System.out.println("Received heating status update: " + (value.getHeatingStatus() ? "ON" : "OFF"));
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.err.println("Error in monitoring temperature: " + t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Completed monitoring temperature");
//            }
//        };
//    }

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
            public void onNext(HeatingResponse value) {
                System.out.println("Received heating status update: " + (value.getHeatingStatus() ? "ON" : "OFF"));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in monitoring temperature: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed monitoring temperature");
            }
        };

        // Call the RPC method
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
        try {
            TimeUnit.MINUTES.sleep(1); // Wait for updates, adjust the time as needed
        } catch (InterruptedException e) {
            System.err.println("Interrupted while waiting for updates: " + e.getMessage());
        }

        // Don't shut down immediately since server-side streaming is asynchronous
        // device.channel.shutdownNow();
    }
}
