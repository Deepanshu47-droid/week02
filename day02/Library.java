import java.util.Scanner;
class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    //making constructor
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }
    //method to borrow a book
    public void borrow() {
        this.availability = false;
    }

    //method to print book details
    public void printDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Is the book available? " + availability);
    }
}
public class Library {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //taking user inputs for title, author and price of book
        System.out.print("Enter title of book : ");
        String title = input.nextLine();
        System.out.print("Enter author's name : ");
        String author = input.nextLine();
        System.out.print("Enter price of book : ");
        double price = input.nextDouble();

        //creating a book object
        Book2 book = new Book2(title, author, price);

        //printing details of books before borrow
        System.out.println("Details before borrow : ");
        book.printDetails();

        //borrowing book
        book.borrow();

        //printing details of books after borrow
        System.out.println("Details after borrow : ");
        book.printDetails();

        //closing input
        input.close();
    }
}
		