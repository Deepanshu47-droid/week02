package multilevelinhetitance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder {
    //fields
    public String deliveryDate;

    //constructor to initialize values
    public DeliveredOrder(String orderId, String orderDate, int trackingNumber, String deliveryDate) {
        //calling super class constructor
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    //overriding method getOrderStatus()
    @Override
    public String getOrderStatus() {
        return "Order Status : Order delivered ";
    }
    //overriding method display()
    @Override
    public void display() {

        //calling super class display method
        super.display();
        System.out.println("Delivery date : " + this.deliveryDate);
    }
}
