public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String branch;
    private String IFSC;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance, String branch, String IFSC) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.branch = branch;
        this.IFSC = IFSC;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Branch: " + branch);
        System.out.println("IFSC: " + IFSC);
    }

    public static void main(String[] args) {
        // Sample usage
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0, "Main Branch", "ABC123");
        account.displayAccountDetails();
        account.deposit(500.0);
        account.withdraw(200.0);
    }
}
