import java .util.Scanner;
class Patient {
    //creating static variable hospitalName and totalPatient to indicate hospital name and total patient
    static String hospitalName;
    static int totalPatient;

    //creating variables name, age, and ailment to indicate name, age and ailment of patient
    private String name;
    private int age;
    private String ailment;

    //creating final variable patientId
    private final String patientId;

    //constructor to initialize values
    public Patient(String name, int age, String ailment, String patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;

        Patient.totalPatient++;
    }
    //method to get total number of patient admitted
    public static int getTotalPatient() {
        return Patient.totalPatient;
    }
    //method to update hospital name
    public static void updateHospitalName(String hospitalName) {
        Patient.hospitalName = hospitalName;
    }
    //method to display details
    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Ailment : " + this.ailment);
        System.out.println("PatientID : " + this.patientId);
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for hospital name
        System.out.print("Enter hospital name : ");
        Patient.hospitalName = input.nextLine();

        //creating a variable exit to indicate if a user want to exit or continue
        int exit = 1;


        //loop until user don't want to exit
        while(exit == 1 || exit == 2) {

            //if exit = 2, updating hospital name
            if(exit == 2) {
                input.nextLine();
                System.out.print("Enter new hospital name : ");
                String newHospitalName = input.nextLine();
                Patient.updateHospitalName(newHospitalName);
                System.out.println("Updated hospital name is " + newHospitalName + "...");
            }
            input.nextLine();
            //taking user input for patient details
            System.out.println("\nFetching details for a patient.... ");
            System.out.print("Enter patient name : ");
            String patientName = input.nextLine();
            System.out.print("Enter age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter ailment : ");
            String ailment = input.nextLine();
            System.out.print("Enter patientId : ");
            String patientId = input.nextLine();

            //creating object of Vehicle class
            Patient patient = new Patient(patientName, age, ailment, patientId);

            //checking whether the patient object belongs to Patient class or not
            if(patient instanceof Patient) {
                //printing details
                patient.display();
            }

            //asking user to continue or exit or update hospital name
            System.out.print("\nEnter 1 to continue... \n2 to hospital name... \nelse press any number... ");
            exit = input.nextInt();

        }
        //closing the input
        input.close();
    }
}
