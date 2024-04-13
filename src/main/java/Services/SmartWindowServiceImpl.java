package Services;

import io.grpc.stub.StreamObserver;
import com.example.grpc.smartoffices.window.WindowRequest;
import com.example.grpc.smartoffices.window.WindowResponse;
import com.example.grpc.smartoffices.window.SmartWindowGrpc.SmartWindowImplBase;

public class SmartWindowServiceImpl extends SmartWindowImplBase {
    @Override
    public StreamObserver<WindowRequest> controlWindows(StreamObserver<WindowResponse> responseObserver) {
        return new StreamObserver<WindowRequest>() {
            boolean windowClosed = false;

            @Override
            public void onNext(WindowRequest request) {
                double windSpeed = request.getWindSpeed();
                double windTemperature = request.getWindTemperature();
                windowClosed = windSpeed > 4.8 || windTemperature < 10;
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in SmartWindowServiceImpl: " + t);
            }

            @Override
            public void onCompleted() {
                WindowResponse response = WindowResponse.newBuilder().setWindowStatus(windowClosed).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}

