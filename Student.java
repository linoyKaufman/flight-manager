import staff.Person;

public class Student extends Person {
    
    private int studentId;
    private String subject;

    
    public Student(String name, int age, int ID, int studentId, String subject) {
        
        super(name, age, ID);
        this.studentId = studentId;
        this.subject = subject;
    }

    
    public int getStudentId() {
        return studentId;
    }

    
    public String getSubject() {
        return subject;
    }

   
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + subject);
    }
}
