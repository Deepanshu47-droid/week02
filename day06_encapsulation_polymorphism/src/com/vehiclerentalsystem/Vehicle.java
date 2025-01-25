package com.vehiclerentalsystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor to initialize values
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract Method to calculate rental cost to be implemented in derived class
    public abstract double calculateRentalCost(int days);

    // Getter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
}
