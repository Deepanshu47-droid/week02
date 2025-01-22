package com.universityManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing a Faculty
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Faculty Name: " + name);
    }
}

// Class representing a Department
class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayFaculties() {
        System.out.println("Department: " + name);
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            faculty.display();
        }
    }
}

// Class representing a University
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("University: " + name);
        for (Department department : departments) {
            department.displayFaculties();
            System.out.println();
        }
    }
}

// Main class to demonstrate composition and aggregation
public class UniversityManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input university details
        System.out.print("Enter the name of the university: ");
        String universityName = input.nextLine();
        University university = new University(universityName);

        // Input number of departments
        System.out.print("Enter the number of departments: ");
        int numDepartments = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numDepartments; i++) {
            // Input department details
            System.out.print("Enter the name of department " + (i + 1) + ": ");
            String departmentName = input.nextLine();
            Department department = new Department(departmentName);

            // Input number of faculties in the department
            System.out.print("Enter the number of faculties in " + departmentName + ": ");
            int numFaculties = input.nextInt();
            input.nextLine();

            for (int j = 0; j < numFaculties; j++) {
                System.out.print("Enter the name of faculty " + (j + 1) + ": ");
                String facultyName = input.nextLine();
                Faculty faculty = new Faculty(facultyName);
                department.addFaculty(faculty);
            }

            university.addDepartment(department);
        }

        // Display university details
        university.displayDepartments();

        // Closing input scanner
        input.close();

        // Demonstrating composition
        System.out.println("\nDeleting the university also deletes its departments.");
    }
}
