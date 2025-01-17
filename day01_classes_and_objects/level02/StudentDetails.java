import java.util.Scanner; 
class Student {
	private String name;
	private int rollNo;
	private double marks;
	private char grade;
	
	//making constructor
	public Student(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;		
	}
	
	//method to assigning grades of student
	public void assignGrade(double marks) {
		//assigning grade
		if(marks>90) {
			this.grade = 'A';
		} else if(marks>75) {
			this.grade = 'B';
		} else if(marks>50) {
			this.grade = 'C';
		} else if(marks>33) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}	
	//method to print Student details
	public void printDetails() {
		
		// calling the assign grade method to assign grade
		this.assignGrade(grade);
		System.out.println("\n----student details----");
		System.out.println("Name : " + name);
		System.out.println("Roll number : " + rollNo);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + grade);
	}
}
public class StudentDetails {
	public static void main(String[] args) {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//taking user inputs for name, rollNo and marks
		System.out.print("Enter name : ");
		String name = input.nextLine();
		System.out.print("Enter roll number : ");
		int rollNo = input.nextInt();
		System.out.print("Enter marks : ");
		double marks = input.nextDouble();
		
		//creating object of student class
		Student student = new Student(name, rollNo, marks);
		
		//printing details of student
		student.printDetails();
		
		//closing input
		input.close();
	}
}
		