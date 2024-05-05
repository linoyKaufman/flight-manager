
package EX1.persons;

import EX1.flightchanges.Observer;

public class Employee implements Observer {
    private String firstName;
    private String lastName;
    private int employeeID;

    
    public Employee(String firstName, String lastName, int employeeID)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

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
