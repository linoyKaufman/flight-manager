
package EX1.persons;

import EX1.flightchanges.Observer;

// This class represents an employee in the system.
public class Employee implements Observer {
    private String firstName; // First name of the employee
    private String lastName; // Last name of the employee
    private int employeeID; // Employee ID

    // Constructor to initialize the Employee object with employee details.
    public Employee(String firstName, String lastName, int employeeID)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }
    // Method to get the first name of the employee.
    public String getFirstName() {
        return firstName;
    }
    // Method to set the first name of the employee.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Method to get the last name of the employee.
    public String getLastName() {
        return lastName;
    }
    // Method to set the last name of the employee.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Method to get the employee ID.
    public int getEmployeeID() {
        return employeeID;
    }
    // Method to set the employee ID.
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    // Method to print details of the employee.
    public void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeID);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
