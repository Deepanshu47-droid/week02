import java.util.Scanner; 
class MobilePhone {
	private String brand;
	private String model;
	private double price;
	
	//making constructor
	public MobilePhone(String brand, String model, double price) {
			this.brand = brand;
			this.model = model;
			this.price = price;
	}
	
	//method to print mobile details
	public void printDetails() {
		System.out.println("\n----Mobile details----");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}
}
public class MobileDetails {
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
	
		//taking user inputs for brand, model and price
		System.out.print("Enter brand : ");
		String brand = input.nextLine();
		System.out.print("Enter model : ");
		String model = input.nextLine();
		System.out.print("Enter price of mobile : ");
		Double price = input.nextDouble();
		
		//creating a object of MobilePhone class
		MobilePhone mobile = new MobilePhone(brand, model, price);
		
		//printing details of mobile
		mobile.printDetails();
		
		//closing input
		input.close();
	}
}
		