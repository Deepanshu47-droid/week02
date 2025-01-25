package com.onlinefooddeliverysystem;

public class Controller {
    public static void main(String[] args) {
        // Creating Food Items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 1);

        // Applying Discounts
        ((Discountable) vegItem).applyDiscount(10); // 10% discount on veg item
        ((Discountable) nonVegItem).applyDiscount(5); // 5% discount on non-veg item

        // Processing Order
        FoodItem[] order = {vegItem, nonVegItem};
        double totalOrderPrice = 0;

        //printing details
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println(((Discountable) item).getDiscountDetails());
            System.out.println("Total Price: $" + item.calculateTotalPrice());
            totalOrderPrice += item.calculateTotalPrice();
            System.out.println("-----------------------------------------");
        }
        //printing the total order price
        System.out.println("Total Order Price: $" + totalOrderPrice);
    }
}
