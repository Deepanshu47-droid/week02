package com.ecommerceplatform;

abstract class Product {
    //fields
    private int productId;
    private String productName;
    private double price;

    //constructor to initialize values
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    //abstract method to calculate discount
    public abstract double calculateDiscount();

    //method to display details
    public void display() {
        System.out.println("Product ID : " + this.productId);
        System.out.println("Product name : " + this.productName);
    }
    //setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getter methods
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
