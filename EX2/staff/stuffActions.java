package EX2.staff;

import EX2.course.Course;
import EX2.course.CourseManagement;

public interface stuffActions {


    Course createCourse(final CourseManagement courseManagement, int courseNum, String courseName,String courseType, Integer maxStudents);
    
}
