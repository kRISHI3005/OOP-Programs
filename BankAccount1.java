class BankAccount1 {

    String accountHolderName;
    double balance;
    static double interestRate;

    BankAccount1(String name, double bal) 
    {
        accountHolderName = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() 
    {
        return (balance * interestRate) / 100;
    }

     

   
    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);

    }

   static void updateInterestRate(double newRate) 
   {
        interestRate = newRate;
    }
   


    public static void main(String[] args) {

       
        BankAccount1.updateInterestRate(5.0);

       
        BankAccount1 acc1 = new BankAccount1("abc", 10000);
        BankAccount1 acc2 = new BankAccount1("pqr", 20000);

        acc1.displayInterest();
        acc2.displayInterest();

        BankAccount1.updateInterestRate(6.0);

        System.out.println("After updating interest rate:\n");

        acc1.displayInterest();
        acc2.displayInterest();
    }
}