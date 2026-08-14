package objectsArray;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/13/2026
 * Description: Demonstrates the Player class using an array of objects. Creates a five-player
 *  *           roster, gives each player points, displays their stats, calculates total team
 *  *           points (accumulation pattern), and finds the top scorer (find-max pattern).
 */

public class Main {

    public static void main(String[] args) {

        int totalPoints = 0;

        Player player1 = new Player("SpongeBob", 23, "Power Forward");
        Player player2 = new Player("Sandy", 45, "Point Guard");
        Player player3 = new Player("Mr. Krabs", 3, "Small Forward");
        Player player4 = new Player("Patrick", 50, "Center");
        Player player5 = new Player("Gary", 8, "Shooting Guard");

        Player players[] = {player1, player2, player3, player4, player5};


        // Give each player some points
        player1.scorePoints(50);
        player2.scorePoints(23);
        player3.scorePoints(13);
        player4.scorePoints(26);
        player5.scorePoints(33);

        for (Player player : players) {
            player.displayStats();
        }
        for (Player player : players) {
            System.out.println(player.name + " scored " + player.pointsScored + ".");
            totalPoints += player.pointsScored;
        }
        // Display team total points
        System.out.println("Total team points: " + totalPoints + ".");

        Player topScorer = players[0];

        for (Player player : players) {
            if (player.pointsScored > topScorer.pointsScored) {
                topScorer = player;
            }
        }
            System.out.println("Top scorer: " + topScorer.name + " with " + topScorer.pointsScored + " points");

    }
}
