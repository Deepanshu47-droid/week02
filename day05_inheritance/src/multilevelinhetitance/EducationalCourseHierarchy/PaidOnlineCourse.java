package multilevelinhetitance.EducationalCourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse {
    //fields
    public double fee;
    public double discount;

    //constructor to initialize values
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        //calling super class constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    //overriding method to print details
    @Override
    public void display() {
        super.display();
        System.out.println("Fee : " + this.fee);
        System.out.println("Discount : " + this.discount);
    }
}
