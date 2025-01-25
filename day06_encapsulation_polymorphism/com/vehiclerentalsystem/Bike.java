package com.vehiclerentalsystem;


class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 200; // Fixed insurance cost for bikes

    //constructor to initialize values
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return "Bike Insurance: Fixed cost of " + INSURANCE_RATE;
    }
}