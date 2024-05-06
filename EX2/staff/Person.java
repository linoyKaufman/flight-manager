package EX2.staff;
// This class represents a person.
public class Person {
    
    private String name;
    private int age;
    private int ID;

     // Constructor to initialize the Person object with person details.   
    public Person(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Method to get the name of the person.
    public String getName() {
        return name;
    }

    // Method to get the age of the person.
    public int getAge() {
        return age;
    }
    // Method to get the ID of the person.
    public int getID() {
        return ID;
    }
    // Method to display information about the person.
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID number: " +ID);
    }
}
