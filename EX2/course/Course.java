package EX2.course;
import java.util.ArrayList;
import java.util.List;

import EX2.staff.*;
// This class represents a course.
public class Course implements CourseObservers{
    
    private String courseName; // Name of the course
    private String courseType;// Type of the course
    private int numofplaces;  // Maximum capacity of the course
    private List<Observer> registered; // List of observers subscribed to the course
    private List<Student> students; // List of students enrolled in the course
    private int courseID;  // ID of the course

    // Constructor to initialize the Course object with course details.
    public Course(String courseName, String courseType, int courseID, int maxcapacity) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.numofplaces = maxcapacity;
        this.registered = new ArrayList<>();
        this.students =  new ArrayList<>();
        this.courseID = courseID;
        
    }
    // Method to get the name of the course.
    public String getCourseName() {
        return courseName;
    }
    // Method to get the list of students enrolled in the course.
    public List<Student> getStudentList(){
        return students;
    }
    // Method to add a student to the course.
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
    // Method to remove a student from the course.
    public void removeFromCourse (Student s1)
    {
            students.remove(s1);
            if(numofplaces - students.size()==1)
            {
                notifySubscribers("there is place in course " + this.courseName);
            }
    }
    // Method to get the ID of the course.
    public int getCourseID(){
        return courseID;
    }
    // Method to get the type of the course.
    public String getCourseType() {
        return courseType;
    }
    // Method to get the number of available places in the course.
    public int getNumOfPlaces(){
        return numofplaces;
    }
    // Method to display information about the course.
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Type: " + courseType);
    }
    
    // Method to register an observer for the course.
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
