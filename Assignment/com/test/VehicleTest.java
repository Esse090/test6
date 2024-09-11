package com.test;

import com.vehicle.car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        car car = new car();
        car.setSpeed(60.0);
        car.setFuelLevel(70.0f);
        car.drive(500); 

        System.out.println("Car speed in mph: " + car.getSpeedMph());
        System.out.println("Car distance traveled in km: " + car.getDistanceKm());

        ElectricCar eCar = new ElectricCar();
        eCar.setSpeed(80.0);
        eCar.setFuelLevel(90.0f); 
        eCar.setBatteryLevel(85.0);
        eCar.drive(2000); 

        System.out.println("ElectricCar speed in mph: " + eCar.getSpeedMph());
        System.out.println("ElectricCar distance traveled in km: " + eCar.getDistanceKm());
        System.out.println("ElectricCar battery level: " + eCar.getBatteryLevel());
    }
}