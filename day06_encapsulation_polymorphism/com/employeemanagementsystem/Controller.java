package com.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        //Creating a list of employees
        List<Employee> employees = new ArrayList<>();

        // Adding FullTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Deepanshu malviya", 30000, 20000);
        fullTimeEmployee.assignDepartment("Finance");
        employees.add(fullTimeEmployee);

        // Adding PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Shubham kumar", 15000, 80, 200);
        partTimeEmployee.assignDepartment("HR");
        employees.add(partTimeEmployee);

        // Processing the list of employees
        for (Employee employee : employees) {
            employee.display();
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("-----------------------------------");
        }
    }
}
