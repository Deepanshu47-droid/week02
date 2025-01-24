package assistedproblems.vehicleandtransportsystem;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for Vehicle
        System.out.print("Enter vehicle's max speed : ");
        double maxSpeed = input.nextDouble();
        input.nextLine();
        System.out.print("Enter vehicle's fuel type : ");
        String fuelType = input.nextLine();

        //creating Vehicle class object
        Vehicle vehicle = new Vehicle(maxSpeed, fuelType);

        //taking user input for car
        System.out.print("Enter car's max speed : ");
        maxSpeed = input.nextDouble();
        input.nextLine();
        System.out.print("Enter car's fuel type : ");
        fuelType = input.nextLine();
        System.out.print("Enter seat capacity : ");
        int seatCapacity = input.nextInt();
        input.nextLine();

        //creating car class object
        Car car = new Car(maxSpeed, fuelType, seatCapacity);

        //taking user input for truck
        System.out.print("Enter truck's max speed : ");
        maxSpeed = input.nextDouble();
        input.nextLine();
        System.out.print("Enter truck's fuel type : ");
        fuelType = input.nextLine();

        //creating truck class object
        Truck truck = new Truck(maxSpeed, fuelType);

        //taking user input for motorcycle
        System.out.print("Enter motorcycle's max speed : ");
        maxSpeed = input.nextDouble();
        input.nextLine();
        System.out.print("Enter motorcycle's fuel type : ");
        fuelType = input.nextLine();

        //creating motorcycle class object
        Motorcycle motorcycle = new Motorcycle(maxSpeed, fuelType);

        //creating array of vehicle type
        Vehicle[] vehicles = {vehicle, car, truck, motorcycle};

        //printing details of vehicle
        System.out.println("\nDetails of vehicle .....");
        vehicles[0].displayInfo();

        //printing details of car
        System.out.println("\nDetails of car .....");
        vehicles[1].displayInfo();

        //printing details of truck
        System.out.println("\nDetails of truck .....");
        vehicles[2].displayInfo();

        //printing details of motorcycle
        System.out.println("\nDetails of motorcycle .....");
        vehicles[3].displayInfo();

        //closing input object
        input.close();
    }
}
