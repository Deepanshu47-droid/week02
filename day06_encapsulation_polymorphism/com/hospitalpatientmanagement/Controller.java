package com.hospitalpatientmanagement;

public class Controller {
    public static void main(String[] args) {
        // Creaing Patients
        Patient inPatient = new InPatient(101, "Raj", 45, 5000, 15000);
        Patient outPatient = new OutPatient(102, "Shubham", 30, 500, 200);

        // Adding Medical Records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery, treated successfully.");
        ((MedicalRecord) outPatient).addRecord("Consulted for flu, prescribed medication.");

        // Processing Patients
        Patient[] patients = {inPatient, outPatient};
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Medical History: " + ((MedicalRecord) patient).viewRecords());
            System.out.println("Total Bill: $" + patient.calculateBill());
            System.out.println("----------------------------------------");
        }
    }
}