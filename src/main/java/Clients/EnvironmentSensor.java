package Clients;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import com.example.grpc.smartoffices.heating.HeatingRequest;
import com.example.grpc.smartoffices.heating.HeatingResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import com.filereader.EnvironmentReading;
import com.filereader.EnvironmentCSVReader;

import java.util.List;
import java.util.ArrayList;

public class EnvironmentSensor {
    private final ConsulClient consulClient;
    private final String consulServiceName;
    private final ArrayList<EnvironmentReading> environmentReadings;

    public EnvironmentSensor(String consulHost, int consulPort, String consulServiceName) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        this.consulServiceName = consulServiceName;
        this.environmentReadings = EnvironmentCSVReader.loadEnvironmentData();
    }

    public void updateHeatingSettings() {
        // Discover SmartHeating service through Consul
        List<HealthService> services = consulClient.getHealthServices(consulServiceName, true, null).getValue();
        if (services.isEmpty()) {
            System.err.println("No healthy instances found.");
            return;
        }
        HealthService service = services.get(0); // Picking first healthy instance for simplicity

        String host = service.getService().getAddress();
        int port = service.getService().getPort();

        // Create a channel to the SmartHeating service
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        // Blocking stub for making unary RPC calls
        SmartHeatingGrpc.SmartHeatingBlockingStub blockingStub = SmartHeatingGrpc.newBlockingStub(channel);

        // Use environmentReadings data instead of hardcoded values
        for (EnvironmentReading reading : environmentReadings) {
            HeatingRequest request = HeatingRequest.newBuilder()
                    .setTemperature(reading.getTemperature())
                    .setHumidity(reading.getHumidity())
                    .setAirPollution(reading.getAirPollution())
                    .build();

            HeatingResponse response = blockingStub.updateSettings(request);
            System.out.println("Heating status: " + (response.getHeatingStatus() ? "ON" : "OFF"));
        }

        // No need for a separate request object for monitoring unless you have specific requirements
//         monitorTemperature(channel, request);

        channel.shutdownNow(); // Use shutdownNow() to shutdown the channel immediately
    }



//        // Assuming we want to monitor temperature changes using server-side streaming
//        // Prepare the request for monitoring (could be the same as update settings)
//        HeatingRequest monitoringRequest = HeatingRequest.newBuilder()
//                .setTemperature(20.0)
//                .setHumidity(50.0)
//                .setAirPollution(10.0)
//                .build();

//        // Server-side streaming call
//        monitorTemperature(channel, monitoringRequest);
//
//        // Shutdown the channel when done
//        channel.shutdown();
//    }


    private void monitorTemperature(ManagedChannel channel, HeatingRequest request) {
        // Asynchronous stub for server-side streaming calls
        SmartHeatingGrpc.SmartHeatingStub asyncStub = SmartHeatingGrpc.newStub(channel);

        asyncStub.monitorTemperature(request, new StreamObserver<HeatingResponse>() {
            @Override
            public void onNext(HeatingResponse heatingResponse) {
                System.out.println("Received heating update. Status: " + (heatingResponse.getHeatingStatus() ? "ON" : "OFF"));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Stream error: " + t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished receiving temperature updates.");
            }
        });
    }

    public static void main(String[] args) {
        String consulHost = "localhost";
        int consulPort = 8500;
        String serviceName = "smart-heating-service";

        EnvironmentSensor client = new EnvironmentSensor(consulHost, consulPort, serviceName);
        client.updateHeatingSettings();
    }
}
