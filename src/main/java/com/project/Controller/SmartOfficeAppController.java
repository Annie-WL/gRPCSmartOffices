package com.project.Controller;

import com.project.grpc.smartoffices.heating.TemperatureStreamResponse;
import com.project.grpc.smartoffices.light.SmartLightGrpc;
import com.project.grpc.smartoffices.window.SmartWindowGrpc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.application.Platform;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.project.grpc.smartoffices.heating.SmartHeatingGrpc;
import com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest;
import com.project.grpc.smartoffices.heating.TemperatureStreamRequest;
import io.grpc.stub.StreamObserver;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class SmartOfficeAppController {

    @FXML
    private Button getCurrentTemperatureButton;

    @FXML
    private ImageView heatingStatusImageView;

    @FXML
    private Label temperatureLabel;

    private SmartHeatingGrpc.SmartHeatingStub heatingStubAsync;

    private ManagedChannel heatingChannel, lightChannel, windowChannel;

    public void initialize() {
        setupHeatingService();
//        setupLightService();
//        setupWindowService();
    }

    private void setupHeatingService() {
        heatingChannel = ManagedChannelBuilder.forAddress("localhost", 50083)
                .usePlaintext()
                .build();
        // Initialize the async stub here
        heatingStubAsync = SmartHeatingGrpc.newStub(heatingChannel);
    }


    //

    @FXML
    private void getCurrentTemperatureButton(ActionEvent event) {
        // Assuming TemperatureStreamRequest gets the current status and temperature
        TemperatureStreamRequest request = TemperatureStreamRequest.newBuilder()
                .setClientId("ClientGUI")
                .build();

        // Use the asynchronous stub for streaming temperature updates
        heatingStubAsync.streamTemperatureUpdates(request, new StreamObserver<TemperatureStreamResponse>() {
            @Override
            public void onNext(TemperatureStreamResponse value) {
                Platform.runLater(() -> {

                    String formattedTemperature = String.format("%.2f", value.getCurrentTemperature());
                    temperatureLabel.setText("Current Temperature:\n" + formattedTemperature + " °C");

                    // Update the heating status image based on the response
                    String imagePath = value.getHeatingStatus() ? "/GUI/images/heating_on.png" : "/GUI/images/heating_off.png";
                    Image heatingImage = new Image(getClass().getResourceAsStream(imagePath));
                    heatingStatusImageView.setImage(heatingImage);
                });
            }

            @Override
            public void onError(Throwable t) {
                Platform.runLater(() -> {
                    temperatureLabel.setText("Failed to get temperature: " + t.getMessage());
                    heatingStatusImageView.setImage(null);
                });
            }

            @Override
            public void onCompleted() {
                System.out.println("Temperature stream completed.");
            }
        });
    }






/////////////////////////////////
    public void shutdown() {
        heatingChannel.shutdownNow();
        lightChannel.shutdownNow();
        windowChannel.shutdownNow();
    }


}
