package com.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {
    //fields
    private double fixedSalary;
    private String departmentName;

    //constructor to initialize value
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    //implementing calculateSalary() method
    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.fixedSalary;
    }
    //implementing assignDepartment() method
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }
    //implementing getDepartmentDetails() method
    public String getDepartmentDetails() {
        return this.departmentName;
    }

    //setter methods
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    //getter methods
    public double getFixedSalary() {
        return this.fixedSalary;
    }
}
