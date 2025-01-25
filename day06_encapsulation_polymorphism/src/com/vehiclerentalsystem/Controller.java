package com.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        // Creating a list of vehicles (Polymorphism in action)
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000));
        vehicles.add(new Bike("BIKE333", 500));
        vehicles.add(new Truck("TRUCK333", 2000));

        // Iterating over the vehicles and calculating rental and insurance costs
        int rentalDays = 3; //for 3 days
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();

            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println("----------------------------------------");
        }
    }
}
