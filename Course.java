import java.util.List;
import flightchanges.Observer;

public class Course {
    
    private String courseName;
    private String courseType;
    private int numofplaces;
    private List<Observer> registered;
    private List<Student> students; 
    private String courseID; 

    public Course(String courseName, String courseType, int numofplaces,List<Observer> registered,List<Student> students, String courseID) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.numofplaces = numofplaces;
        this.registered = registered;
        this.students = students;
        this.courseID = courseID;
        
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentList(){
        return students;
    }

    public String getCourseID(){
        return courseID;
    }

    public String getCourseType() {
        return courseType;
    }

    public int getNumOfPlaces(){
        return numofplaces;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Type: " + courseType);
    }
  
    public void register(Observer student) {
       registered.add(student);
    }
}
