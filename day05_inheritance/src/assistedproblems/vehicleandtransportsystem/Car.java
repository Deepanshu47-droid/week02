package assistedproblems.vehicleandtransportsystem;

public class Car extends Vehicle{
    //fields
    public int seatCapacity;

    //constructor to initialize values
    public Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    //overriding display method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("seat capacity : " + this.seatCapacity);
        System.out.println();
    }
}
