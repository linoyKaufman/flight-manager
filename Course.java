public class Course {
    
    private String courseName;
    private String courseType;
    private int numofplaces;

    public Course(String courseName, String courseType, int numofplaces) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.numofplaces = numofplaces;
    }

    public String getCourseName() {
        return courseName;
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
}
