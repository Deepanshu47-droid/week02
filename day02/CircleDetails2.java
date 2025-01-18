import java.util.Scanner;
class Circle {
    private final double PI = 3.14;
    private double radius;
    private double area;
    private double circumference;

    //making default constructor
    public Circle() {
        //declaring radius by default zero if user not inserted
        this(0.0);
    }
    //parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
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
public class CircleDetails2 {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //taking user input for radius
        System.out.print("Enter radius : ");
        double radius = input.nextDouble();

        //creating object of circle class using default constructor
        Circle cir = new Circle();

        //creating another object of circle class using parameterized constructor
        Circle cir2 = new Circle(radius);

        //calculating area and circumference for cir1
        cir.calculateAreaAndCircumference();

        //printing area and circumference of circle of cir1
        cir.printAreaAndCircumference();

        //calculating area and circumference for cir2
        cir2.calculateAreaAndCircumference();

        //printing area and circumference of circle of cir2
        cir2.printAreaAndCircumference();

        //closing input
        input.close();
    }
}
		