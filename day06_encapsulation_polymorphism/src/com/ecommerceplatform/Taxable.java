package com.ecommerceplatform;

interface Taxable {

    //method to calculate tax to be implemented in drived class
    double calculateTax();

    //method to get tax details to be implemented in drived class
    String getTaxDetails();
}