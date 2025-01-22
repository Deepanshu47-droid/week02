
import java.util.Scanner;

//class Customer
class Customer {
    private String customerName;
    private final String customerId;
    private Product[] products;

    //constructor to initialize variables
    public Customer(String name, String customerId, Product[] products) {
        this.customerName = name;
        this.customerId = customerId;
        this.products = products;
    }
    //printing details
    public void display() {
        System.out.println("\nDetails of shopping ......");
        System.out.println("Name : " + this.customerName);
        System.out.println("Customer Id : " + this.customerId);

        //printing price of each product
        for (int i = 0; i < products.length; i++) {
            System.out.println("Price of product " + products[i].productName + " is " + products[i].price);
        }
        System.out.println("total Bill : " + BillGenerator.getTotalBill(products));
    }
}
//class Product
class Product {
    String productName;
    double price;

    //constructor to initialize values
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}
//class BillGenerator
class BillGenerator {
    //creating the static method to generate total bill
    public static double getTotalBill(Product[] products) {

        //creating variable total price to indicate total price
        double totalBill =0;

        //calculating total price
        for(int i=0; i< products.length; i++) {
            totalBill += products[i].price;
        }
        //returning the total price
        return totalBill;
    }
}
public class GroceryStoreBillGenerator {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for student details
        System.out.println("\nFetching details for a customer.... ");
        System.out.print("Enter Name : ");
        String customerName = input.nextLine();
        System.out.print("Enter customer id : ");
        String customerId = input.nextLine();
        System.out.print("Enter number of products : ");
        int numberOfProducts = input.nextInt();

        //creating array products to store products and a variable to indicate index of array
        Product[] products = new Product[numberOfProducts];
        int index = 0;

        //taking input for product details of current customer
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter name of product " + (i+1) + " : ");
            String productName = input.next();
            System.out.print("Enter price : ");
            double price = input.nextDouble();

            //creating object of Product class
            Product product = new Product(productName, price);

            //appending the new product in Product array
            products[index] = product;
            index++;
        }
        //creating object of Customer class
        Customer customer1 = new Customer(customerName, customerId, products);

        //printing details
        // calculation of total bill  in display() method of Customer class
        customer1.display();

        //closing the input
        input.close();
    }
}
