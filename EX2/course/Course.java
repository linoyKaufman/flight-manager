package EX2.course;
import java.util.ArrayList;
import java.util.List;

import EX2.staff.*;

public class Course implements CourseObservers{
    
    private String courseName;
    private String courseType;
    private int numofplaces;
    private List<Observer> registered;
    private List<Student> students; 
    private int courseID; 

    public Course(String courseName, String courseType, int courseID, int maxcapacity) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.numofplaces = maxcapacity;
        this.registered = new ArrayList<>();
        this.students =  new ArrayList<>();
        this.courseID = courseID;
        
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentList(){
        return students;
    }

    public void addToCourse (Student s1)
    {
        if(students.size()==numofplaces)
        {
            System.out.println("Course is full");
            registered.add(s1);
        }
        else{
            students.add(s1);
        }
    }

    public void removeFromCourse (Student s1)
    {
            students.remove(s1);
            if(numofplaces - students.size()==1)
            {
                notifySubscribers("there is place in course " + this.courseName);
            }
    }

    public int getCourseID(){
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

    @Override
    public void subscribe(EX2.course.Observer observer) {
        registered.add(observer);
    }

    @Override
    public void unsubscribe(EX2.course.Observer observer) {
        registered.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
        for(Observer observer : registered){
            observer.update(message);
           }
        
    }
}
