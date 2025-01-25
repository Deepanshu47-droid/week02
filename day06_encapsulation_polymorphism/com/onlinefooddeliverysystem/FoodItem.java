package com.onlinefooddeliverysystem;

abstract class FoodItem {
    //fields
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize values
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract Method to Calculate Total Price
    public abstract double calculateTotalPrice();

    // Method to Get Item Details
    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be positive!");
        }
    }
}