package com.employeemanagementsystem;

abstract class Employee {
    //fields
    private int employeeId;
    private String name;
    private double baseSalary;

    //abstract method to calculate salary
    public abstract double calculateSalary();

    //constructor to initialize values
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this. baseSalary = baseSalary;
    }

    //method to display details
    public void display() {
        System.out.println("Employee Id : " + this.employeeId);
        System.out.println("Name : " + this.name);
        System.out.println("Base salary : " + this.baseSalary);
    }
    //setter methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //getter methods
    public int getEmployeeId() {
        return this.employeeId;
    }
    public String getName() {
        return this.name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
}
