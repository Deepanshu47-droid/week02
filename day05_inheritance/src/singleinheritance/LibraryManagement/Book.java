package singleinheritance.LibraryManagement;

public class Book {
    //fields
    public String title;
    public int publicationYear;


    //constructor to initialize values
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //method to display information
    public void display() {
        System.out.println("Title : " + this.title);
        System.out.println("Publication year : " + this.publicationYear);
    }
}
