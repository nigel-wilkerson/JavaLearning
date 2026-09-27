package oopGettersSetters;

/**
 * Name: Nigel Wilkerson
 * File: Employee.java
 * Version: 1.0
 * Date: 9/26/2026
 * Description:
 */

public class Employee {
    private String name;
    private String employeeId;
    private double salary;
    private String department;

    Employee(String name, String employeeId, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    public void setName(String name){
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name.");
            return;
        }
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
        } else {
            this.salary = salary;
        }
    }
    public void setEmployeeId(String employeeId){
        if (employeeId == null|| employeeId.length() != 6) {
            System.out.println("Employee ID must be 6 characters.");
            return;
        }
        this.employeeId = employeeId;

    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Employee Id: " + this.employeeId);
        System.out.printf("Salary: $%,.2f%n", this.salary);
        System.out.println("Department: " + this.department);
    }
    public String getName() {
        return this.name;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }
    public double getSalary() {
        return this.salary;
    }
    public String getDepartment() {
        return this.department;
    }
}
