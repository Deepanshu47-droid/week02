package com.librarymanagementsystem;

interface Reservable {

    //method to reverse items
    void reserveItem(String borrowerName);
    //method to check availability
    boolean checkAvailability();
}