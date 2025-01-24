package hierarchicalinheritance.schoolsystem;

public class Staff extends Person {
    //fields
    public String designation;

    //constructor to initialize values
    public Staff(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }
    //overriding method displayRole()
    @Override
    public void displayRole() {
        System.out.println("Role : Staff");
    }
    //overriding method display()
    @Override
    public void display() {
        super.display();
        System.out.println("Designation : " + this.designation);
    }
}
