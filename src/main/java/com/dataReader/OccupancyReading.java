package com.dataReader;

public class OccupancyReading {
    private boolean occupancy;
    private int numPeople;

    public OccupancyReading(boolean occupancy, int numPeople) {
        this.occupancy = occupancy;
        this.numPeople = numPeople;
    }

    public boolean isOccupancy() {
        return occupancy;
    }

    public int getNumPeople() {
        return numPeople;
    }

    @Override
    public String toString() {
        return "Occupancy: " + (occupancy ? "Occupied" : "Empty") + ", Number of People: " + numPeople;
    }
}

