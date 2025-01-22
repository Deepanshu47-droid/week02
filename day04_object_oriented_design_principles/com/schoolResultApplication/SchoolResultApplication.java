
//student class

import java.util.Scanner;
class Student {
    private String name;
    private final String studentId;
    private final Subject[] subjects;

    //constructor to initialize variables
    public Student(String name, String studentId, Subject[] subjects) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = subjects;
    }
    //method to print details
    public void display() {
        System.out.println("\nResult of Student ......");
        System.out.println("Name : " + this.name);
        System.out.println("Student ID : " + this.studentId);

        //printing scores of each subject
        for(int i=0; i<subjects.length; i++) {
            System.out.println("Marks of subject " + subjects[i].name + " is " + subjects[i].score);
        }
        System.out.println("Average of scores : " + GradeCalculator.calculateAverage(subjects));
        System.out.println("Grade is : " + GradeCalculator.determineGrade(subjects));
    }
}
//subject class
class Subject {
    String name;
    double score;

    //constructor to initialize variables
    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
//GradeCalculator class
class GradeCalculator {

    //method to calculate average
    public static double calculateAverage(Subject[] subjects) {
        //calculating sum of score of students
        double sum = 0;
        for(int i=0; i<subjects.length; i++) {
            sum += subjects[i].score;
        }

        //calculating the average
        double avg = sum/(subjects.length);

        //returning the average
        return avg;
    }
    //method to determine grades
    public static String determineGrade(Subject[] subjects) {

        //calculating average for subjects
        double avg = calculateAverage(subjects);

        //determining grades
        String grade;
        if(avg > 85) {
            grade = "A+";
        } else if(avg > 75) {
            grade = "A";
        } else if(avg > 60) {
            grade = "B";
        } else if(avg > 45) {
            grade = "C";
        } else if(avg > 33) {
            grade = "D";
        } else {
            grade = "FAIL";
        }
        //returning grade
        return grade;
    }
}
public class SchoolResultApplication {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for student details
        System.out.println("\nFetching details for a student.... ");
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.print("Enter student id : ");
        String studentId = input.nextLine();
        System.out.print("Enter number of subjects : ");
        int numberOfSubjects = input.nextInt();

        //creating array subjects to store subjects and a variable to indicate index of array
        Subject[] subjects = new Subject[numberOfSubjects];
        int index = 0;

        //taking input for subject details of current student
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter name of subject " + (i+1) + " : ");

            String SubName = input.next();
            System.out.print("Enter score : ");
            double score = input.nextDouble();

            //creating object of Subject class
            Subject subject = new Subject(SubName, score);

            //appending the new subject in Subject array
            subjects[index] = subject;
            index++;
        }
        //creating object of Student class
        Student student1 = new Student(name, studentId, subjects);

        //printing details
        // calculation of average and score in display() method of student class
        student1.display();

        //closing the input
        input.close();
    }
}
