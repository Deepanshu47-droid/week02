package com.ecommerceplatform;

class Groceries extends Product {
    private static final double GROCERIES_DISCOUNT_RATE = 0.05; // 5% discount

    //constructor to initialize values
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    //implementation of calculateDiscount() method
    @Override
    public double calculateDiscount() {
        return getPrice() * GROCERIES_DISCOUNT_RATE;
    }
}