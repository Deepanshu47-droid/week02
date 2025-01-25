package com.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
    //fields
    private static final double INSURANCE_RATE = 500; // Fixed insurance cost for cars

    //constructor to initialize values
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
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
        return "Car Insurance: Fixed cost of " + INSURANCE_RATE;
    }
}