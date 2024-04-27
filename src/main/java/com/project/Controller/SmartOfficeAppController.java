package com.project.Controller;

import com.project.Services.SmartLightServiceImpl;
import com.project.dataReader.OccupancyReading;
import com.project.grpc.smartoffices.heating.TemperatureStreamResponse;
import com.project.grpc.smartoffices.light.LightRequest;
import com.project.grpc.smartoffices.light.LightResponse;
import com.project.grpc.smartoffices.light.SmartLightGrpc;
import com.project.grpc.smartoffices.window.SmartWindowGrpc;
import io.grpc.StatusRuntimeException;
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

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static com.project.dataReader.OccupancyCSVReader.occupancyReadings;

public class SmartOfficeAppController {

    @FXML
    private Button getCurrentTemperatureButton;

    @FXML
    private Button getNumberOfPeopleButton;

    @FXML
    private ImageView heatingStatusImageView;

    @FXML
    private ImageView lightStatusImageView;

    @FXML
    private Label numberOfPeopleLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Button getCurrentWindSpeedButton;
    @FXML
    private ImageView windowStatusImageView;

    private SmartHeatingGrpc.SmartHeatingStub heatingStubAsync;
    private SmartLightGrpc.SmartLightStub smartLightStubAsync;
    private StreamObserver<LightRequest> requestObserver;

    private ManagedChannel heatingChannel, lightChannel, windowChannel;

    private SmartWindowGrpc.SmartWindowStub smartWindowStubAsync;
    private StreamObserver<WindowRequest> windowRequestObserver;



    public void initialize() {
        setupHeatingService();
        setupLightService();
        setupWindowService();
    }

    private void setupHeatingService() {
        heatingChannel = ManagedChannelBuilder.forAddress("localhost", 50083)
                .usePlaintext()
                .build();
        // Initialize the async stub here
        heatingStubAsync = SmartHeatingGrpc.newStub(heatingChannel);
    }

    private void setupLightService() {
        lightChannel = ManagedChannelBuilder.forAddress("localhost", 50082)
                .usePlaintext()
                .build();
        smartLightStubAsync = SmartLightGrpc.newStub(lightChannel);
    }

    private void setupWindowService() {
        windowChannel = ManagedChannelBuilder.forAddress("localhost", 50084)
                .usePlaintext()
                .build();
        smartWindowStubAsync = SmartWindowGrpc.newStub(windowChannel);
    }

    //

    //Smart Heating
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

    @FXML
    private void getNumberOfPeopleButton(ActionEvent event) {
        // Prepare the request (if there are any parameters to set, do it here)
        LightRequest request = LightRequest.newBuilder()
                .build();

        // Start server-side streaming call
        smartLightStubAsync.streamNumberOfPeople(request, new StreamObserver<LightResponse>() {

            @Override
            public void onNext(LightResponse value) {
                Platform.runLater(() -> {
                    numberOfPeopleLabel.setText("Number of people in \n the office: " + value.getNumPeople());

                    String imagePath = value.getLightStatus() ? "/GUI/images/light_on.png" : "/GUI/images/light_off.png";
                    Image lightImage = new Image(getClass().getResourceAsStream(imagePath));
                    lightStatusImageView.setImage(lightImage);
                });
            }

            @Override
            public void onError(Throwable t) {
                Platform.runLater(() -> {
                    System.err.println("Error receiving light status: " + t);
                    lightStatusImageView.setImage(null);
                    numberOfPeopleLabel.setText("Error");
                });
//                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                Platform.runLater(() -> {
                    System.out.println("Stream is completed.");
                    // Handle stream completion here if needed
                });
            }
        });
    }






    /////////////////////////////////
    public void shutdown() {
        heatingChannel.shutdownNow();
        lightChannel.shutdownNow();
//        windowChannel.shutdownNow();
    }


}
