package printf;

/**
 * Name: Nigel Wilkerson
 * File: PrintfStatement.java
 * Version: 1.0
 * Date: 5/27/2026
 * Description: Demonstrates printf formatting using specifiers for chars,
 * strings, integers, decimals, and booleans in a nurse-patient conversation
 */

public class PrintfStatement {

    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specific-character]

        /*
        Other helpful tips to remember
        + = output a plus   Ex: +43
        , = comma grouping separator   Ex: 1,000
        ( = negative numbers are enclosed in ()   Ex: (-54)
        space = display a minus if negative, space if positive   Ex:
         */

        String firstName = "Sly";
        String lastName = "Cooper";
        char firstLetter = 'S';
        int age = 21;
        double price = 999.99;
        boolean isCorrect = true;

        System.out.printf("Nurse: Hello may I get your first initial, last name, and age?\n");
        System.out.printf("Patient: Hello my name is %c. %s and I am %d years old.\n",firstLetter, lastName, age);
        System.out.printf("Nurse: %s %s thanks for waiting, the price will be $%.2f\n",firstName, lastName, price);
        System.out.printf("Patient: That's a lot, are you sure that $%.2f is the correct price?\n", price);
        System.out.printf("Nurse: Yes the $%.2f is %b.", price, isCorrect);



    }
}
