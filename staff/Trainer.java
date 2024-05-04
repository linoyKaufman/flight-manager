package staff;
public class Trainer extends Person {

    private String department;

    public Trainer(String name, int age, int ID ,String department ) {

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
    
