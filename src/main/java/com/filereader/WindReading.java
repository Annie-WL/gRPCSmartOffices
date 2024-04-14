package com.filereader;

public class WindReading {
    private String windDirection;
    private double windSpeed;
    private double windTemperature;

    public WindReading(String windDirection, double windSpeed, double windTemperature) {
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.windTemperature = windTemperature;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getWindTemperature() {
        return windTemperature;
    }

    @Override
    public String toString() {
        return "WindDirection: " + windDirection + ", WindSpeed: " + windSpeed + "km/h, WindTemperature: " + windTemperature + "°C";
    }
}

