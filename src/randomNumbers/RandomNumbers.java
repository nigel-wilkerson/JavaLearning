package randomNumbers;
import java.util.Random;

/**
 * Name: Nigel Wilkerson
 * File: RandomNumbers.java
 * Version: 1.0
 * Date: 5/27/2026
 * Description:
 */

public class RandomNumbers {

    public static void main(String[] args) {

        // Add Random just like scanner input
        Random random = new Random();

        // Declare number
        int number;

        // Assign number to be a random number between 1 and 10
        number = random.nextInt(1, 11);

        //Print random numbers between 1 and 10
        System.out.println(number);
    }
}
