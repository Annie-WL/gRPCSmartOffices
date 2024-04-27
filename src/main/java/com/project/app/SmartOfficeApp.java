package com.project.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SmartOfficeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Correct the path according to where SmartOfficeForm.fxml is located in your resources folder
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/SmartOfficeForm.fxml"));
            Parent root = loader.load(); // Load the FXML file
            primaryStage.setTitle("Smart Office");
            Scene scene = new Scene(root, 800, 600); // Create a Scene with the loaded root
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Prints the stack trace of the IOException
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
