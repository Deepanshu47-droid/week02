import java.util.Scanner; 
class Book {
	private String title;
	private String author;
	private double price;
	
	//making constructor
	public Book() {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for title, author and price of book
		System.out.print("Enter title of book : ");
		title = input.nextLine();
		System.out.print("Enter author's name : ");
		author = input.nextLine();
		System.out.print("Enter price of book : ");
		price = input.nextDouble();
	
	}
	
	//method to print book details
	public void printDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}
}
public class BookDetails {
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//creating a variable numberOfBooks to indicate number of books
		System.out.print("Enter number of books : ");
		int numberOfBooks = input.nextInt();
		
		//creating an book Array of objects to store details of books
		Book[] bookArray = new Book[numberOfBooks];
		
		//taking details of books as user input
		for(int i=0; i<numberOfBooks; i++) {
			System.out.println("\nEnter details of book " + (i+1) + " : ");
			bookArray[i] = new Book();
		}
		
		//printing details of books
		for(int i=0; i<numberOfBooks; i++) {
			System.out.println("\nDetails of book " + (i+1) + " : ");
			bookArray[i].printDetails();
		}
		//closing input
		input.close();
	}
}
		