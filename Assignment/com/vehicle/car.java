package com.vehicle;

public class car {
    private double speedKph;
    private float fuelLevel;
    protected int distanceTraveled;

    public void setSpeed(double speed) {
        speedKph = speed;
    }

    public void setFuelLevel(float fuel) {
        fuelLevel = fuel;
    }

    public void drive(int distance) {
        distanceTraveled += distance;
        fuelLevel -= distance / 200.0; 
    }

    public double getSpeedMph() {
        return speedKph / 1.60934;
    }

    public int getDistanceKm() {
        return distanceTraveled / 1000;
    }
}
