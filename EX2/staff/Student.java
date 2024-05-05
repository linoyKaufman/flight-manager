package EX2.staff;
import EX2.course.Course;
import EX2.course.Observer;

public class Student extends Person implements StudentActions, Observer {
    
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


    @Override
    public void registertoCourse(Course c1) {
        c1.addToCourse(this);
        }    


    @Override
    public void unregistertoCourse(Course c1) {
        c1.removeFromCourse(this);
    }


    @Override
    public void update(String message) {
        System.out.println("dear student : there is a place");
    }
}
