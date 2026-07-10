package arrays;

/**
 * Name: Nigel Wilkerson
 * File: Arrays.java
 * Version: 1.0
 * Date: 7/10/2026
 * Description: Demonstrates arrays and the enhanced for-each loop by storing a list of favorite TV shows
 *              and iterating through them
 */

public class Arrays {

    public static void main(String[] args) {

        // Declare variables
        String[] favTVShows = {"Family Guy", "Monday Night Raw", "From", "Interview With The Vampire"};

        System.out.println("Below are some of my favorite TV shows: ");

        // Print favorite TV shows
        for (String favTVShow : favTVShows) {
            System.out.println(favTVShow);
        }
    }
}
