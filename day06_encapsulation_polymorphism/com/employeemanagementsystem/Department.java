package com.employeemanagementsystem;

public interface Department {
    //method to assign department to be implemented in derived classes
    void assignDepartment(String departmentName);

    //method to get department details to be implemented in derived classes
    String getDepartmentDetails();
}
