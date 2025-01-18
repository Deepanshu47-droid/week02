
class Student {
    // Public field
    public int rollNumber;

    // Protected field
    protected String name;

    // Private field
    private double CGPA;

    // Constructor to initialize the values
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set the CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. Please enter a value between 0 and 10.");
        }
    }

    // Method to display Student information
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor to initialize the values for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display PostgraduateStudent's specific information
    public void displayPostgraduateInfo() {
        // Accessing the protected 'name' from the superclass (Student)
        System.out.println("Postgraduate Student Info:");
        System.out.println("Name: " + name);  // Protected member is accessible here
        displayStudentInfo();  // Calling the method of the base class
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(101, "John Doe", 8.5);
        student.displayStudentInfo();

        // Modifying CGPA using setter method
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent postgradStudent = new PostgraduateStudent(201, "Alice Smith", 9.2);
        postgradStudent.displayPostgraduateInfo();
    }
}
