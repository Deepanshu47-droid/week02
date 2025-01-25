package com.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {

        // Creating a list of products
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(201, "T-Shirt", 1000));
        products.add(new Groceries(301, "Apples", 200));

        // Calculating and printing the final price for each product
        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0.0;
            double finalPrice = price + tax - discount;

            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Base Price: " + price);
            System.out.println("Discount: -" + discount);
            System.out.println("Tax: +" + tax);
            System.out.println("Final Price: " + finalPrice);

            // Displaying tax details for taxable products
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("------------------------------------");
        }
    }
}

