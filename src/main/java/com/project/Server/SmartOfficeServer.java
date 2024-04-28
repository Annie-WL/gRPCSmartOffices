package com.project.Server;

import com.project.Services.SmartLightServiceImpl;
import com.project.Services.SmartHeatingServiceImpl;
import com.project.Services.SmartWindowServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SmartOfficeServer {

    private Server smartLightServer;
    private Server smartHeatingServer;
    private Server smartWindowServer;

    private void start() {
        try {
            smartLightServer = ServerBuilder.forPort(50082)
                    .addService(new SmartLightServiceImpl())
                    .build()
                    .start();
            System.out.println("SmartLight Service started on port 50082");

            smartHeatingServer = ServerBuilder.forPort(50083)
                    .addService(new SmartHeatingServiceImpl())
                    .build()
                    .start();
            System.out.println("SmartHeating Service started on port 50083");

            smartWindowServer = ServerBuilder.forPort(50084)
                    .addService(new SmartWindowServiceImpl())
                    .build()
                    .start();
            System.out.println("SmartWindow Service started on port 50084");

            System.out.println("SmartOffice Services started on their respective ports.");

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.err.println("*** shutting down gRPC servers since JVM is shutting down");
                stopServers();
                System.err.println("*** servers shut down");
            }));
        } catch (IOException e) {
            System.err.println("Failed to start the services: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private void stopServers() {
        if (smartLightServer != null) {
            smartLightServer.shutdown();
        }
        if (smartHeatingServer != null) {
            smartHeatingServer.shutdown();
        }
        if (smartWindowServer != null) {
            smartWindowServer.shutdown();
        }
        try {
            // Wait for servers to stop
            if (smartLightServer != null) {
                smartLightServer.awaitTermination(30, TimeUnit.SECONDS);
            }
            if (smartHeatingServer != null) {
                smartHeatingServer.awaitTermination(30, TimeUnit.SECONDS);
            }
            if (smartWindowServer != null) {
                smartWindowServer.awaitTermination(30, TimeUnit.SECONDS);
            }
        } catch (InterruptedException e) {
            // Log the error and forcibly shutdown servers if interrupted during shutdown
            System.err.println("Servers interrupted during shutdown: " + e.getMessage());
            if (smartLightServer != null) {
                smartLightServer.shutdownNow();
            }
            if (smartHeatingServer != null) {
                smartHeatingServer.shutdownNow();
            }
            if (smartWindowServer != null) {
                smartWindowServer.shutdownNow();
            }
            Thread.currentThread().interrupt();
        }
    }
    
    private void blockUntilShutdown() throws InterruptedException {
        if (smartLightServer != null) {
            smartLightServer.awaitTermination();
        }
        if (smartHeatingServer != null) {
            smartHeatingServer.awaitTermination();
        }
        if (smartWindowServer != null) {
            smartWindowServer.awaitTermination();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final SmartOfficeServer server = new SmartOfficeServer();
        server.start();
        server.blockUntilShutdown();
    }
}