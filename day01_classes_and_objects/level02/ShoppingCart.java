import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Displaying the details of the cart item
    void displayItem() {
        System.out.println(" Item name : " + itemName + "\n Price: " + price + "\n Quantity: " + quantity);
    }
}

public class ShoppingCart {
    //creating Array for storing cart items
    CartItem[] cart = new CartItem[10];
    //creating variable cartSize to indicate Current number of items in the cart
    int cartSize = 0;

    // Adding an item to the cart
    void addItem(String itemName, double price, int quantity) {
        if (cartSize < cart.length) {
            cart[cartSize++] = new CartItem(itemName, price, quantity);
            System.out.println(itemName + " added to the cart.");
        } else {
            System.out.println("Cart is full!");
        }
    }

    // Removing an item by its name
    void removeItemByName(String itemName) {
        int indexToRemove = -1;

        // Finding the index of the item with the given name
        for (int i = 0; i < cartSize; i++) {
            if (cart[i].itemName.equalsIgnoreCase(itemName)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("Item \"" + itemName + "\" not found in the cart.");
            return;
        }

        // Shifting elements to remove the item at the found index
        for (int i = indexToRemove; i < cartSize - 1; i++) {
            cart[i] = cart[i + 1];
        }
        // Reducing the size and set the last item to null
        cart[--cartSize] = null;
        System.out.println("Item \"" + itemName + "\" removed from the cart.");
    }

    // Displaying all items in the cart
    void displayCart() {
        if (cartSize == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        System.out.println("Cart Contents:");
        for (int i = 0; i < cartSize; i++) {
            System.out.print(i + ": ");
            cart[i].displayItem();
        }
    }

    // Displaying the total cost
    void displayTotalCost() {
        double total = 0;
        for (int i = 0; i < cartSize; i++) {
            total += cart[i].price * cart[i].quantity;
        }
        System.out.println("Total Cost: $" + total);
    }

    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //creating object of shopping cart
        ShoppingCart myCart = new ShoppingCart();


        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            // Consuming newline
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = input.nextLine();
                    System.out.print("Enter item price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = input.nextInt();
                    myCart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter the name of the item to remove: ");
                    String removeName = input.nextLine();
                    myCart.removeItemByName(removeName);
                    break;

                case 3:
                    myCart.displayCart();
                    break;

                case 4:
                    myCart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting program. Thank you!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        }

    }
}
