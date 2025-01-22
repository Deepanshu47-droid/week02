package com.libraryAndBooks;
import java.util.Scanner;

class Book {
    //creating variables title and author to indicate title and author of book
    String title;
    String author;

    //constructor to initialize values
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //method to display details
    public void display() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
    }
}
class Library {
    private String libraryName;
    private String libraryCode;
    private Book[] books;

    //constructor to initialize values
    public Library(String libraryName, String libraryCode, Book[] books) {
        this.libraryName = libraryName;
        this.libraryCode = libraryCode;
        this.books = books;
    }
    //method to print details
    public void displayLibrary() {
        System.out.println("\nLibrary name : " + this.libraryName);
        System.out.println("Library code : " + this.libraryCode);

        //printing details of books
        for(int i=0; i<books.length; i++) {
            System.out.println("Book " + (i+1) + " is " + books[i].title + " and it's author is " + books[i].author);
        }
    }
}
public class LibraryAndBooks {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for library details
        System.out.println("\nFetching details for a library.... ");
        System.out.print("Enter library's Name : ");
        String libraryName = input.nextLine();
        System.out.print("Enter library code : ");
        String libraryCode = input.nextLine();
        System.out.print("Enter number of books : ");
        int numberOfBooks = input.nextInt();

        //creating array books to store books and a variable to indicate index of array
        Book[] books = new Book[numberOfBooks];
        int index = 0;
        input.nextLine();
        //taking input for book details of current library
        for (int i = 0; i < numberOfBooks; i++) {

            System.out.print("Enter title of book " + (i+1) + " : ");
            String title = input.nextLine();
            System.out.print("Enter author : ");
            String author = input.nextLine();

            //creating object of Book class
           Book book = new Book(title, author);

            //appending the new book in Book array
            books[index] = book;
            index++;
        }
        //creating object of Library class
        Library library1 = new Library(libraryName, libraryCode, books);

        //printing details
        library1.displayLibrary();

        //taking input for library2 details
        input.nextLine();
        System.out.println("Fetching details for a library.... ");
        System.out.print("Enter library's Name : ");
        libraryName = input.nextLine();
        System.out.print("Enter library code : ");
        libraryCode = input.nextLine();
        System.out.print("Enter number of books : ");
        numberOfBooks = input.nextInt();

        //creating array books to store books and a variable to indicate index of array
        books = new Book[numberOfBooks];
        index = 0;

        //taking input for book details of current library
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print("Enter title of book " + (i+1) + " : ");
            String title = input.nextLine();
            System.out.print("Enter author : ");
            String author = input.nextLine();

            //creating object of Book class
            Book book = new Book(title, author);

            //appending the new book in Book array
            books[index] = book;
            index++;
        }
        //creating object of Library class
        Library library2 = new Library(libraryName, libraryCode, books);

        //printing details
        library2.displayLibrary();

        //closing the input
        input.close();
    }
}
