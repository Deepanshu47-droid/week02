package assistedproblems.employeemanagement;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for Employee
        System.out.print("\nEnter employee's name : ");
        String name = input.nextLine();
        System.out.print("Enter employee's ID : ");
        String id = input.nextLine();
        System.out.print("Enter employee's salary : ");
        double salary = input.nextDouble();

        //creating Employee class object
        Employee employee = new Employee(name, id, salary);

        //printing details of employee
        System.out.println("\nDetails of Employee .....");
        employee.display();

        input.nextLine();
        //taking user input for manager
        System.out.print("\nEnter manager's name : ");
        name = input.nextLine();
        System.out.print("Enter manager's ID : ");
        id = input.nextLine();
        System.out.print("Enter manager's salary: ");
        salary = input.nextDouble();
        System.out.print("Enter manager's team size : ");
        int teamSize = input.nextInt();

        //creating manager class object
        Manager manager = new Manager(name, id, salary, teamSize);

        //printing details of manager
        System.out.println("\nDetails of manager .....");
        manager.display();

        input.nextLine();
        //taking user input for developer
        System.out.print("\nEnter developer's name : ");
        name = input.nextLine();
        System.out.print("Enter developer's ID : ");
        id = input.nextLine();
        System.out.print("Enter developer's salary : ");
        salary = input.nextDouble();
        input.nextLine();
        System.out.print("Enter programming language : ");
        String programmingLanguage = input.nextLine();

        //creating developer class object
        Developer developer = new Developer(name, id, salary, programmingLanguage);

        //printing details of developer
        System.out.println("\nDetails of developer .....");
        developer.display();

        //taking user input for intern
        System.out.print("\nEnter intern's name : ");
        name = input.nextLine();
        System.out.print("Enter intern's ID : ");
        id = input.nextLine();
        System.out.print("Enter intern's salary : ");
        salary = input.nextDouble();

        //creating intern class object
        Intern intern = new Intern(name, id, salary);

        //printing details of intern
        System.out.println("\nDetails of intern .....");
        intern.display();
        //closing input object
        input.close();
    }
}
