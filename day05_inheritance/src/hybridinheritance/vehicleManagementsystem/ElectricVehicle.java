package hybridinheritance.vehicleManagementsystem;

public class ElectricVehicle extends Vehicle implements Refuelable {

    //constructor to initialize values
    public ElectricVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }
    //implementation of refuel() method
    public void refuel() {
        System.out.println("Refuelable......");
    }
}
