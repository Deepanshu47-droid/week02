package com.ecommerceplatform;

class Clothing extends Product implements Taxable {

    //fields
    private static final double CLOTHING_TAX_RATE = 0.05; // 5% tax
    private static final double CLOTHING_DISCOUNT_RATE = 0.15; // 15% discount

    //constructor to initialize values
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    //implementation of calculateDiscount() method
    @Override
    public double calculateDiscount() {
        return getPrice() * CLOTHING_DISCOUNT_RATE;
    }

    @Override
    public double calculateTax() {
        return getPrice() * CLOTHING_TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: 5%";
    }
}