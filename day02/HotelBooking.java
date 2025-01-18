import java.util.Scanner;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    //default constructor
    public HotelBooking() {
        this("unknown", "default", 0);
    }

    //parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //copy constructor
    public HotelBooking(HotelBooking guest) {
        this.guestName = guest.guestName;
        this.roomType = guest.roomType;
        this.nights = guest.nights;
    }

    //printing the details
    public void printDetails() {
        System.out.println("Guest name : " + this.guestName);
        System.out.println("Room type : " + this.roomType);
        System.out.println("Nights : " + this.nights);
    }
    //main class
    public static void main(String[] args) {
        //creating scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for guest name, room type and nights
        System.out.print("Enter guest name : ");
        String guestName = input.nextLine();
        System.out.print("Enter room type : ");
        String roomType = input.nextLine();
        System.out.print("Enter number of nights : ");
        int nights = input.nextInt();

        //creating object using default constructor
        HotelBooking guest1 = new HotelBooking();

        //creating object using parameterized constructor
        HotelBooking guest2 = new HotelBooking(guestName, roomType, nights);

        //creating object using copy constructor
        HotelBooking guest3 = new HotelBooking(guest2);

        //displaying the details of guest 1
        System.out.println("Details of guest 1 :");
        guest1.printDetails();

        //displaying the details of guest 2
        System.out.println("Details of guest 2 :");
        guest2.printDetails();

        //displaying the details of guest 3
        System.out.println("Details of guest 3 :");
        guest3.printDetails();

        //closing the input
        input.close();
    }
}
