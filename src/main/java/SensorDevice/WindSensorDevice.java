package SensorDevice;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import com.example.grpc.smartoffices.window.SmartWindowGrpc;
import com.example.grpc.smartoffices.window.WindowRequest;
import com.example.grpc.smartoffices.window.WindowResponse;

import com.dataReader.WindReading;
import com.dataReader.WindCSVReader;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WindSensorDevice {

    private final ManagedChannel channel;
    private final SmartWindowGrpc.SmartWindowStub asyncStub; // For streaming calls
    private final List<WindReading> windReadings;

    public WindSensorDevice(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.asyncStub = SmartWindowGrpc.newStub(channel);
        this.windReadings = WindCSVReader.loadWindData(); // load wind data from the CSV
    }

    public void sendWindData() {
        StreamObserver<WindowResponse> responseObserver = createResponseObserver();
        StreamObserver<WindowRequest> requestObserver = asyncStub.controlWindows(responseObserver);

        try {
            // Send each wind reading as a request to the server
            for (WindReading reading : windReadings) {
                WindowRequest request = WindowRequest.newBuilder()
                        .setWindDirection(reading.getWindDirection())
                        .setWindSpeed(reading.getWindSpeed())
                        .setWindTemperature(reading.getWindTemperature())
                        .build();
                requestObserver.onNext(request);
            }
            requestObserver.onCompleted();
        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }
    }

    private StreamObserver<WindowResponse> createResponseObserver() {
        return new StreamObserver<WindowResponse>() {
            @Override
            public void onNext(WindowResponse response) {
                System.out.println("Response from server: Window is " + (response.getWindowStatus() ? "closed" : "open"));
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error from server: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Data stream completed.");
                try {
                    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    System.err.println("Channel did not terminate correctly.");
                }
            }
        };
    }



    public static void main(String[] args) throws InterruptedException, IOException {
        String host = "localhost";
        int port = 50084;
        WindSensorDevice device = new WindSensorDevice(host, port);
        device.sendWindData(); // Simplified call in main
    }

}//class
