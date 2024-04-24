package com.project.dataReader;

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

        public static ArrayList<EnvironmentReading> loadEnvironmentData() {
            ArrayList<EnvironmentReading> environmentReadings = new ArrayList<>();
            // Using try-with-resources to ensure the InputStream and BufferedReader are closed
            try (InputStream inputStream = EnvironmentCSVReader.class.getClassLoader().getResourceAsStream("EnvironmentData.csv");
                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

                if (inputStream == null) {
                    System.err.println("Failed to load weather data file.");
                    return environmentReadings;
                }

                String line;
                // Skip header line if present
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");

                    double temperature = Double.parseDouble(parts[0]);
                    double humidity = Double.parseDouble(parts[1]);
                    double airPollution = Double.parseDouble(parts[2]);


                    EnvironmentReading windReading = new EnvironmentReading(temperature, humidity, airPollution);
                    environmentReadings.add(windReading);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return environmentReadings;
        }

        private static void scheduleTimer() {
            timer = new Timer();
            timer.scheduleAtFixedRate(new EnvironmentCSVReader.Task(), 0, 15000); // Schedule the task to run every 15 seconds
        }

        static class Task extends TimerTask {
            private int index = 0;

            @Override
            public void run() {
                if (index < environmentReadings.size()) {
                    EnvironmentReading environmentReading = environmentReadings.get(index);
                    System.out.println("Sensor Reading: " + environmentReading);
                    index++;
                } else {
                    System.out.println("End of sensor readings reached.");
                    // Stop the timer task and perform any necessary cleanup
                    timer.cancel(); // Cancel the timer task
                    // You may also want to close any resources used for reading the CSV file
                }
            }
        }
    }


