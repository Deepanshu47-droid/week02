import java.util.Scanner; 
class Item {
	private String itemCode;
	private String itemName;
	private double price;
	
	//making constructor
	public Item(String itemCode, String itemName, double price) {
			this.itemCode = itemCode;
			this.itemName = itemName;
			this.price = price;
	}
	
	//method to calculate cost of x(in kg) quantity
	public double calcCost(double x) {
		//calculating the cost
		double cost = x*(this.price);
		
		return cost;
	}
	
	//method to print item details
	public void printDetails(double quantity) {
		System.out.println("\n----Item details----");
		System.out.println("Item Code : " + itemCode);
		System.out.println("Item name : " + itemName);
		System.out.println("Price : " + price);
		System.out.println("Cost of " + quantity + " kg  is " + this.calcCost(quantity));
	}
}
public class ItemDetails {
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
	
		//taking user inputs for code, name and price of item
		System.out.print("Enter item code : ");
		String itemCode = input.nextLine();
		System.out.print("Enter item name : ");
		String itemName = input.nextLine();
		System.out.print("Enter price of item (per unit) : ");
		Double price = input.nextDouble();
		
		//taking user input for quantity
		System.out.print("Enter quantity of item (in kg) : ");
		Double quantity = input.nextDouble();
		//creating a object of Item class
		Item item = new Item(itemCode, itemName, price);
		
		//printing details of item
		item.printDetails(quantity);
		
		//closing input
		input.close();
	}
}
		