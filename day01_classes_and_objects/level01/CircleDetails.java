import java.util.Scanner; 
class Circle {
	private final double PI = 3.14;
	private double radius;
	private double area;
	private double circumference;
	
	//making constructor
	public Circle() {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking user input for radius
		System.out.print("Enter radius : ");
		radius = input.nextDouble();
		
		//closing input
		input.close();
	}
	
	//method to calculate area and circumference
	public void calculateAreaAndCircumference() {
		
		//calculating area
		area = PI * radius * radius;
		
		//calculating circumference
		circumference = 2 * PI * radius;
	}
	
	
	//method to print area and circumference
	public void printAreaAndCircumference() {
		System.out.println("Area : " + area);
		System.out.println("Circumference : " + circumference);
	}
}
public class CircleDetails {
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//creating object of circle class 
		Circle cir = new Circle();
		
		//calculating area and circumference
		cir.calculateAreaAndCircumference();
		
		//printing area and circumference of circle
		cir.printAreaAndCircumference();
		
		//closing input
		input.close();
	}
}
		