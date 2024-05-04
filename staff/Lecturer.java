package staff;
public class Lecturer extends Person {
    
    private String department;

    public Lecturer(String name, int age, int ID ,String department ) {

        super(name, age, ID);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
