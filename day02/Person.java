import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    //creating parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //creating copy constructor
    public Person(Person p1) {
        this.name = p1.name;
        this.age = p1.age;
    }
    //method to print details
    public void printDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    //main method
    public static void main(String[] args) {

        //creating scanner class object to take input
        Scanner input = new Scanner(System.in);

        //taking user input for name and age
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.print("Enter age : ");
        int age = input.nextInt();

        //creating object of person class
        Person p1 = new Person(name, age);

        //creating another object using copy constructor
        Person p2 = new Person(p1);

        //printing the details of p1
        System.out.println("printing the details of p1 : ");
        p1.printDetails();
        //printing the details of p2
        System.out.println("printing the details of p2 : ");
        p2.printDetails();

        //closing the input
        input.close();
    }
}
