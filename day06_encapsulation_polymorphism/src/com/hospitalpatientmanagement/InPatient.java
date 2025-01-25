package com.hospitalpatientmanagement;

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private double treatmentCost;
    private String medicalHistory;

    //constructor to initialize values
    public InPatient(int patientId, String name, int age, double roomCharges, double treatmentCost) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCost = treatmentCost;
    }

    //implementation of calculateBill() method
    @Override
    public double calculateBill() {
        return roomCharges + treatmentCost;
    }

    //implementation of addRecord() method
    @Override
    public void addRecord(String record) {
        medicalHistory = (medicalHistory == null) ? record : medicalHistory + "; " + record;
    }

    //implementation of viewRecord() method
    @Override
    public String viewRecords() {
        return medicalHistory == null ? "No medical history available." : medicalHistory;
    }
}