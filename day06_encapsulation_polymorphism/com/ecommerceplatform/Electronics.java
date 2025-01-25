package com.ecommerceplatform;

// Subclass: Electronics
class Electronics extends Product implements Taxable {
    //fields
    private static final double ELECTRONICS_TAX_RATE = 0.18; // 18% tax
    private static final double ELECTRONICS_DISCOUNT_RATE = 0.10; // 10% discount

    //constructor to initialize values
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
    //implementation of calculateDiscount() method
    @Override
    public double calculateDiscount() {
        return getPrice() * ELECTRONICS_DISCOUNT_RATE;
    }
    //implementation of calculateTax() method
    @Override
    public double calculateTax() {
        return getPrice() * ELECTRONICS_TAX_RATE;
    }
    //implementation of getTaxDetails() method
    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: 18%";
    }
}
