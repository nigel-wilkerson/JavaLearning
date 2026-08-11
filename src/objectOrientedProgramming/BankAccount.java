package objectOrientedProgramming;

/**
 * Name: Nigel Wilkerson
 * File: BankAccount.java
 * Version: 1.0
 * Date: 8/8/2026
 * Description: A simple bank account class with state (name, account number, balance, frozen status) and behavior
 *              (deposit, withdraw, freeze, unfreeze, display info). Practice exercise for OOP fundamentals — classes,
 *              fields, and methods without constructors.
 */

public class BankAccount {

    String name = "Nigel";
    int accountNumber = 123456;
    double balance = 1000;
    boolean isFrozen = false;

    void deposit(double amount) {
        if (isFrozen) {
            System.out.println("Account is frozen. Cannot deposit.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    void withdraw(double amount) {
        if (isFrozen) {
            System.out.println("Account is frozen. Cannot withdraw.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
    }

    void freeze() {
        isFrozen = true;
        System.out.println("Account has been frozen.");
    }

    void unfreeze() {
        isFrozen = false;
        System.out.println("Account has been unfrozen.");
    }

    void displayInfo() {
        System.out.println("---- Account Info ----");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Status: " + (isFrozen ? "FROZEN" : "ACTIVE"));
        System.out.println("----------------------");
    }

}
