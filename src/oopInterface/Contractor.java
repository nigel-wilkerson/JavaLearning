package oopInterface;

/**
 * Name: Nigel Wilkerson
 * File: Contractor.java
 * Version: 1.0
 * Date: 8/23/2026
 * Description: Represents an external contractor. Implements Authenticatable
 *              and ClearanceHolder (with company affiliation), but not
 *              Auditable — external contractors are audited through their
 *              own company's systems rather than internally.
 */

public class Contractor implements Authenticatable, ClearanceHolder{

    // Add Fields
    String name;
    String username;
    String password;
    String clearanceLevel;
    String company;

    // Add Constructor with fields
    Contractor(String name, String username, String password, String clearanceLevel, String company) {
        this.name = name;
        this. username = username;
        this.password = password;
        this.clearanceLevel = clearanceLevel.toUpperCase();
        this.company = company;
    }
    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println(this.name + " from " + this.company + " login successful.");
            return true;
        }
        else {
            System.out.println(this.name + " from " + this.company + " login failed.");
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println(this.name + " from " + this.company + ", you have successfully logged out.");
    }

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
