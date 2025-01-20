import java.util.Scanner;

class Book {
    //creating static variable libraryName to indicate name of library
    public static String libraryName;

    //creating variables title, author and isbn to indicate title, author and isbn of a book
    private String title;
    private String author;
    private final String isbn;

    //constructor to initialize values
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //method to display library name
    public static void displayLibraryName() {
        System.out.println("Library name is : " + libraryName);
    }
    //method to display details
    public void display() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN : " + this.isbn);
    }
}
public class BookTest {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for bank name
        System.out.print("Enter Library name : ");
        Book.libraryName = input.nextLine();

        //displaying the library name
        Book.displayLibraryName();

        //creating a variable exit to indicate if a user want to exit or continue
        int exit = 1;

        //loop until user don't want to exit
        while(exit == 1) {

            System.out.println("\nFetching book details.... ");
            //taking user input for title, author and isbn
            System.out.print("Enter title : ");
            String title = input.nextLine();
            System.out.print("Enter author : ");
            String author = input.nextLine();
            System.out.print("Enter ISBN : ");
            String isbn = input.nextLine();

            //creating object of Book class
            Book book = new Book(title, author, isbn);

            //checking whether the book is the object of Book class or not
            if(book instanceof Book) {
                //printing details
                book.display();
            }

            //asking user to continue or exit
            System.out.print("Enter 1 to continue else press any number : ");
            exit = input.nextInt();
            input.nextLine();
        }

        //closing the input
        input.close();
    }
}
