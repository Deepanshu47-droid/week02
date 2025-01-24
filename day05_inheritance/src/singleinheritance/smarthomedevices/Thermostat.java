package singleinheritance.smarthomedevices;

public class Thermostat extends Device {
    //fields
    public String temperatureSetting;

    //constructor to initialize values
    public Thermostat(String deviceId, String status, String temperatureSetting) {

        //calling super class constructor
        super(deviceId, status);

        this.temperatureSetting = temperatureSetting;
    }
    //overriding the display method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting : " + this.temperatureSetting);
    }
}
