package EX2.course;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import EX2.course.*;



public class CourseManagement {

    private final Map<Integer, Course> CourseList = new HashMap<>();

    public Course addCourseToList(int courseNum, String courseName, String courseType, Integer maxStudents) {
        Course course = null;

        switch (courseType){
            case "seminar":
                course = CourseList.computeIfAbsent(courseNum, newCourseNum -> {   //fly wight factory   אם לא קיים תיצור אם קיים תחזיר
                    return new SeminarCourse( courseName,newCourseNum, maxStudents);
                });
                break;
            case "elective":
                course = CourseList.computeIfAbsent(courseNum, newCourseNum -> {
                    return new ElectiveCourse(newCourseNum, courseName, maxStudents);
                });
                break;
            case "must":
                course = CourseList.computeIfAbsent(courseNum, newCourseNum -> {
                    return new MustCourse(newCourseNum, courseName, maxStudents);
                });
                break;
        }
        return course;
    }
    public Map<Integer, Course> getcourselist ()
    {
        return this.CourseList;
    }
}