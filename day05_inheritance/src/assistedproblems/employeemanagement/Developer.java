package assistedproblems.employeemanagement;

public class Developer extends Employee {
    //fields
    public String programmingLanguage;

    //constructor to initialize values
    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    //overriding display() method
    @Override
    public void display() {
        super.display();
        System.out.println("Programming language : " + this.programmingLanguage);
    }
}
