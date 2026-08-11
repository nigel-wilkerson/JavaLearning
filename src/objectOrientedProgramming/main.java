package objectOrientedProgramming;

/**
 * Name: Nigel Wilkerson
 * File: main.java
 * Version: 1.0
 * Date: 8/8/2026
 * Description: Demonstrates the BankAccount class by exercising every method — successful deposits
 *              and withdrawals, insufficient funds handling, and frozen account rejection.
 */

public class main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.displayInfo();
        account.deposit(500);
        account.withdraw(600);
        account.withdraw(1000);
        account.freeze();
        account.deposit(5000);
        account.unfreeze();
        account.displayInfo();


    }
}
