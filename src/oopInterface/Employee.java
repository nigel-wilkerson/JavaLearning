package oopInterface;

/**
 * Name: Nigel Wilkerson
 * File: Employee.java
 * Version: 1.0
 * Date: 8/23/2026
 * Description: Represents a standard employee. Implements Authenticatable
 *              (can log in and out) and Auditable (actions are logged for
 *              compliance). Serves as the base class for cleared employees
 *              like SecurityOfficer.
 */

public class Employee implements Authenticatable, Auditable{

    String name;
    String username;
    String password;

    Employee(String name, String username, String password) {
        this.name = name;
        this. username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println(this.name + " login successful.");
            return true;
        }
        else {
            System.out.println(this.name + " login failed.");
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println(this.name + ", you have successfully logged out.");
    }

    @Override
    public void logAction(String action) {
        System.out.println("[AUDIT LOG] " + this.name + " performed: " + action);
    }
}
