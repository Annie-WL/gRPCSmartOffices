package Server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.example.grpc.smartoffices.heating.SmartHeatingGrpc;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc.SmartHeatingImplBase;
import com.example.grpc.smartoffices.heating.TemperatureSettingRequest;
import com.example.grpc.smartoffices.heating.TemperatureResponse;
import com.example.grpc.smartoffices.light.SmartLightsGrpc;

import com.example.grpc.smartoffices.window.SmartWindowGrpc;



import java.io.IOException;

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
            @Override
            public void monitorTemperature(StreamObserver<TemperatureResponse> responseObserver) {
                // This method is left blank intentionally for example purposes.
                // You would implement your logic here to handle the incoming stream of temperature data.
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
    }

    static class SmartLightServiceImpl extends SmartLightsGrpc.SmartLightsImplBase {
        // Implement service methods
    }

    static class SmartWindowServiceImpl extends SmartWindowGrpc.SmartWindowImplBase {
        // Implement service methods
    }

}