import java.util.Scanner;
class Vehicle {
    //creating static variable rergistration fees
    static double registrationFee;

    //creating variables ownerName, vehicleType and registrationNumber to indicate name of owner, vehicle type and registration number
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;

    //constructor to initialize values
    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //method to update registration fee
    public static void updateRegistrationFee(double registrationFees) {
        Vehicle.registrationFee = registrationFee;
    }
    //method to display details
    public void display() {
        System.out.println("Owner name : " + this.ownerName);
        System.out.println("Vehicle type : " + this.vehicleType);
        System.out.println("Registration number : " + this.registrationNumber);
        System.out.println("Registration fee : " + Vehicle.registrationFee);
    }

}
public class VehicleRegistration {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for registration fee
        System.out.print("Enter registration fee : ");
        Vehicle.registrationFee = input.nextDouble();

        //creating a variable exit to indicate if a user want to exit or continue
        int exit = 1;


        //loop until user don't want to exit
        while(exit == 1 || exit == 2) {
            input.nextLine();
            //if exit = 2, updating the registration fee
            if(exit == 2) {
                System.out.print("Enter new registration fee : ");
                double newRegistrationFee = input.nextDouble();
                Vehicle.updateRegistrationFee(newRegistrationFee);
                System.out.println("Updated registration fees is " + newRegistrationFee + "...");
                input.nextLine();
            }


            //taking user input for vehicle details
            System.out.println("\nFetching details for a vehicle.... ");
            System.out.print("Enter owner name : ");
            String ownerName = input.nextLine();
            System.out.print("Enter vehicle type : ");
            String vehicleType = input.nextLine();
            System.out.print("Enter registration number (integer) : ");
            int registrationNumber = input.nextInt();

            //creating object of Vehicle class
            Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);

            //checking whether the vehicle object belongs to Vehicle class or not
            if(vehicle instanceof Vehicle) {
                //printing details
                vehicle.display();
            }

            //asking user to continue or exit or update registration number
            System.out.print("\nEnter 1 to continue... \n2 to update registration fee... \nelse press any number... ");
            exit = input.nextInt();
        }
        //closing the input
        input.close();
    }
}
