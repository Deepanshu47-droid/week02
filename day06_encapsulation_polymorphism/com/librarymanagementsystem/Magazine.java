package com.librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    // Constructor to initialize values
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }


    //implementation of getLoanDuration() method
    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be borrowed for 7 days
    }

    //implementation of reverseItem() method
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is currently not available.");
        }
    }

    //implementation of checkAvailability() method
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}