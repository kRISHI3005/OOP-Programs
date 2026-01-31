import java.util.Scanner;

public class BillGenerator {

    int generateBill(int itemTotal) {
        return itemTotal;
    }

    int generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        return itemTotal - (itemTotal * discountPercent / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.print("Enter total item amount: ");
        int total = sc.nextInt();

        System.out.println("1. Regular\n2. Privileged\n3. Festive");
        int choice = sc.nextInt();

        if (choice == 1)
            System.out.println("Final Bill: ₹" + bill.generateBill(total));
        else if (choice == 2)
            System.out.println("Final Bill: ₹" + bill.generateBill(total, sc.nextInt()));
        else
            System.out.println("Final Bill: ₹" + bill.generateBill(total, sc.nextDouble()));

        sc.close();
    }
}
