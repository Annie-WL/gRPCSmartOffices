package Server;

//import Services.SmartLightServiceImpl;
import Services.SmartHeatingServiceImpl;
//import Services.SmartWindowServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SmartOfficeServer {

//    private Server smartLightServer;
    private Server smartHeatingServer;
//    private Server smartWindowServer;

    private void start() throws IOException {
        // Start SmartLight service on its own port
//        smartLightServer = ServerBuilder.forPort(50082)
//                .addService(new SmartLightServiceImpl())
//                .build()
//                .start();

        // Start SmartHeating service on its own port
        smartHeatingServer = ServerBuilder.forPort(50083)
                .addService(new SmartHeatingServiceImpl())
                .build()
                .start();

        // Start SmartWindow service on its own port
//        smartWindowServer = ServerBuilder.forPort(50084)
//                .addService(new SmartWindowServiceImpl())
//                .build()
//                .start();

        System.out.println("SmartOffice Services started on their respective ports.");

        // Add shutdown hook for each service
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC servers since JVM is shutting down");
            stopServers();
            System.err.println("*** servers shut down");
        }));
    }

    private void stopServers() {
//        if (smartLightServer != null) {
//            smartLightServer.shutdown();
//        }
        if (smartHeatingServer != null) {
            smartHeatingServer.shutdown();
        }
//        if (smartWindowServer != null) {
//            smartWindowServer.shutdown();
//        }
    }

    private void blockUntilShutdown() throws InterruptedException {
//        if (smartLightServer != null) {
//            smartLightServer.awaitTermination();
//        }
        if (smartHeatingServer != null) {
            smartHeatingServer.awaitTermination();
        }
//        if (smartWindowServer != null) {
//            smartWindowServer.awaitTermination();
//        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final SmartOfficeServer server = new SmartOfficeServer();
        server.start();
        server.blockUntilShutdown();
    }
}