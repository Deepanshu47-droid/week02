package com.onlinefooddeliverysystem;

interface Discountable {
    //method to apply discount to be implemented in derived class
    void applyDiscount(double discountPercentage);
    //method to get discount details to be implemented in derived class
    String getDiscountDetails();
}