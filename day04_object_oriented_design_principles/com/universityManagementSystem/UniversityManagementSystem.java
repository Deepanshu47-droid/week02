package com.universityManagementSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class Student
class Student {
    private String name;
    private List<Course> enrolledCourses;

    //constructor to initialize Student
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }
    //getter method to get name
    public String getName() {
        return name;
    }
    //method to enroll course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }
    //method to display details
    public void displayCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Class Professor
class Professor {
    private String name;
    private List<Course> assignedCourses;

    //constructor to innitialize Professor
    public Professor(String name) {
        this.name = name;
        this.assignedCourses = new ArrayList<>();
    }
    //getter method to get name
    public String getName() {
        return name;
    }
    //method to assign course
    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setProfessor(this);
    }
    //method to display details
    public void displayCourses() {
        System.out.println("Professor Name: " + name);
        System.out.println("Assigned Courses:");
        for (Course course : assignedCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Class Course
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    //constructor to initialize Course
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    //getter method to get course name
    public String getCourseName() {
        return courseName;
    }
    //method to set professor
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    //method to add student
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    //method to display details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None Assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to test the University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating lists to manage entities
        List<Student> students = new ArrayList<>();
        List<Professor> professors = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        //taking input for number of students and creating Student objects
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = input.nextLine();
            students.add(new Student(name));
        }

        //taking input for number of professors and create Professor objects
        System.out.print("Enter the number of professors: ");
        int numProfessors = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numProfessors; i++) {
            System.out.print("Enter the name of professor " + (i + 1) + ": ");
            String name = input.nextLine();
            professors.add(new Professor(name));
        }

        // taking input for number of courses and create Course objects
        System.out.print("Enter the number of courses: ");
        int numCourses = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the name of course " + (i + 1) + ": ");
            String courseName = input.nextLine();
            courses.add(new Course(courseName));
        }

        // Assigning professors to courses
        for (Course course : courses) {
            System.out.println("Assign a professor to course: " + course.getCourseName());
            for (int i = 0; i < professors.size(); i++) {
                System.out.println((i + 1) + ". " + professors.get(i).getName());
            }
            //taking user input for professor number
            System.out.print("Enter professor number : ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice > 0 && choice <= professors.size()) {
                Professor selectedProfessor = professors.get(choice - 1);
                selectedProfessor.assignCourse(course);
            }
        }

        // Enrolling students in courses
        for (Student student : students) {
            System.out.println("Enroll courses for student: " + student.getName());
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
            }
            System.out.print("Enter course numbers (comma-separated): ");
            String[] courseChoices = input.nextLine().split(",");
            for (String choice : courseChoices) {
                int courseIndex = Integer.parseInt(choice.trim()) - 1;
                if (courseIndex >= 0 && courseIndex < courses.size()) {
                    student.enrollCourse(courses.get(courseIndex));
                }
            }
        }

        // Displaying details of all courses, professors, and students
        System.out.println("\nUniversity Management System Details:");
        for (Course course : courses) {
            course.displayCourseDetails();
            System.out.println();
        }
        //closing the input
        input.close();
    }
}
