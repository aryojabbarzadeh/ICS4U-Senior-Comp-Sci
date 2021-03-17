package Gradebook;

public class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;

    }

    public String getcourseCode(){
        return courseCode;
    }

    public String getcourseName(){
        return courseName;
    }
}
