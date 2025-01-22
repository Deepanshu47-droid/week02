package com.companyApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private String position;

    // Constructor to initialize Employee
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name + ", Position: " + position);
    }
}

// Department class
class Department {
    private String name;

    // Employees belong to a Department
    private List<Employee> employees;

    // Constructor to initialize Department
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Adding an employee to the department
    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    // Displaying department details
    public void displayDetails() {
        System.out.println("Department Name: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}

// Company class
class Company {
    private String name;
    private List<Department> departments; // Departments belong to the Company

    // Constructor to initialize Company
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Adding a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Displaying company details
    public void displayDetails() {
        System.out.println("\nCompany Name: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    // Clearing all departments (composition relationship)
    public void deleteCompany() {
        // Removing all departments and employees
        departments.clear();
        System.out.println("Company and all its departments and employees have been deleted.");
    }
}

// Main class to test the implementation with user input
public class CompanyApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating a Company
        System.out.print("Enter the company name: ");
        String companyName = input.nextLine();
        Company company = new Company(companyName);

        // Adding Departments
        System.out.print("Enter the number of departments: ");
        int numberOfDepartments = input.nextInt();
        input.nextLine(); // Consume newline character

        for (int i = 1; i <= numberOfDepartments; i++) {
            System.out.print("Enter the name of Department " + i + ": ");
            String departmentName = input.nextLine();
            Department department = new Department(departmentName);

            // Adding Employees to the Department
            System.out.print("Enter the number of employees in " + departmentName + ": ");
            int numberOfEmployees = input.nextInt();
            input.nextLine(); // Consume newline character

            for (int j = 1; j <= numberOfEmployees; j++) {
                System.out.print("Enter the name of Employee " + j + ": ");
                String employeeName = input.nextLine();
                System.out.print("Enter the position of Employee " + j + ": ");
                String employeePosition = input.nextLine();
                department.addEmployee(employeeName, employeePosition);
            }

            // Adding Department to Company
            company.addDepartment(department);
        }

        // Displaying Company Details
        company.displayDetails();

        //deletion of the Company
        System.out.println("\nDo you want to delete the company? (yes/no): ");
        String deleteChoice = input.nextLine();
        if (deleteChoice.equalsIgnoreCase("yes")) {
            company.deleteCompany();
        } else {
            System.out.println("Company not deleted.");
        }

        // Closing the input
        input.close();
    }
}
