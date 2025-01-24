package hierarchicalinheritance.schoolsystem;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for Person
        System.out.println("\nFetching person's details...");
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter age : ");
        int age = input.nextInt();
        input.nextLine();

        //creating Person class object
        Person person = new Person(name, age);

        //printing details of person
        System.out.println("\nDetails of Person.....");
        person.display();
        //calling displayRole() method
        person.displayRole();

        //taking user input for Teacher
        System.out.println("\nFetching teacher's details...");
        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Subject : ");
        String subject = input.nextLine();

        //creating Teacher class object
        Teacher teacher = new Teacher(name, age, subject);

        //printing details of teacher
        System.out.println("\nDetails of Teacher.....");
        teacher.display();
        //calling displayRole() method
        teacher.displayRole();

        //taking user input for student
        System.out.println("\nFetching student's details...");
        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Grade : ");
        String grade = input.nextLine();

        //creating Student class object
        Student student = new Student(name, age, subject);

        //printing details of student
        System.out.println("\nDetails of student.....");
        student.display();
        //calling displayRole() method
        student.displayRole();

        //taking user input for staff
        System.out.println("\nFetching staff's details...");
        System.out.print("Enter name : ");
        name = input.nextLine();
        System.out.print("Enter age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter designation : ");
        String designation = input.nextLine();

        //creating staff class object
        Staff staff = new Staff(name, age, designation);

        //printing details of staff
        System.out.println("\nDetails of staff.....");
        staff.display();
        //calling displayRole() method
        staff.displayRole();

        //closing input object
        input.close();
    }
}
