package multilevelinhetitance.EducationalCourseHierarchy;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for course details
        System.out.println("\nFetching details for course....");
        System.out.print("Enter courseName : ");
        String courseName = input.nextLine();
        System.out.print("Enter duration (in months) : ");
        int duration = input.nextInt();

        //creating Course class object
        Course course = new Course(courseName, duration);

        //printing details
        System.out.println();
        System.out.println("Details of course.....");
        course.display();

        input.nextLine();
        //taking input for online course details
        System.out.println("\nFetching details for online course....");
        System.out.print("Enter courseName : ");
        courseName = input.nextLine();
        System.out.print("Enter duration (in months) : ");
        duration = input.nextInt();
        input.nextLine();
        System.out.print("Enter platform : ");
        String platform = input.nextLine();

        //taking input if the session is recorded or not
        System.out.print("Enter course is recorded or not (true/false) : ");
        boolean isRecorded = input.nextBoolean();
        input.nextLine();

        //creating OnlineCourse class object
        OnlineCourse onlineCourse = new OnlineCourse(courseName, duration, platform, isRecorded);

        //printing details
        System.out.println();
        System.out.println("Details of Online course.....");
        onlineCourse.display();

        //taking input for paid online course details
        System.out.println("\nFetching details for paid online course....");
        System.out.print("Enter courseName : ");
        courseName = input.nextLine();
        System.out.print("Enter duration (in months) : ");
        duration = input.nextInt();
        input.nextLine();
        System.out.print("Enter platform : ");
        platform = input.nextLine();

        //taking input if the session is recorded or not
        System.out.print("Enter course is recorded or not (true/false) : ");
        isRecorded = input.nextBoolean();
        input.nextLine();
        //taking input for additional details
        System.out.print("Enter fee : ");
        double fee = input.nextDouble();
        System.out.print("Enter discount : ");
        double discount = input.nextDouble();

        //creating PaidOnlineCourse class object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);

        //printing details
        System.out.println();
        System.out.println("Details of Online course.....");
        onlineCourse.display();

        //closing the input
        input.close();
    }
}
