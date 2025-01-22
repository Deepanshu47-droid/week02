package com.hospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing a Patient
class Patient {
    private String name;
    private int age;
    private List<Doctor> consultedDoctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public void displayConsultedDoctors() {
        System.out.println("Patient: " + name);
        System.out.println("Consulted Doctors:");
        for (Doctor doctor : consultedDoctors) {
            System.out.println("- Dr. " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        }
    }
}

// Class representing a Doctor
class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public void displayPatients() {
        System.out.println("Dr. " + name + " (" + specialization + ")");
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Main class representing a Hospital
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of doctors
        System.out.print("Enter the number of doctors in the hospital: ");
        int numDoctors = input.nextInt();
        input.nextLine();

        List<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < numDoctors; i++) {
            // Input doctor details
            System.out.print("Enter the name of doctor " + (i + 1) + ": ");
            String doctorName = input.nextLine();
            System.out.print("Enter the specialization of Dr. " + doctorName + ": ");
            String specialization = input.nextLine();

            doctors.add(new Doctor(doctorName, specialization));
        }

        // Input number of patients
        System.out.print("Enter the number of patients in the hospital: ");
        int numPatients = input.nextInt();
        input.nextLine();

        List<Patient> patients = new ArrayList<>();
        for (int i = 0; i < numPatients; i++) {
            // Input patient details
            System.out.print("Enter the name of patient " + (i + 1) + ": ");
            String patientName = input.nextLine();
            System.out.print("Enter the age of " + patientName + ": ");
            int age = input.nextInt();
            input.nextLine();

            patients.add(new Patient(patientName, age));
        }

        // Simulating consultations
        System.out.println("\nEnter consultations (Doctor ID and Patient ID):");
        System.out.println("Doctor ID (1 to " + numDoctors + "), Patient ID (1 to " + numPatients + ")");
        System.out.println("Enter -1 to stop.");
        while (true) {
            System.out.print("Enter Doctor ID: ");
            int doctorId = input.nextInt();
            if (doctorId == -1) break;

            System.out.print("Enter Patient ID: ");
            int patientId = input.nextInt();
            if (patientId == -1) break;

            if (doctorId >= 1 && doctorId <= numDoctors && patientId >= 1 && patientId <= numPatients) {
                Doctor doctor = doctors.get(doctorId - 1);
                Patient patient = patients.get(patientId - 1);
                doctor.consult(patient);
            } else {
                System.out.println("Invalid IDs. Try again.");
            }
        }

        // Displaying details
        System.out.println("\nDoctor Details:");
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
            System.out.println();
        }

        System.out.println("Patient Details:");
        for (Patient patient : patients) {
            patient.displayConsultedDoctors();
            System.out.println();
        }

        // Closing input
        input.close();
    }
}
