package com.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discount = 0.0;

    // Constructor to initialize values
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    //implementation of calculateTotalPrice() method
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }
    //implementation of applyDiscount() method
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = (getPrice() * getQuantity() * discountPercentage) / 100;
    }
    //implementation of getDiscountDetails() method
    @Override
    public String getDiscountDetails() {
        return "Discount on Veg Item: $" + discount;
    }
}