package Server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc.SmartHeatingImplBase;
import com.example.grpc.smartoffices.heating.TemperatureSettingRequest;
import com.example.grpc.smartoffices.heating.TemperatureResponse;

import com.example.grpc.smartoffices.light.SmartLightsGrpc;
import com.example.grpc.smartoffices.light.LightRequest;
import com.example.grpc.smartoffices.light.LightResponse;

import com.example.grpc.smartoffices.window.SmartWindowGrpc;
import com.example.grpc.smartoffices.window.WindowControlRequest;
import com.example.grpc.smartoffices.window.WindowResponse;
import com.example.grpc.smartoffices.window.WindowRequest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;




public class SmartOfficeServer {
    private Server server;

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new SmartHeatingServiceImpl()) // Add Smart Heating Service
                .addService(new SmartLightServiceImpl()) // Add Smart Lights Service
                .addService(new SmartWindowServiceImpl()) // Add Smart Windows Service
                .build()
                .start();
        System.out.println("Smart Office Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** Shutting down gRPC server since JVM is shutting down");
            SmartOfficeServer.this.stop();
            System.err.println("*** Server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final SmartOfficeServer server = new SmartOfficeServer();
        server.start();
        server.blockUntilShutdown();
    }


    // Placeholder class implementations for each service
        // Implement service methods
    static class SmartHeatingServiceImpl extends SmartHeatingGrpc.SmartHeatingImplBase {
//        @Override
//        public void monitorTemperature(StreamObserver<TemperatureResponse> responseObserver) {
//            // This method is left blank intentionally for example purposes.
//            // You would implement your logic here to handle the incoming stream of temperature data.
//        }
        @Override
        public void monitorTemperature(StreamObserver<TemperatureResponse> responseObserver) {
            ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
            executor.scheduleAtFixedRate(() -> {
                String line;
                String csvFile = "path/to/your/temperature.csv"; // Path to the CSV file
                try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(","); // Assuming CSV has no header and contains temperatures in a single column
                        double temperature = Double.parseDouble(data[0]); // Parsing the temperature
                        checkAndRespond(temperature, responseObserver);
                    }
                } catch (IOException | NumberFormatException e) {
                    System.err.println("Error reading or parsing the CSV file: " + e.getMessage());
                    responseObserver.onError(io.grpc.Status.INTERNAL.withDescription("Error processing temperature data").asRuntimeException());
                }
            }, 0, 1, TimeUnit.MINUTES); // Adjust the period according to your requirements
        }

        private void checkAndRespond(double temperature, StreamObserver<TemperatureResponse> responseObserver) {
            String status;
            if (temperature < 19.0) { // Threshold temperature
                status = "Heating turned on for temperature: " + temperature;
                // Here you might also interact with hardware/systems to physically turn on the heating
            } else {
                status = "Heating turned off for temperature: " + temperature;
                // Similarly, interact with hardware/systems to turn off the heating
            }
            TemperatureResponse response = TemperatureResponse.newBuilder()
                    .setMessage(status)
                    .build();
            responseObserver.onNext(response); // Send response to the client
        }

        @Override
        public void setTemperatureHigh(TemperatureSettingRequest request, StreamObserver<TemperatureResponse> responseObserver) {
            TemperatureResponse response = TemperatureResponse.newBuilder()
                    .setMessage("Heating set to high for area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void setTemperatureLow(TemperatureSettingRequest request, StreamObserver<TemperatureResponse> responseObserver) {
            TemperatureResponse response = TemperatureResponse.newBuilder()
                    .setMessage("Heating set to low for area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnHeatingOn(TemperatureSettingRequest request, StreamObserver<TemperatureResponse> responseObserver) {
            TemperatureResponse response = TemperatureResponse.newBuilder()
                    .setMessage("Heating turned on for area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnHeatingOff(TemperatureSettingRequest request, StreamObserver<TemperatureResponse> responseObserver) {
            TemperatureResponse response = TemperatureResponse.newBuilder()
                    .setMessage("Heating turned off for area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }

    static class SmartLightServiceImpl extends SmartLightsGrpc.SmartLightsImplBase {
        // Implement service methods
        @Override
        public void turnOn(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Lights turned ON in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnOff(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Lights turned OFF in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void brightnessUp(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Brightness increased in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void brightnessDown(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Brightness decreased in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void streamLightStatus(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            // Simulate sending status updates every second
            try {
                for (int i = 0; i < 5; i++) {  // Send 5 updates
                    LightResponse response = LightResponse.newBuilder()
                            .setMessage("Current status at " + request.getArea() + ": Update " + (i + 1))
                            .build();
                    responseObserver.onNext(response);
                    Thread.sleep(1000);  // Wait for a second between updates
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                responseObserver.onCompleted();
            }
        }
    }

    static class SmartWindowServiceImpl extends SmartWindowGrpc.SmartWindowImplBase {
        // Implement service methods
        @Override
        public void openWindow(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
            WindowResponse response = WindowResponse.newBuilder()
                    .setMessage("Window opened in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void closeWindow(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
            WindowResponse response = WindowResponse.newBuilder()
                    .setMessage("Window closed in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void tintLighter(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
            WindowResponse response = WindowResponse.newBuilder()
                    .setMessage("Window tint made lighter in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void tintDarker(WindowRequest request, StreamObserver<WindowResponse> responseObserver) {
            WindowResponse response = WindowResponse.newBuilder()
                    .setMessage("Window tint made darker in area: " + request.getArea())
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public StreamObserver<WindowControlRequest> interactiveWindowControl(StreamObserver<WindowResponse> responseObserver) {
            return new StreamObserver<WindowControlRequest>() {
                @Override
                public void onNext(WindowControlRequest request) {
                    String message = "Processed command '" + request.getCommand() + "' for area: " + request.getArea();
                    WindowResponse response = WindowResponse.newBuilder()
                            .setMessage(message)
                            .build();
                    responseObserver.onNext(response);
                }

                @Override
                public void onError(Throwable t) {
                    System.err.println("Interactive Window Control failed: " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
        }
    }

}