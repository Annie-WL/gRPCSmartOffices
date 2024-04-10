package com.example.grpc.smartoffices;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.heating.SmartHeatingServiceImpl.*;
import com.example.grpc.smartoffices.light.SmartLightServiceImpl.*;
import com.example.grpc.smartoffices.window.SmartWindowServiceImpl.*;

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
    static class SmartHeatingImpl extends SmartHeatingGrpc.SmartHeatingImplBase {
        // Implement service methods
    }

    static class SmartLightsImpl extends SmartLightsGrpc.SmartLightsImplBase {
        // Implement service methods
    }

    static class SmartWindowsImpl extends SmartWindowGrpc.SmartWindowsImplBase {
        // Implement service methods
    }
}
