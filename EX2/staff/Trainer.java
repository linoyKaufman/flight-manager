package EX2.staff;

import EX2.course.Course;
import EX2.course.CourseManagement;
// This class represents a trainer, who is a type of person and can perform staff actions.
public class Trainer extends Person implements stuffActions {

    private String department;
    // Constructor to initialize the Trainer object with trainer details.
    public Trainer(String name, int age, int ID ,String department ) {

        super(name, age, ID);
        this.department = department;
    }
    // Method to get the department of the trainer.
    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public Course createCourse(CourseManagement courseManagement, int courseNum, String courseName, String courseType,
            Integer maxStudents) {
                return courseManagement.addCourseToList(courseNum, courseName, courseType, maxStudents);
    }
}
    
