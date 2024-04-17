package SensorDevice;

import com.example.grpc.smartoffices.heating.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
//import com.filereader.EnvironmentReading;
//import com.filereader.EnvironmentCSVReader;


public class EnvironmentSensorDevice {

    private final ManagedChannel channel;
    private final SmartHeatingGrpc.SmartHeatingStub asyncStub; // For streaming calls
    private final SmartHeatingGrpc.SmartHeatingBlockingStub blockingStub; // For unary calls


    public EnvironmentSensorDevice(String consulHost, int consulPort, String consulServiceName) {
        this.channel = ManagedChannelBuilder.forAddress(consulHost, consulPort).usePlaintext().build();
        this.asyncStub = SmartHeatingGrpc.newStub(channel);
        this.blockingStub = SmartHeatingGrpc.newBlockingStub(channel);
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
    public void updateSettings(double temperature, double humidity, double airPollution) {
        HeatingRequest request = HeatingRequest.newBuilder()
                .setTemperature(temperature)
                .setHumidity(humidity)
                .setAirPollution(airPollution)
                .build();

        HeatingResponse response = blockingStub.updateSettings(request);
        System.out.println("Heating status: " + (response.getHeatingStatus() ? "ON" : "OFF"));
    }


    // Monitors temperature and controls heating in streaming fashion
    public void monitorTemperature() {
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
    }



    public static void main(String[] args) {
        // TODO: Replace with actual Consul service details
        String consulHost = "localhost";
        int consulPort = 8500;
        String consulServiceName = "smart-heating-service";

        EnvironmentSensorDevice device = new EnvironmentSensorDevice(consulHost, consulPort, consulServiceName);
        device.updateSettings(21.0, 40.0, 30.0); // Example data
    }
}
