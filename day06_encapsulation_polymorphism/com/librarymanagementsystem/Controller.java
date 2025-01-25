package com.librarymanagementsystem;

public class Controller {
    public static void main(String[] args) {
        // Creating Library Items
        LibraryItem book = new Book("B001", "Effective Java", "Joshua Bloch");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Editorial Team");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Processing Library Items
        LibraryItem[] libraryItems = {book, magazine, dvd};
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("-----------------------------------------");
        }

        // Reserving Items
        Reservable reservableBook = (Reservable) book;
        Reservable reservableMagazine = (Reservable) magazine;
        Reservable reservableDVD = (Reservable) dvd;

        reservableBook.reserveItem("Shubham");
        reservableMagazine.reserveItem("Raj");
        reservableDVD.reserveItem("Gagan");

        // Checking Availability
        System.out.println("\nChecking availability after reservation:");
        System.out.println("Book available: " + reservableBook.checkAvailability());
        System.out.println("Magazine available: " + reservableMagazine.checkAvailability());
        System.out.println("DVD available: " + reservableDVD.checkAvailability());
    }
}
