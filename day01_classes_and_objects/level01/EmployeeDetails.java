import java.util.Scanner; 
class Employee {
	private String name;
	private int id;
	private double salary;
	
	//making constructor
	public Employee() {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for name, id and salary
		System.out.print("Enter name : ");
		this.name = input.nextLine();
		System.out.print("Enter ID : ");
		this.id = input.nextInt();
		System.out.print("Enter salary : ");
		this.salary = input.nextDouble();
		
	}
	
	//method to print employee details
	public void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//creating a variable numberOfEmployees to indicate number of employees
		System.out.print("Enter number of employees : ");
		int numberOfEmployees = input.nextInt();
		
		//creating an empArray of object to store details of employees
		Employee[] empArray = new Employee[numberOfEmployees];
		
		//taking details of employees as user input
		for(int i=0; i<numberOfEmployees; i++) {
			System.out.println("\nEnter details of employee " + (i+1) + " : ");
			empArray[i] = new Employee();
		}
		
		//printing details of employees
		for(int i=0; i<numberOfEmployees; i++) {
			System.out.println("\nDetails of employee " + (i+1) + " : ");
			empArray[i].printDetails();
		}
		//closing input
		input.close();
	}
}
		