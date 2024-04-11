package Clients;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.window.SmartWindowServiceImpl.*;
import com.example.grpc.smartoffices.window.SmartWindowGrpc;
import com.example.grpc.smartoffices.window.WindowControlRequest;
import com.example.grpc.smartoffices.window.WindowResponse;


public class WindSensor {
    private final ManagedChannel channel;
    private final SmartWindowGrpc.SmartWindowStub asyncStub;

    public WindSensor(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        asyncStub = SmartWindowGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void sendCommands(String area) {
        StreamObserver<WindowControlRequest> requestObserver = asyncStub.interactiveWindowControl(new StreamObserver<WindowResponse>() {
            @Override
            public void onNext(WindowResponse response) {
                System.out.println("Server response: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error during streaming: " + t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming completed.");
            }
        });

        try {
            // Simulating various commands
            String[] commands = {"open", "close", "tint lighter", "tint darker"};
            for (String command : commands) {
                WindowControlRequest request = WindowControlRequest.newBuilder()
                        .setArea(area)
                        .setCommand(command)
                        .build();
                requestObserver.onNext(request);
                Thread.sleep(1000); // Wait a second between commands
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            requestObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WindSensor client = new WindSensor("localhost", 50053);
        try {
            client.sendCommands("Main Lobby");
        } finally {
            client.shutdown();
        }
    }
}