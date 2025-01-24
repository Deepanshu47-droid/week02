package hierarchicalinheritance.schoolsystem;

public class Student extends Person {
    //fields
    public String grade;

    //constructor to initialize values
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    //overriding method displayRole()
    @Override
    public void displayRole() {
        System.out.println("Role : Student");
    }
    //overriding method display()
    @Override
    public void display() {
        super.display();
        System.out.println("Grade : " + this.grade);
    }
}
