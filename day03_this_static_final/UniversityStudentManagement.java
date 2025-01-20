import java.util.Scanner;
class Student {
    //creating static variable universityName to indicate name of university
    static String universityName;
    static int totalStudents;

    //creating variables name, rollNumber and grade to indicate name, roll number and grade of student
    private String name;
    private final int rollNo;  //final variable
    private char grade;

    //constructor to initialize values
    public Student(String name, int rollNo, char grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;

        totalStudents++;
    }

    //method to display total student
    public static void displayTotalStudents() {
        System.out.println("Total number of student : " + Student.totalStudents);
    }
    //method to display details
    public void display() {
        System.out.println("University name : " + Student.universityName);
        System.out.println("Name : " + name);
        System.out.println("Roll number : " + rollNo);
        System.out.println("Grade : " + grade);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for university name
        System.out.print("Enter university name : ");
        Student.universityName = input.nextLine();

        //creating a variable exit to indicate if a user want to exit or continue
        int exit = 1;

        //loop until user don't want to exit
        while(exit == 1) {

            System.out.println("\nFetching detail of student..... ");
            //taking user input for name, roll number and grades
            System.out.print("Enter name : ");
            String name = input.nextLine();
            System.out.print("Enter roll number (integer) : ");
            int rollNo = input.nextInt();
            System.out.print("Enter grade (character) : ");
            char grade = input.next().charAt(0);

            //creating object of Student class
            Student student = new Student(name, rollNo, grade);

            //displaying total number of students
            Student.displayTotalStudents();

            //checking whether the student object belongs to Student class or not
            if(student instanceof Student) {
                //printing details
                student.display();
            }

            //asking user to continue or exit
            System.out.print("Enter 1 to continue else press any number : ");
            exit = input.nextInt();
            input.nextLine();
        }
        //closing the input
        input.close();
    }
}
