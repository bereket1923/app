package quize;

public class BankAccount {
    // Instance variables
    private String accountNumber;
    private double balance;

    // Getter and setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Static method to calculate the total balance of two customers
    public static double totalBalance(BankAccount customer1, BankAccount customer2) {
        return customer1.getBalance() + customer2.getBalance();
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create two customers
        BankAccount customer1 = new BankAccount();
        customer1.setAccountNumber("123456789");
        customer1.setBalance(1000.00);

        BankAccount customer2 = new BankAccount();
        customer2.setAccountNumber("987654321");
        customer2.setBalance(500.00);

        // Perform deposit and withdrawal
        customer1.deposit(200.00);
        customer1.withdraw(150.00);

        customer2.deposit(300.00);
        customer2.withdraw(50.00);

        // Calculate total balance of customer1 and customer2
        double total = BankAccount.totalBalance(customer1, customer2);
        System.out.println("Total balance of both customers: " + total);
    }
}
