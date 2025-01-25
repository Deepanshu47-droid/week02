package com.hospitalpatientmanagement;

interface MedicalRecord {
    //method to add Record to be implemented in derived class
    void addRecord(String record);

    //method to view Record to be implemented in derived class
    String viewRecords();
}
