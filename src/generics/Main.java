package generics;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 10/15/2026
 * Description: Test driver for the generic GameCharacter class. Creates multiple GameCharacter
 *              instances with String name, String status, and Integer level, then prints each
 *              one's info to demonstrate that one generic class can hold different type combinations.
 */

public class Main {

    public static void main(String[] args) {

        GameCharacter<String, String, Integer> character1 = new GameCharacter<>("Iron Man", "Hero", 100);
        GameCharacter<String, String, Integer> character2 = new GameCharacter<>("Hawkeye", "Hero", 85);
        GameCharacter<String, String, Integer> character3 = new GameCharacter<>("Thanos", "Villain", 500);

        //Used method to get the character's info
        character1.getCharacterInfo();
        character2.getCharacterInfo();
        character3.getCharacterInfo();
    }

}
