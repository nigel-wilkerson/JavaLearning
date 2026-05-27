package nestedIfStatement;

/**
 * Name: Nigel Wilkerson
 * File: NestedIfStatement.java
 * Version: 1.0
 * Date: 5/28/2026
 * Description: Demonstrates nested if statements by applying discounts based on school and veteran status.
 */

public class NestedIfStatement {

    public static void main(String[] args) {

        System.out.println("------Nested If Statement Practice------\n");

        // Declare & Assign variables
        boolean inSchool = false;
        boolean isVeteran = false;
        double price = 29.99;


        if (inSchool){ //If in school
            if (isVeteran){ //If in school and a veteran
                System.out.println("You get an in-school & veteran discount of 50%.");
                price *= 0.5;
            }
            else { //If in school and not a veteran
                System.out.println("You get an in-school discount of 10%.");
                price *= 0.9;
            }
        }
        else {
            if (isVeteran) { //If veteran and not in school
                System.out.println("You get an veteran discount of 40%.");
                price *= 0.6;
            }
            else {// If nothing applies
                System.out.println("No discount applied.");
            }
        }
        System.out.printf("The price is $%.2f", price);
    }
}
