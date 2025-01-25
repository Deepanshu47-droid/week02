package com.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {
    //fields
    private double hourlyRate;
    private double workHours;
    private String departmentName;

    //constructor to initialize value
    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, double workHours) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }
    //implementing calculateSalary() method
    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + (this.workHours * this.hourlyRate);
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
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    //getter methods
    public double getWorkHours() {
        return this.workHours;
    }
    public double getHourlyRate() {
        return this.hourlyRate;
    }
}
