package EX2;

import EX2.course.Course;
import EX2.course.CourseManagement;
import EX2.staff.Lecturer;
import EX2.staff.Student;

public class Main {
    public static void main(String[] args){
    SchoolStuffSingeltone schoolStuff = SchoolStuffSingeltone.getInstance();
    CourseManagement courseManagement = new CourseManagement();
    Student linoy = new Student("linoy", 25, 123, 567, "computer");
    Lecturer amit = new Lecturer("amit", 45, 785, "computer");
    schoolStuff.addMemberToStuff(amit);
    schoolStuff.addMemberToStuff(linoy);
    Course c1 = amit.createCourse(courseManagement, 5869, "computer", "seminar", 1);
    Course c2 =amit.createCourse(courseManagement, 888820, "english", "must", 2);
    Student david = new Student("david", 25, 8587, 88878, "computer");
    linoy.registertoCourse(c1);
    david.registertoCourse(c1);
    linoy.unregistertoCourse(c1);

}
    
}
