package variables;

/**
 * Name: Nigel Wilkerson
 * File: variables.VariablesPractice.java
 * Version:
 * Date: 5/15/2026
 * Description: Practice file for Java variables - declaring and using different data types
 */

public class VariablesPractice {

    public static void main(String[] args) {

        String name = "Bob";
        int age = 21;
        double price = 19.99;
        char currency = '$';
        boolean isStudent = true;
        boolean isTall = false;

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("The price of my dinner cost me " + currency + price);
        System.out.println("The symbol for the currency usd is " + currency);
        System.out.println("Am I a student? Survey says: " + isStudent);
        System.out.println("Are you over six feet tall? Survey says: " + isTall);
    }
}
