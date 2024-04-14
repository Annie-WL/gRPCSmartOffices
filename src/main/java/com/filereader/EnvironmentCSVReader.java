package com.filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class EnvironmentCSVReader {

    private static final ArrayList<EnvironmentReading> environmentReadings = new ArrayList<>();
    private static Timer timer;

    public static void main(String[] args) {
        loadEnvironmentData();
        scheduleTimer();
    }

    private static void loadEnvironmentData() {
        try (InputStream inputStream = EnvironmentCSVReader.class.getClassLoader().getResourceAsStream("EnvironmentData.csv")) {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                // Skip header line
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    double temperature = Double.parseDouble(parts[0]);
                    double humidity = Double.parseDouble(parts[1]);
                    double airPollution = Double.parseDouble(parts[2]);

                    EnvironmentReading environmentReading = new EnvironmentReading(temperature, humidity, airPollution);
                    environmentReadings.add(environmentReading);
                }
            } else {
                System.err.println("Failed to load environment data file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void scheduleTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new EnvironmentTask(), 0, 15000); // Schedule the task to run every 15 seconds
    }

    static class EnvironmentTask extends TimerTask {
        private int index = 0;

        @Override
        public void run() {
            if (index < environmentReadings.size()) {
                EnvironmentReading environmentReading = environmentReadings.get(index);
                System.out.println("Environment Sensor Reading: " + environmentReading);
                index++;
            } else {
                System.out.println("End of environment sensor readings reached.");
                timer.cancel();
            }
        }
    }
}

