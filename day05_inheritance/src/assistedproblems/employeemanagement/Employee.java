package assistedproblems.employeemanagement;

public class Employee {
    //fields
    public String name;
    public String id;
    public double salary;

    //constructor to initialize values
    public Employee(String name, String id, double salary) {
        this.name = name;
        this. id = id;
        this.salary = salary;
    }

    //method to display details
    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Id : " + this.id);
        System.out.println("Salary : " + this.salary);
    }
}
