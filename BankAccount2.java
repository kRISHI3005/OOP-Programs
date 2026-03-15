class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;


    void openAccount(int accNo, String name, double bal) {

        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
        System.out.println("Account opened for " + accountHolderName);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        System.out.println("Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    void maturityAmount(double rate, int years) {
        double maturity = balance + (balance * rate * years / 100);
        System.out.println("Maturity Amount: " + maturity);
    }
}

class BankAccount2 {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "abc", 5000);
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.checkBalance();
        sa.calculateInterest(5);

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "cba", 10000);
        fd.deposit(2000);
        fd.checkBalance();
        fd.maturityAmount(7, 3);
    }
}