package singleinheritance.LibraryManagement;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for BookDetails
        System.out.print("Enter Book's title : ");
        String title = input.nextLine();
        System.out.print("Enter Book's publication year : ");
        int publicationYear = input.nextInt();

        input.nextLine();
        //taking input for author
        System.out.print("Enter Author's name : ");
        String authorName = input.nextLine();
        System.out.print("Enter Bio : ");
        String bio = input.nextLine();

        //creating Author class object
        Author author = new Author(title, publicationYear, authorName, bio);

        //printing details
        System.out.println();
        author.display();

        //closing the input
        input.close();
    }
}
