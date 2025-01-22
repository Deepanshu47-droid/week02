package com.schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing a School
class School {
    private String name;
    private List<Student> students;

    //constructor to initialize School
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    //getter method to get Name
    public String getName() {
        return name;
    }
    //method to add student
    public void addStudent(Student student) {
        students.add(student);
    }
    //method to display student
    public void displayStudents() {
        System.out.println("School: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Class representing a Student
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
    public void displayEnrolledCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Class representing a Course
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    //constructor to initialize course
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    //getter method to get course name
    public String getCourseName() {
        return courseName;
    }
    //method to add student
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    //method to display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to test School, Students, and Courses
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking user input for school details
        System.out.print("Enter the name of the school: ");
        String schoolName = input.nextLine();
        School school = new School(schoolName);

        //taking user input for number of students and create Student objects
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String studentName = input.nextLine();
            Student student = new Student(studentName);
            students.add(student);
            school.addStudent(student);
        }

        // taking user input for number of courses and create Course objects
        System.out.print("Enter the number of courses: ");
        int numCourses = input.nextInt();
        input.nextLine();

        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the name of course " + (i + 1) + ": ");
            String courseName = input.nextLine();
            courses.add(new Course(courseName));
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

        // Displaying school details
        school.displayStudents();

        // Displaying courses with enrolled students
        for (Course course : courses) {
            course.displayEnrolledStudents();
            System.out.println();
        }

        // Displaying each student's enrolled courses
        for (Student student : students) {
            student.displayEnrolledCourses();
            System.out.println();
        }
        //closing the input
        input.close();
    }
}
