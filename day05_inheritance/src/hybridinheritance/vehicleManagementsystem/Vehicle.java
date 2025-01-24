package hybridinheritance.vehicleManagementsystem;

public class Vehicle {
    //fields
    public double maxSpeed;
    public String model;

    //constructor to initialize values
    public Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this. model = model;
    }
    //method to print details
    public void display() {
        System.out.println("Max speed : " + this.maxSpeed);
        System.out.println("Model : " + this.model);
    }
}
