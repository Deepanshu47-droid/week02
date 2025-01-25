package com.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0.0;
    private static final double NON_VEG_EXTRA_CHARGE = 10.0;

    // Constructor to initialize values
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    //implementation of calculateTotalPrice() method
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + NON_VEG_EXTRA_CHARGE) - discount;
    }
    //implementation of applyDiscount() method
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = (getPrice() * getQuantity() * discountPercentage) / 100;
    }
    //implementation of getDiscountDetails() method
    @Override
    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: $" + discount;
    }
}
