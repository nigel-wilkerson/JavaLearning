package objectsArray;

/**
 * Name: Nigel Wilkerson
 * File: Player.java
 * Version: 1.0
 * Date: 8/13/2026
 * Description: A Player class representing a member of a sports team. Each player has
 *  *           a name, jersey number, position, and running total of points scored.
 *  *           Practice exercise for arrays of objects and aggregation patterns.
 */

public class Player {

    // Declare variables
    String name;
    int jersey;
    String position;
    int pointsScored;

    Player (String name, int jersey, String position) {
        this.name = name;
        this.jersey = jersey;
        this.position = position;
        this.pointsScored = 0;
    }

    void scorePoints(int points) {
        this.pointsScored += points;
    }

    void displayStats() {
        System.out.println("--------- Player Stats ---------");
        System.out.println("Name: " + this.name);
        System.out.println("Jersey number: " + this.jersey);
        System.out.println("Player Position: " + this.position);
        System.out.println("Points scored: " + this.pointsScored);
        System.out.println("--------------------------------");
    }
}
