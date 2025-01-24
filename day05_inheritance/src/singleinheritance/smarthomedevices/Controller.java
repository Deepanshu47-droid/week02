package singleinheritance.smarthomedevices;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for Thermostat class object
        System.out.println("\nFetching details for thermostat object ....");
        System.out.print("Enter device ID : ");
        String deviceId = input.nextLine();
        System.out.print("Enter status : ");
        String status = input.nextLine();

        //taking input for temperatureSetting
        System.out.print("Enter Temperature setting : ");
        String temperatureSetting = input.nextLine();

        //creating Thermostat class object
        Thermostat thermostat = new Thermostat(deviceId, status, temperatureSetting);

        //printing details
        System.out.println();
        System.out.println("\nDetails of thermostat object.....");
        thermostat.displayStatus();

        //taking input for Device class object
        System.out.println("\nFetching details for Device object ....");
        System.out.print("Enter device ID : ");
        deviceId = input.nextLine();
        System.out.print("Enter status : ");
        status = input.nextLine();

        //creating Device class object
        Device device = new Device(deviceId, status);

        //printing details
        System.out.println();
        System.out.println("\nDetails of Device object.....");
        device.displayStatus();

        //closing the input
        input.close();
    }
}
