package assistedproblems.vehicleandtransportsystem;

public class Vehicle {
    public double maxSpeed;
    public String fuelType;

    //constructor to initialize values
    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //method to display details
    public void displayInfo() {
        System.out.println("Max Speed : " + this.maxSpeed);
        System.out.println("Fuel type : " + this.fuelType);
    }
}
