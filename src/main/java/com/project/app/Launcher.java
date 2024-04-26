package com.project.app;

import java.io.IOException;

import com.project.Server.SmartOfficeServer;

public class Launcher {
    public static void main(String[] args) {
        // Separate the server starting logic into its own method or ensure it's callable correctly
        Thread serverThread = new Thread(() -> {
            try {
                SmartOfficeServer.main(args);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // This thread runs the JavaFX application.
        Thread appThread = new Thread(() -> {
            SmartOfficeApp.main(args);
        });

        serverThread.start();
        appThread.start();
    }
}

