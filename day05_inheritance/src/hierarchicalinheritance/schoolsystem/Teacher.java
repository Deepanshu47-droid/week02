package hierarchicalinheritance.schoolsystem;

public class Teacher extends Person{
    //fields
    public String subject;

    //constructor to initialize values
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    //overriding method displayRole()
    @Override
    public void displayRole() {
        System.out.println("Role : Teacher");
    }
    //overriding method display()
    @Override
    public void display() {
        super.display();
        System.out.println("Subject : " + this.subject);
    }
}
