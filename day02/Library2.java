class Book3 {
    // Public field for ISBN
    public String ISBN;

    // Protected field for title
    protected String title;

    // Private field for author
    private String author;

    // Constructor to initialize the Book object
    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book3 {

    // Constructor to initialize the EBook object
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display EBook-specific information
    public void displayEBookInfo() {
        System.out.println("EBook Info:");
        System.out.println("ISBN: " + ISBN);  // Accessing public field (ISBN)
        System.out.println("Title: " + title);  // Accessing protected field (title)
        // Cannot directly access 'author' here because it's private in the parent class
        System.out.println("Author: " + getAuthor());  // Using the public method to get the author's name
    }
}

// Library2 class (to test the implementation)
public class Library2 {
    public static void main(String[] args) {
        // Creating a Book object
        Book3 book = new Book3("123-456-789", "Introduction to Java", "John Smith");
        book.displayBookInfo();

        // Modifying author using setter method
        book.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book.getAuthor());

        // Creating an EBook object
        EBook eBook = new EBook("987-654-321", "Advanced Java Programming", "Alice Brown");
        eBook.displayEBookInfo();
    }
}
