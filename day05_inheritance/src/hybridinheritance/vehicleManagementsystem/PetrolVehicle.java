package hybridinheritance.vehicleManagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    //constructor to initialize values
    public PetrolVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }
    //implementation of refuel() method
    public void refuel() {
        System.out.println("Refuelable......");
    }
}
