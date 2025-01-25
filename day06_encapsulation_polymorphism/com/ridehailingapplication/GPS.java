package com.ridehailingapplication;

interface GPS {

    //method to get current location to be implemented in derived class
    String getCurrentLocation();

    //method to update location to be implemented in derived class
    void updateLocation(String location);
}