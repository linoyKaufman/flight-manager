package staff;
public class Person {
    
    private String name;
    private int age;
    private int ID;

    
    public Person(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

  
    public String getName() {
        return name;
    }

    
    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID number: " +ID);
    }
}
