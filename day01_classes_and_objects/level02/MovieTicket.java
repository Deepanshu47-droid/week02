import java.util.Scanner;
public class MovieTicket {
    //creating variables
    private String movieName;
    private int seatNumber;
    private double price;

    //creating constructor to book a seat
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    //method to display details
    public void displayDetails() {
        System.out.println("\n----movie details----");
        System.out.println("Movie name : " + movieName);
        System.out.println("Seat number : " + seatNumber);
        System.out.println("Price : " + price);
    }
    //main method
    public static void main(String[] args) {

        //creating scanner object to take inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter movie name : ");
        String movieName = input.nextLine();
        System.out.print("Enter seat number : ");
        int seatNumber = input.nextInt();
        System.out.print("Enter price : ");
        double price = input.nextDouble();

        //booking the ticket
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        //displaying ticket information
        ticket.displayDetails();

        //closing the input
        input.close();

    }
}