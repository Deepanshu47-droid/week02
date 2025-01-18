// Employee class
class Employee {
    // Public field for employee ID
    public int employeeID;

    // Protected field for department
    protected String department;

    // Private field for salary
    private double salary;

    // Constructor to initialize the Employee object
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Manager class
class Manager extends Employee {

    // Constructor to initialize the Manager object
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display Manager-specific information
    public void displayManagerInfo() {
        System.out.println("Manager Info:");
        System.out.println("Employee ID: " + employeeID);  // Accessing public field (employeeID)
        System.out.println("Department: " + department);  // Accessing protected field (department)
        displayEmployeeInfo();  // Calling the method from the base class to display full employee details
    }
}

// EmployeeDetails class (to test the implementation)
public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "Finance", 50000.0);
        employee.displayEmployeeInfo();

        // Modifying salary using setter method
        employee.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Creating a Manager object
        Manager manager = new Manager(102, "HR", 75000.0);
        manager.displayManagerInfo();
    }
}
