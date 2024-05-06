    package EX2;

    import java.util.Scanner;
    import EX2.course.Course;
    import EX2.course.CourseManagement;
    import EX2.staff.Lecturer;
    import EX2.staff.Student;

    public class Main {
        public static void main(String[] args){
        
        // Create a singleton instance of SchoolStuffSingleton
        SchoolStuffSingeltone schoolStuff = SchoolStuffSingeltone.getInstance();
        
        // Create an instance of CourseManagement
        CourseManagement courseManagement = new CourseManagement();
        
        // Create instances of Student and Lecturer
        Student linoy = new Student("linoy", 25, 123, 567, "computer");
        Lecturer amit = new Lecturer("amit", 45, 785, "computer");
        Student david = new Student("david", 25, 8587, 88878, "computer");
        
        // Add members to the staff using the singleton instance
        schoolStuff.addMemberToStuff(amit);  
        schoolStuff.addMemberToStuff(linoy);
        schoolStuff.addMemberToStuff(david);
        
        // Create courses using the Lecturer object       
        Course c1 = amit.createCourse(courseManagement, 5869, "computer", "seminar", 1);
        Course c2 =amit.createCourse(courseManagement, 888820, "english", "must", 2);
        
        // Register students to courses
        linoy.registertoCourse(c1);
        david.registertoCourse(c1);
        // Unregister a student from a course
        linoy.unregistertoCourse(c1);

        //we wants to see that "david" gets a notification that there is a place because "linoy" unregister


    

    }
    
    }