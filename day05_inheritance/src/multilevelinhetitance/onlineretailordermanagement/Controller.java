package multilevelinhetitance.onlineretailordermanagement;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking input for Order
        System.out.println("\nFetching details for placed order....");
        System.out.print("Enter order ID : ");
        String orderId = input.nextLine();
        System.out.print("Enter order date : ");
        String orderDate = input.nextLine();

        //creating Order class object
        Order order = new Order(orderId, orderDate);

        //printing details
        System.out.println();
        System.out.println("\nDetails of Placed order.....");
        order.display();

        //calling method getOrderStatus()
        System.out.println(order.getOrderStatus());

        //taking input for shipped Order
        System.out.println("\nFetching details for a shipped order....");
        System.out.print("Enter order ID : ");
        orderId = input.nextLine();
        System.out.print("Enter order date : ");
        orderDate = input.nextLine();
        System.out.print("Enter tracking number (Integer) : ");
        int trackingNumber = input.nextInt();
        input.nextLine();

        //creating ShippedOrder class object
        ShippedOrder shippedOrder = new ShippedOrder(orderId, orderDate, trackingNumber);

        //printing details
        System.out.println();
        System.out.println("\nDetails of Shipped order.....");
        shippedOrder.display();

        //calling method getOrderStatus()
        System.out.println(shippedOrder.getOrderStatus());

        //taking input for delivered Order
        System.out.println("\nFetching details for a delivered order....");
        System.out.print("Enter order ID : ");
        orderId = input.nextLine();
        System.out.print("Enter order date : ");
        orderDate = input.nextLine();
        System.out.print("Enter tracking number (Integer) : ");
        trackingNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter delivery date : ");
        String deliveryDate = input.nextLine();

        //creating DeliveredOrder class object
        DeliveredOrder deliveredOrder = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);

        //printing details
        System.out.println();
        System.out.println("\nDetails of Delivered order.....");
        deliveredOrder.display();

        //calling method getOrderStatus()
        System.out.println(deliveredOrder.getOrderStatus());

        //closing the input
        input.close();
    }
}
