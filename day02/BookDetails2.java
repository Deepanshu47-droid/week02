import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private double price;

    //default constructor
    public Book() {
        this.title = "unknown";
        this.author = "unknown";
        this.price = 0;
    }
    //parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to print book details
    public void printDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}
public class BookDetails2 {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

       //creating object book1 of book class using default constructor
        Book book1 = new Book();

        //taking user inputs for title author and price for book2 defined below
        System.out.print("Enter title : ");
        String title = input.nextLine();
        System.out.print("Enter author : ");
        String author = input.nextLine();
        System.out.print("Enter price : ");
        double price = input.nextDouble();

        //creating object  book2 of book class using parameterized constructor
        Book book2 = new Book(title, author, price);

        //printing details of book1 object
        System.out.println("Details of book1 object : ");
        book1.printDetails();

        //printing details of book2 object
        System.out.println("Details of book2 object : ");
        book2.printDetails();

        //closing input
        input.close();
    }
}
		