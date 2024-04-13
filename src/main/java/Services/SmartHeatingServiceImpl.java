package Services;

import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.heating.HeatingRequest;
import com.example.grpc.smartoffices.heating.HeatingResponse;
import com.example.grpc.smartoffices.heating.SmartHeatingGrpc.SmartHeatingImplBase;

public class SmartHeatingServiceImpl extends SmartHeatingImplBase {
    @Override
    public void updateSettings(HeatingRequest request, StreamObserver<HeatingResponse> responseObserver) {
        boolean heatingStatus = (request.getTemperature() < 19);
        HeatingResponse response = HeatingResponse.newBuilder().setHeatingStatus(heatingStatus).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorTemperature(HeatingRequest request, StreamObserver<HeatingResponse> responseObserver) {
        double temperature = request.getTemperature();
        boolean heatingStatus = temperature < 19 || temperature > 23;
        HeatingResponse response = HeatingResponse.newBuilder().setHeatingStatus(heatingStatus).build();
        responseObserver.onNext(response);
        try {
            Thread.sleep(1000);  // Simulate delay in response for demonstration
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        responseObserver.onCompleted();
    }
}

