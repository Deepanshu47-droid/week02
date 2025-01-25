package com.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    // Constructor to initialize values
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //implementation of getLoanDuration() method
    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be borrowed for 5 days
    }

    //implementation of reverseItem() method
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is currently not available.");
        }
    }

    //implementation of checkAvailability() method
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}