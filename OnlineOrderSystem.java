import java.util.*;

	
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    protected int orderId;
    protected String item;
    protected int quantity;
    protected double price;

    static int idCounter = 1;

    @Override
    public void placeOrder(String item, int qty) {
        this.orderId = idCounter++;
        this.item = item;
        this.quantity = qty;

 
        if(item.equalsIgnoreCase("Laptop")) {
            price = 50000;
        } else if(item.equalsIgnoreCase("Phone")) {
            price = 20000;
        } else if(item.equalsIgnoreCase("Tablet")) {
            price = 15000;
        } else {
            price = 1000;
        }

        System.out.println("\nOrder placed successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item + ", Quantity: " + quantity);
    }
}


class FinalOrder extends PartialOrder {

    @Override
    public void cancelOrder(int orderId) {
        if(this.orderId == orderId) {
            System.out.println("Order ID " + orderId + " has been cancelled.");
            item = null;
            quantity = 0;
            price = 0;
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    @Override
    public void generateBill() {
        if(item == null) {
            System.out.println("No active order to generate bill.");
            return;
        }

        double total = quantity * price;

        System.out.println("\n------ BILL ------");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Amount: " + total);
        System.out.println("------------------");
    }
}


public class OnlineOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Krishi Patel");
        System.out.println("Enrollment No: 250393107010");

        FinalOrder order = new FinalOrder();

      
        System.out.print("\nEnter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

      
        System.out.println("\nChoose an option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                order.generateBill();
                break;
            case 2:
                System.out.print("Enter Order ID to cancel: ");
                int id = sc.nextInt();
                order.cancelOrder(id);
                break;
            default: 
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}