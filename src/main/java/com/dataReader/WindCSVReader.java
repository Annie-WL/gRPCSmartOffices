package com.dataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class WindCSVReader {

    private static final ArrayList<WindReading> windReadings = new ArrayList<>();
    private static Timer timer;

    public static void main(String[] args) {
        loadWindData();
        scheduleTimer();
    }

    public static ArrayList<WindReading> loadWindData() {
        ArrayList<WindReading> windReadings = new ArrayList<>();
        try (InputStream inputStream = WindCSVReader.class.getClassLoader().getResourceAsStream("WindData.csv")) {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                // Skip header line if present
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");

                    String windDirection = parts[0];
                    double windSpeed = Double.parseDouble(parts[1]);
                    double windTemperature = Double.parseDouble(parts[2]);

                    WindReading windReading = new WindReading(windDirection, windSpeed, windTemperature);
                    windReadings.add(windReading);
                }
            } else {
                System.err.println("Failed to load weather data file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return windReadings;
    }


    private static void scheduleTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new Task(), 0, 15000); // Schedule the task to run every 15 seconds
    }

    static class Task extends TimerTask {
        private int index = 0;

        @Override
        public void run() {
            if (index < windReadings.size()) {
                WindReading weatherReading = windReadings.get(index);
                System.out.println("Sensor Reading: " + weatherReading);
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


