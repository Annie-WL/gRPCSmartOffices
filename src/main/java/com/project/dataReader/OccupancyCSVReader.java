package com.project.dataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class OccupancyCSVReader {

        private static final ArrayList<OccupancyReading> occupancyReadings = new ArrayList<>();
        private static Timer timer;

        public static void main(String[] args) {
            loadOccupancyData();
            scheduleTimer();
        }

        public static ArrayList<OccupancyReading> loadOccupancyData() {
            ArrayList<OccupancyReading> occupancyReadings = new ArrayList<>();
            // Using try-with-resources to ensure the InputStream and BufferedReader are closed
            try (InputStream inputStream = OccupancyCSVReader.class.getClassLoader().getResourceAsStream("OccupancyData.csv");
                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

                if (inputStream == null) {
                    System.err.println("Failed to load weather data file.");
                    return occupancyReadings;
                }

                String line;
                // Skip header line if present
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");

                    boolean occupancy = Boolean.parseBoolean(parts[0]);
                    int numPeople = Integer.parseInt(parts[1]);

                    OccupancyReading occupancyReading = new OccupancyReading(occupancy, numPeople);
                    occupancyReadings.add(occupancyReading);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return occupancyReadings;
        }

        private static void scheduleTimer() {
            timer = new Timer();
            timer.scheduleAtFixedRate(new OccupancyCSVReader.Task(), 0, 15000); // Schedule the task to run every 15 seconds
        }

        static class Task extends TimerTask {
            private int index = 0;

            @Override
            public void run() {
                if (index < occupancyReadings.size()) {
                    OccupancyReading occupancyReading = occupancyReadings.get(index);
                    System.out.println("Sensor Reading: " + occupancyReading);
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


