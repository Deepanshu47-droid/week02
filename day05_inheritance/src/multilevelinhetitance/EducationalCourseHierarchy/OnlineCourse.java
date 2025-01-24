package multilevelinhetitance.EducationalCourseHierarchy;

public class OnlineCourse extends Course {
    //fields
    public String platform;
    public boolean isRecorded;

    //constructor to initialize values
    public OnlineCourse(String courseName, int duration, String platform, Boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    //overriding method to print details
    @Override
    public void display() {
        super.display();
        System.out.println("Platform : " + this.platform);
        System.out.println("Is recorded ? " + this.isRecorded);
    }
}
