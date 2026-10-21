package enhancedSwitches;

/**
 * Name: Nigel Wilkerson
 * File: Quotes.java
 * Version: 1.0
 * Date: 10/20/2026
 * Description: Enum of MCU characters, each carrying a number for menu lookup.
 *              Demonstrates that enum constants can hold data via fields and constructors.
 */
public enum Quotes {

    TONYSTARK(1), THANOS(2), CAPTAINAMERICA(3),
    NICKFURY(4), VISION(5);

    private final int characterNumber;

    Quotes(int characterNumber) {
        this.characterNumber = characterNumber;
    }

    public int getCharacterNumber() {
        return this.characterNumber;
    }
}
