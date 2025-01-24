package multilevelinhetitance.EducationalCourseHierarchy;

public class Course {
    //fields
    public String courseName;
    public int duration;

    //constructor to initialize values
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    //method to print details
    public void display() {
        System.out.println("Course name : " + this.courseName);
        System.out.println("Duration : " + this.duration + " months");
    }
}
