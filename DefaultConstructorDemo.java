// Program 2: Default Constructor

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    // Explicit Default Constructor
    BankAccount() {
        accountNumber = "ACC1001";
        accountHolder = "Preethi";
        balance = 5000.0;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.displayAccountInfo();
    }
}

