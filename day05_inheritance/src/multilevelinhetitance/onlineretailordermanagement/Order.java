package multilevelinhetitance.onlineretailordermanagement;

public class Order {
    //fields
    public String orderId;
    public String orderDate;

    //constructor to initialize values
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    //method to get order status
    public String getOrderStatus() {
        return "Order Status : Order placed ";
    }
    //method to display details
    public void display() {
        System.out.println("Order Id : " + this.orderId);
        System.out.println("Order date : " + this.orderDate);
    }
}
