package singleinheritance.LibraryManagement;

public class Author extends Book {
    //fields
    public String authorName;
    public String bio;

    //constructor to initialize values
    public Author(String title, int publicationYear, String authorName, String bio) {

        //calling super class constructor
        super(title, publicationYear);

        this.authorName = authorName;
        this.bio = bio;
    }

    //overriding display method
    @Override
    public void display() {
        super.display();
        System.out.println("Author name : " + this.authorName);
        System.out.println("Bio : " + this.bio);
    }
}
