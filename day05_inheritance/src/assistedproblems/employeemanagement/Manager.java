package assistedproblems.employeemanagement;

public class Manager extends Employee {
    //fields
    public int teamSize;

    //constructor to initialize values
    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    //overriding display() method
    @Override
    public void display() {
        super.display();
        System.out.println("Team size : " + this.teamSize);
    }
}
