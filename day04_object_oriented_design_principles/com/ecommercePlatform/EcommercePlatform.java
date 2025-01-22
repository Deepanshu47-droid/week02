package com.ecommercePlatform;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing a Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Class representing a Customer
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void placeOrder(Order order) {
        System.out.println("Customer " + name + " has placed an order.");
        order.displayOrderDetails();
    }
}

// Class representing an Order
class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder Details:");
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Products Ordered:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

// Main class to simulate the E-commerce System
public class EcommercePlatform {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail = input.nextLine();

        // Creating a customer object
        Customer customer = new Customer(customerName, customerEmail);

        // Input number of products available for the order
        System.out.print("Enter the number of products available: ");
        int numProducts = input.nextInt();
        input.nextLine(); // to clear the buffer

        List<Product> availableProducts = new ArrayList<>();
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name " + (i + 1) + ": ");
            String productName = input.nextLine();
            System.out.print("Enter product price: ");
            double productPrice = input.nextDouble();
            input.nextLine(); // to clear the buffer

            Product product = new Product(productName, productPrice);
            availableProducts.add(product);
        }

        // Creating an order object
        Order order = new Order(customer);

        // Input number of products customer wants to order
        System.out.print("Enter the number of products the customer wants to order: ");
        int numOrderProducts = input.nextInt();
        input.nextLine(); // to clear the buffer

        // Add products to the order
        for (int i = 0; i < numOrderProducts; i++) {
            System.out.print("Enter product number (1 to " + numProducts + ") for the order: ");
            int productNumber = input.nextInt();
            input.nextLine(); // to clear the buffer

            if (productNumber >= 1 && productNumber <= numProducts) {
                order.addProduct(availableProducts.get(productNumber - 1));
            } else {
                System.out.println("Invalid product number. Try again.");
                i--;
            }
        }

        // Customer places the order
        customer.placeOrder(order);

        // Closing input scanner
        input.close();
    }
}
