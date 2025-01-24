package hybridinheritance.reataurantmanagement;
import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for Person
        System.out.println("\nFetching person's details...");
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter id : ");
        String id = input.nextLine();

        //creating Person class object
        Person person = new Person(name, id);

        //printing details of person
        System.out.println("\nDetails of Person.....");
        person.display();

        //taking user input for chef
        System.out.println("\nFetching chef's details...");
        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter id : ");
        id = input.nextLine();
        System.out.print("Enter speciality : ");
        String speciality = input.nextLine();

        //creating Chef class object
        Chef chef = new Chef(name, id, speciality);

        //printing details of chef
        System.out.println("\nDetails of chef.....");
        chef.display();
        //calling method performDuties()
        chef.performDuties();

        //taking user input for waiter
        System.out.println("\nFetching waiter's details...");
        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter id : ");
        id = input.nextLine();

        //creating Waiter class object
        Waiter waiter = new Waiter(name, id);

        //printing details of waiter
        System.out.println("\nDetails of waiter.....");
        waiter.display();
        //calling method performDuties()
        waiter.performDuties();

        //closing input
        input.close();
    }
}
