package bankingProgram;
import java.util.Scanner;
/**
 * Name: Nigel Wilkerson
 * File: BankingProgram.java
 * Version: 1.0
 * Date: 7/6/2026
 * Description: Menu-driven banking program that uses methods to show balance, deposit,
 *              and withdraw funds with insufficient-funds validation
 */

public class BankingProgram {

    public static void main(String[] args) {

        // Open scanner
        Scanner scanner = new Scanner(System.in);

        //Declare variables
        double balance = 0.00;
        double depositMoney;
        double withdrawMoney;
        int choice;

        // Intro message
        System.out.println("------Welcome to Java's Banking Program------");

            //Used do while loop until choice == 4
            do {
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                //User-input for choice
                System.out.print("Enter a number: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> System.out.printf("Your balance is $%.2f\n", showBalance(balance));

                    case 2 -> {
                        System.out.print("How much would you like to deposit: $");
                        depositMoney = scanner.nextDouble();
                        if (depositMoney <= 0) {
                            System.out.println("Deposit amount must be greater than $0.");
                        }
                        else {
                        balance = addMoney(balance, depositMoney);
                        System.out.printf("You successfully added $%.2f to your account\n", depositMoney);
                        }
                    }
                    case 3 -> {
                        System.out.print("How much would you like to withdraw: $");
                        withdrawMoney = scanner.nextDouble();
                        if (withdrawMoney <= 0) {
                            System.out.println("Withdrawal amount must be greater than $0.");
                        } else if (withdrawMoney > balance) {
                            System.out.println("You have insufficient funds");
                        } else {
                            balance = takeMoney(balance, withdrawMoney);
                            System.out.printf("You successfully withdrew $%.2f from your account\n", withdrawMoney);
                        }
                    }
                    case 4 -> System.out.println("Thank you for using Java's Banking Program!");

                    default -> System.out.println("Number is invalid");
                }
            }while (choice != 4);


        // Close scanner
        scanner.close();
    }
    static double showBalance(double balance) {
        return balance;
    }
    static double addMoney (double balance, double depositMoney) {
        return balance + depositMoney;
    }
    static double takeMoney(double balance, double withdrawMoney) {
        return balance - withdrawMoney;
    }

}
