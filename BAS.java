class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accNo, double initialBalance) {
        accountHolder = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BAS {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Richik", 12345, 5000);

        acc1.display();

        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(7000);

        acc1.display();
    }
}