package com.hospitalpatientmanagement;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    //constructor to initialize values
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract Method to Calculate Bill
    public abstract double calculateBill();

    //Method to Get Patient Details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}