import java.util.Scanner;
public class Product {
    //creating data members;
    private String productName;
    private double price;

    //creating class variable total products to indicate total number of products
    private static int totalProducts;

    //creating constructor to initialize variables
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        //increasing the number of products
        Product.totalProducts++;
    }

    //method to display product details
    public void displayDetails() {
        System.out.println("Product name : " + productName);
        System.out.println("Price : " + price);
    }
    //method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total number of products created is : " + totalProducts);
    }
    //main method
    public static void main(String[] args) {

        //creating scanner class object to take user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter details for product " + 1);
        System.out.print("Enter product name : ");
        String productName = input.nextLine();
        System.out.print("Enter price : ");
        double price = input.nextDouble();

        //creating object product1 of Product class
        Product product1 = new Product(productName, price);

        //printing the number of products created
        displayTotalProducts();

        //printing details of product 1
        System.out.println("details of product 1 : ");
        product1.displayDetails();

        input.nextLine();
        System.out.println("Enter details for product " + 2);
        System.out.print("Enter product name : ");
        productName = input.nextLine();
        System.out.print("Enter price : ");
        price = input.nextDouble();

        //creating object product2 of Product class
        Product product2 = new Product(productName, price);

        //printing the number of products created
        displayTotalProducts();

        //printing details of product 2
        System.out.println("details of product 2 : ");
        product2.displayDetails();

        //closing the input
        input.close();
    }
}
