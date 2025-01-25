package com.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicationCost;
    private String diagnosis;

    //constructor to initialize values
    public OutPatient(int patientId, String name, int age, double consultationFee, double medicationCost) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicationCost = medicationCost;
    }

    //implementation of calculateBill() method
    @Override
    public double calculateBill() {
        return consultationFee + medicationCost;
    }

    //implementation of addRecord() method
    @Override
    public void addRecord(String record) {
        diagnosis = (diagnosis == null) ? record : diagnosis + "; " + record;
    }

    //implementation of viewRecord() method
    @Override
    public String viewRecords() {
        return diagnosis == null ? "No diagnosis available." : diagnosis;
    }
}