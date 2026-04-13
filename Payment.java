import java.util.Scanner; 
class Payment {
    public void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}
class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}
public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, amount;

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        p.processPayment(amount);

        sc.close();
    }
}