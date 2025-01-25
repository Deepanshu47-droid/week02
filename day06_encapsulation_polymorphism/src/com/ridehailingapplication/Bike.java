package com.ridehailingapplication;

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor to initialize values
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    //implementation of calculateFare() method
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // No extra base charge for bikes
    }

    //implementation of getCurrentLocation() method
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    //implementation of updateLocaation() method
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}