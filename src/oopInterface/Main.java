package oopInterface;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 8/23/2026
 * Description: Driver class for the Secure Systems Access interfaces
 *              practice. Creates one Employee, SecurityOfficer, and
 *              Contractor to demonstrate multiple interface implementation,
 *              selective adoption of contracts, and clearance-based access
 *              checks.
 */

public class Main {

    public static void main(String[] args) {

        // Create one employee
        Employee employee1 = new Employee
                ("Nigel","NigelDaGoat","ILuvHeaven$");

        // Create one security officer
        SecurityOfficer securityOfficer1 = new SecurityOfficer
                ("Heaven", "HeavenDaGuard", "Hey1","secret");

        // Create one contractor
        Contractor contractor1 = new Contractor
                ("Blu", "Bluey", "IDC51","top_secret", "Lockheed Martin");

        // Display login true
        employee1.login("NigelDaGoat", "ILuvHeaven$");
        contractor1.login("Bluey", "IDC51");

        // Display login false
        employee1.login("NigelGoat", "ILuv$");
        contractor1.login("Blue", "IDC");


        employee1.logAction("Accessed a personnel file.");
        securityOfficer1.logAction("Took a break.");

        // Test clearance checks
        System.out.println
                ("SecurityOfficer can access Secret: " + securityOfficer1.canAccess("secret"));
        System.out.println
                ("SecurityOfficer can access TOP_SECRET: " + securityOfficer1.canAccess("TOP_SECRET"));
        System.out.println
                ("Contractor can access TOP_SECRET: " + contractor1.canAccess("TOP_SECRET"));

        // Log everyone out
        employee1.logout();
        securityOfficer1.logout();
        contractor1.logout();

        // Check their clearances
        System.out.println(contractor1.getClearanceLevel());
        System.out.println(securityOfficer1.getClearanceLevel());
    }
}
