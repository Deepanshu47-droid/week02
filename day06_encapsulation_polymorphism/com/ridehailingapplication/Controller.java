package com.ridehailingapplication;

public class Controller {
    public static void main(String[] args) {
        // Creating Vehicles
        Vehicle car = new Car("CAR123", "Raj", 15);
        Vehicle bike = new Bike("BIKE456", "Veer", 8);
        Vehicle auto = new Auto("AUTO789", "Mayank", 10);

        // Updating Locations
        ((GPS) car).updateLocation("Bhopal");
        ((GPS) bike).updateLocation("Sehore");
        ((GPS) auto).updateLocation("Govindpura");

        // Processing Rides
        Vehicle[] vehicles = {car, bike, auto};
        double distance = 12.5; //distance for ride calculation

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
            System.out.println("----------------------------------------");
        }
    }
}