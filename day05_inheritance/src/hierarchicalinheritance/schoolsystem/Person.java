package hierarchicalinheritance.schoolsystem;

public class Person {
    //fields
    public String name;
    public int age;

    //constructor to initialize values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //method to display role
    public void displayRole() {
        System.out.println("Role : Person");
    }
    //method to print details
    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}
