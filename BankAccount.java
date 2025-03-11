public class BankAccount {
    // Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nDeposited: " + amount);
        } else {
            System.out.println("\nInvalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawn: " + amount);
        } else {
            System.out.println("\nInsufficient funds for withdrawal!");
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("\nBank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "Pranav", 50000);
        account1.displayDetails();

        SavingsAccount account2 = new SavingsAccount("456", "Nikhil", 30000);
        account2.displayDetails();

        // Depositing money
        account2.deposit(10000);

        // Withdrawing money
        account2.withdraw(5000);

        // Displaying updated balance
        System.out.println("\nUpdated Balance of account2: " + account2.getBalance());

        // Displaying complete details of account2 after transactions
        System.out.println("\nComplete details of account2 after transactions:");
        account2.displayDetails();
    }
}
