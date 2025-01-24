package hybridinheritance.vehicleManagementsystem;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for Vehicle
        System.out.println("\nFetching vehicle's details...");
        System.out.print("Enter max speed : ");
        double maxSpeed = input.nextInt();
        input.nextLine();
        System.out.print("Enter model : ");
        String model = input.nextLine();

        //creating Vehicle class object
        Vehicle vehicle = new Vehicle(maxSpeed, model);

        //printing details of vehicle
        System.out.println("\nDetails of vehicle.....");
        vehicle.display();

        //taking user input for Electric Vehicle
        System.out.println("\nFetching Electric Vehicle's details...");
        System.out.print("Enter max speed : ");
        maxSpeed = input.nextInt();
        input.nextLine();
        System.out.print("Enter model : ");
        model = input.nextLine();

        //creating ElectricVehicle class object
        ElectricVehicle electricVehicle = new ElectricVehicle(maxSpeed, model);

        //printing details of Electric Vehicle
        System.out.println("\nDetails of Electric Vehicle.....");
        electricVehicle.display();
        //calling method performDuties()
        electricVehicle.refuel();

        //taking user input for petrol Vehicle
        System.out.println("\nFetching petrol Vehicle's details...");
        System.out.print("Enter max speed : ");
        maxSpeed = input.nextInt();
        input.nextLine();
        System.out.print("Enter model : ");
        model = input.nextLine();

        //creating petrol Vehicle class object
        PetrolVehicle petrolVehicle = new PetrolVehicle(maxSpeed, model);

        //printing details of petrol Vehicle
        System.out.println("\nDetails of petrol Vehicle.....");
        petrolVehicle.display();
        //calling method performDuties()
        petrolVehicle.refuel();

        //closing the input
        input.close();
    }
}
