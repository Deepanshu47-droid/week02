import java.util.Scanner;
public class CarRentalSystem {
    //creating data members
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double cost;
    private double totalCost;

    //creating constructor
    public CarRentalSystem(String customerName, String carModel, int rentalDays, double cost) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.cost = cost;

        //calculating the total cost
        this.totalCost = rentalDays * cost;
    }

    //creating method to display details
    public void printDetails() {
        System.out.println("Name of customer : " + this.customerName);
        System.out.println("car model : " + this.carModel);
        System.out.println("rental days : " + this.rentalDays);
        System.out.println("cost per day : " + this.cost);
        System.out.println("Total cost : " + this.totalCost);
    }
    //main method
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);



        //taking user inputs for customerName, carModel, rentalDays and cost per day
        System.out.print("Enter customer name : ");
        String customerName = input.nextLine();
        System.out.print("Enter car model : ");
        String carModel = input.nextLine();
        System.out.print("Enter rental days : ");
        int rentalDays = input.nextInt();
        System.out.print("Enter cost per day : ");
        double cost = input.nextDouble();

        //creating object car1 of CarRentalSystem class
        CarRentalSystem car1 = new CarRentalSystem(customerName, carModel, rentalDays, cost);

        //printing details of car1 object
        System.out.println("\nDetails of car1 object : ");
        car1.printDetails();

        //closing the input
        input.close();
    }
}
