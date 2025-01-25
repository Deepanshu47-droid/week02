package com.librarymanagementsystem;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor to initialize values
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Concrete Method: to Get Item Details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract Method: to Get Loan Duration
    public abstract int getLoanDuration();

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}