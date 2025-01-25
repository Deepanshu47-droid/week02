package com.vehiclerentalsystem;

// Subclass: Truck
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 1000; // Fixed insurance cost for trucks

    //constructor to initialize values
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    //implementation of calculateRentalCost() method
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    //implementation of calculateInsurance() method
    @Override
    public double calculateInsurance() {
        return INSURANCE_RATE;
    }

    //implementation of getInsuranceDetails() method
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: Fixed cost of " + INSURANCE_RATE;
    }
}