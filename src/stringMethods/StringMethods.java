package stringMethods;

/**
 * Name: Nigel Wilkerson
 * File: StringMethods.java
 * Version: 1.0
 * Date: 6/3/2026
 * Description: Demonstrates Java String methods for retrieving length, characters, and indexes, with reference
 *              comments for additional methods like toUpperCase, trim, replace, and equals
 */

public class StringMethods {

    public static void main(String[] args) {

        // Declare a string name
        String name = "Nigel Wilkerson";

        // To get the length of a string, declare int + string variable .length method
        int length = name.length();

        // To return a letter of any word at the specified index use the charAt() method
        char letter = name.charAt(0);

        // To return first letter of a given index use the indexOf() method
        int index = name.indexOf(" ");

        // To return last letter of a given index use the lastIndexOf() method
        int lastIndex = name.lastIndexOf("n");


        //Output
        System.out.printf("Your name is %s and the character count is %d\n" , name, length);
        System.out.printf("The first initial of your last name starts with a '%c'\n", letter);
        System.out.println(index);
        System.out.println(lastIndex);


        /* Below are other string methods that can be nice to know without disrupting the code above

        name = name.toUppercase() will output "NIGEL WILKERSON"
        name = name.toLowercase() will output "nigel wilkerson"
        name = name.trim() will remove all empty spaces
        name = name.replace() will replace one character with another
        name = name.isEmpty() can be used to see if the variable is empty (boolean) or even in an if-else statement
        name = name.contains() can be used to see if the variable contains letters or spaces or in an if-else statement
        name = name.equal is used to see if two strings are equal which can help if you don't want them to be the same
        and to help with case sensitivity you can use .equalsIgnoreCase


         */
    }
}
