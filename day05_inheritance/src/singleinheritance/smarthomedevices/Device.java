package singleinheritance.smarthomedevices;

public class Device {
    //fields
    public String deviceId;
    public String status;

    //constructor to initialize values
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    //method to print status
    public void displayStatus() {
        System.out.println("Device id : " + this.deviceId);
        System.out.println("Status : " + this.status);
    }
}
