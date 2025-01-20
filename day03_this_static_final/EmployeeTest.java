import java.util.Scanner;

class Employee {
    //creating a static variable companyName and totalEmployee
    public static String companyName;
    private static int totalEmployee;

    //creating variables name, id and designation to indicate name, id and designation of employee
    private String name;
    private String id;
    private String designation;

    //constructor to initiate values
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;

        totalEmployee++;
    }
    //method to display total number of employees
    public static void getTotalEmployee() {
        System.out.println("Total number of employees : " + totalEmployee);
    }
    //method to display details
    public void display() {
        System.out.println("Company name : " + companyName);
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("Designation : " + this.designation);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for bank name
        System.out.print("Enter Company name : ");
        Employee.companyName = input.nextLine();

        //creating a variable exit to indicate if a user want to exit or conntinue
        int exit = 1;

        //loop until user don't want to exit
        while(exit == 1) {

            System.out.println("\nFetching detail of employee..... ");
            //taking user input for name, id and designation
            System.out.print("Enter name : ");
            String name = input.nextLine();
            System.out.print("Enter ID : ");
            String id = input.nextLine();
            System.out.print("Enter designation : ");
            String designation = input.nextLine();

            //creating object of Employee class
            Employee employee = new Employee(name, id, designation);

            //displaying total number of employees
            Employee.getTotalEmployee();

            //checking whether the employee object belongs to Employee class or not
            if(employee instanceof Employee) {
                //printing details
                employee.display();
            }

            //asking user to continue or exit
            System.out.print("Enter 1 to continue else press any number : ");
            exit = input.nextInt();
            input.nextLine();
        }
        //closing the input
        input.close();
    }
}
