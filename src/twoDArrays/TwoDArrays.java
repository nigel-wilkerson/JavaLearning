package twoDArrays;

/**
 * Name: Nigel Wilkerson
 * File: TwoDArrays.java
 * Version: 1.0
 * Date: 8/5/2026
 * Description:
 */

public class TwoDArrays {

    public static void main(String[] args) {

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};
        for (char[] phoneNumbers : telephone){
            for (char phoneNumber : phoneNumbers){
                System.out.print(phoneNumber + " ");
            }
            System.out.println();
        }
    }
}
