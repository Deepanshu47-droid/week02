import java.util.Scanner;
class Product {
    //creating a static variable discount to indicate discount
    static double discount;

    //creating variables productName, price and quantity to indicate name of product, price and quantity
    private String productName;
    private double price;
    private double quantity;

    //creating final variable product id to indicate id of product
    private final int productId;

    //constructor to initialize values
    public Product(String productName, double price, double quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId =  productId;
    }

    //static method to update discount
    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }

    //method to display details
    public void display() {
        System.out.println("Product name : " + this.productName);
        System.out.println("Price : " + this.price);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Product ID : " + this.productId);
    }
}
public class ProductTest {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for discount amount
        System.out.print("Enter discount percentage : ");
        Product.discount = input.nextDouble();

        //creating a variable exit to indicate if a user want to exit or continue
        int exit = 1;


        //loop until user don't want to exit
        while(exit == 1 || exit == 2) {
            input.nextLine();
            //if exit = 2, updating the discount
            if(exit == 2) {
                System.out.print("Enter new discount : ");
                double newDiscount = input.nextDouble();
                Product.updateDiscount(newDiscount);
                System.out.println("Updated discount is " + newDiscount + "...");
            }


            //taking user input for product details
            System.out.println("\nFetching details for a product..... ");
            System.out.print("Enter product name : ");
            String productName = input.nextLine();
            System.out.print("Enter price : ");
            double price = input.nextDouble();
            System.out.print("Enter quantity : ");
            double quantity = input.nextDouble();
            System.out.print("Enter product ID (integer) : ");
            int productId = input.nextInt();

            //creating object of Product class
            Product product = new Product(productName, price, quantity, productId);

            //checking whether the product object belongs to Product class or not
            if(product instanceof Product) {
                //printing details
                product.display();
            }

            //asking user to continue or exit or update discount
            System.out.print("\nEnter 1 to continue... \n2 to update discount... \nelse press any number... ");
            exit = input.nextInt();

        }
        //closing the input
        input.close();
    }
}
