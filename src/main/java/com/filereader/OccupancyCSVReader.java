package com.filereader;

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

    private static void loadOccupancyData() {
        try (InputStream inputStream = OccupancyCSVReader.class.getClassLoader().getResourceAsStream("OccupancyData.csv")) {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                // Skip header line
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    boolean occupancy = Integer.parseInt(parts[0]) == 1; // assuming 1 for occupied, 0 for empty
                    int numPeople = Integer.parseInt(parts[1]);

                    OccupancyReading occupancyReading = new OccupancyReading(occupancy, numPeople);
                    occupancyReadings.add(occupancyReading);
                }
            } else {
                System.err.println("Failed to load occupancy data file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void scheduleTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new OccupancyTask(), 0, 15000); // Schedule the task to run every 15 seconds
    }

    static class OccupancyTask extends TimerTask {
        private int index = 0;

        @Override
        public void run() {
            if (index < occupancyReadings.size()) {
                OccupancyReading occupancyReading = occupancyReadings.get(index);
                System.out.println("Occupancy Sensor Reading: " + occupancyReading);
                index++;
            } else {
                System.out.println("End of occupancy sensor readings reached.");
                timer.cancel();
            }
        }
    }
}

