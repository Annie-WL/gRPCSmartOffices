package com.dataReader;

public class EnvironmentReading {
    private double temperature;
    private double humidity;
    private double airPollution;

    public EnvironmentReading(double temperature, double humidity, double airPollution) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPollution = airPollution;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getAirPollution() {
        return airPollution;
    }

    @Override
    public String toString() {
        return "Temp: " + temperature + "°C, Humidity: " + humidity + "%, Air Pollution: " + airPollution + " μg/m³";
    }
}

