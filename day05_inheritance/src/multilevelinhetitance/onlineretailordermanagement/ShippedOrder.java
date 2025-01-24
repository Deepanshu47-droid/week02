package multilevelinhetitance.onlineretailordermanagement;

public class ShippedOrder extends Order {
    //fields
    public int trackingNumber;

    //constructor to initialize values
    public ShippedOrder(String orderId, String orderDate, int trackingNumber) {
        //calling super class constructor
        super(orderId, orderDate);

        this.trackingNumber = trackingNumber;
    }
    //overriding method getOrderStatus()
    @Override
    public String getOrderStatus() {
        return "Order Status : Order shipped ";
    }
    //overriding method display()
    @Override
    public void display() {

        //calling super class display method
        super.display();
        System.out.println("Tracking number : " + this.trackingNumber);
    }
}
