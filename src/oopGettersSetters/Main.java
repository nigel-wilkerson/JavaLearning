package oopGettersSetters;

/**
 * Name: Nigel Wilkerson
 * File: Main.java
 * Version: 1.0
 * Date: 9/26/2026
 * Description:
 */

public class Main {

    public static void main(String[] args) {

        //Create an employee
        Employee employee1 = new Employee("Lil Baby", "Lil123", 57000, "Health");

        employee1.displayInfo();
        System.out.println();

        employee1.setSalary(-5000);
        employee1.setName("");
        employee1.setEmployeeId("ABC");
        employee1.setDepartment("Support Staff");
        System.out.println();

        employee1.displayInfo();

    }
}
