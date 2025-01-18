import java.util.Scanner;
public class Course {
    //creating data members;
    private String courseName;
    private int duration;
    private double fees;

    //creating class variable InstituteName to indicate name of institute
    private static String instituteName;

    //creating constructor to initialize variables
    public Course(String courseName, int duration, double fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }
    //method to update institute name
    public static void updateInstitute(String institute) {
        instituteName = institute;
    }

    //method to display course details
    public void displayDetails() {
        System.out.println("course name : " + this.courseName);
        System.out.println("Duration (in months) : " + this.duration);
        System.out.println("Fees : " + this.fees);
        System.out.println("Institute name : " + instituteName);
    }

    //main method
    public static void main(String[] args) {

        //creating scanner class object to take user input
        Scanner input = new Scanner(System.in);

        //taking user input for institute name
        System.out.print("Enter institute name : ");
        String instituteName = input.nextLine();

        //updating the institute name
        updateInstitute(instituteName);

        //taking user input for course details
        System.out.println("Enter details for course " + 1);
        System.out.print("Enter course name : ");
        String courseName = input.nextLine();
        System.out.print("Enter Duration (in months) : ");
        int duration = input.nextInt();
        System.out.print("Enter fees : ");
        double fees = input.nextDouble();

        //creating object course1 of Product class
        Course course1 = new Course(courseName, duration, fees);

        //printing details of course 1
        System.out.println("details of course 1 : ");
        course1.displayDetails();

        input.nextLine();
        //taking user input for new institute name
        System.out.print("Enter new institute name : ");
        instituteName = input.nextLine();

        //updating the institute name
        updateInstitute(instituteName);

        //taking user input for course details
        System.out.println("Enter details for course " + 2);
        System.out.print("Enter course name : ");
        courseName = input.nextLine();
        System.out.print("Enter Duration (in months) : ");
        duration = input.nextInt();
        System.out.print("Enter fees : ");
        fees = input.nextDouble();

        //creating object course1 of Course class
        Course course2 = new Course(courseName, duration, fees);

        //printing details of course 2
        System.out.println("details of course 2 : ");
        course2.displayDetails();

        //printing details of course 1 and you can see institute name is also updated for course 1
        System.out.println("details of course 1 : ");
        course1.displayDetails();

        System.out.println("you can see above the institute name is also updated for course 1");

        //closing the input
        input.close();
    }
}
