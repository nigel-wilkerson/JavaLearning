package oopInterface;

/**
 * Name: Nigel Wilkerson
 * File: SecurityOfficer.java
 * Version: 1.0
 * Date: 8/23/2026
 * Description: Represents a cleared employee. Extends Employee for
 *              authentication and audit behavior, and additionally
 *              implements ClearanceHolder to support security-clearance-
 *              based access control.
 */

public class SecurityOfficer extends Employee implements ClearanceHolder{

    // Add Fields
    String clearanceLevel;

    // Add Security Officer Constructor
    SecurityOfficer (String name, String username, String password, String clearanceLevel) {
        super(name, username,password);
        this.clearanceLevel = clearanceLevel.toUpperCase();
    }

    // Implement
    @Override
    public String getClearanceLevel() {
        return this.clearanceLevel;
    }

    @Override
    public boolean canAccess(String requiredLevel) {
        return levelToNumber(this.clearanceLevel) >= levelToNumber(requiredLevel);
    }
    private int levelToNumber(String clearanceLevel) {
        return switch (clearanceLevel) {
            case "PUBLIC" -> 0;
            case "CONFIDENTIAL" -> 1;
            case "SECRET" -> 2;
            case "TOP_SECRET" -> 3;
            default -> -1;
        };
    }
}
