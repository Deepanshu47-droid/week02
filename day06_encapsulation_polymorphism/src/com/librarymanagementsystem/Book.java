package com.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    // Constructor to initialize values
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //implementation of getLoanDuration() method
    @Override
    public int getLoanDuration() {
        return 14; // Books can be borrowed for 14 days
    }

    //implementation of reverseItem() method
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    //implementation of checkAvailability() method
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}