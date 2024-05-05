package EX2.staff;

import EX2.course.Course;
import EX2.course.CourseManagement;

public class Lecturer extends Person implements stuffActions {
    
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

    @Override
    public Course createCourse(CourseManagement courseManagement, int courseNum, String courseName, String courseType,
            Integer maxStudents) {
              return courseManagement.addCourseToList(courseNum, courseName, courseType, maxStudents);
    }
}
