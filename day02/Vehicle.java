import java.util.Scanner;
public class Vehicle {
    //creating data members
    private String ownerName;
    private String vehicleName;

    //creating class variable registrationFee
    private static double registrationFee;

    //creating constructor to initialize variables
    public Vehicle(String ownerName, String vehicleName) {
        this.ownerName = ownerName;
        this.vehicleName = vehicleName;

    }
    //method to update registration fees
    public static void updateRegistrationFee(double registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    //method to display vehicle details
    public void displayDetails() {
        System.out.println("owner name : " + this.ownerName);
        System.out.println("vehicle name : " + this.vehicleName);
        System.out.println("registration fees : " + registrationFee);
    }

    //main method
    public static void main(String[] args) {

        //creating scanner class object to take user input
        Scanner input = new Scanner(System.in);

        //taking user input for institute name
        System.out.print("Enter registration fees : ");
        double registrationFee = input.nextDouble();

        //updating the registration fees
        updateRegistrationFee(registrationFee);

        input.nextLine();
        //taking user input for vehicle details
        System.out.println("Enter details for vehicle " + 1);
        System.out.print("Enter owner : ");
        String ownerName = input.nextLine();
        System.out.print("Enter vehicle name : ");
        String vehicleName = input.nextLine();

        //creating object vehicle1 of Product class
        Vehicle vehicle1 = new Vehicle(ownerName, vehicleName);

        //printing details of vehicle 1
        System.out.println("details of vehicle 1 : ");
        vehicle1.displayDetails();


        //taking user input for new registration fees
        System.out.print("Enter new registration fees : ");
        registrationFee = input.nextDouble();

        //updating the registration fees
        updateRegistrationFee(registrationFee);

        input.nextLine();
        //taking user input for vehicle 2
        System.out.println("Enter details for vehicle " + 2);
        System.out.print("Enter owner name : ");
        ownerName = input.nextLine();
        System.out.print("Enter vehicle name : ");
        vehicleName = input.nextLine();

        //creating object vehicle2 of vehicle class
        Vehicle vehicle2 = new Vehicle(ownerName, vehicleName);

        //printing details of vehicle 2
        System.out.println("details of vehicle 2 : ");
        vehicle2.displayDetails();

        //printing details of vehicle 1 and you can see registration fees is also updated for vehicle 1
        System.out.println("details of vehicle 1 : ");
        vehicle1.displayDetails();

        System.out.println("you can see above the registration fees is also updated for vehicle 1");

        //closing the input
        input.close();
    }
}
