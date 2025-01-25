package com.vehiclerentalsystem;

public interface Insurable {

    //abstract method to calculate insurance to be implemented in derived class
    double calculateInsurance();

    //abstract method to get insurance details to be implemented in derived class
    String getInsuranceDetails();
}
