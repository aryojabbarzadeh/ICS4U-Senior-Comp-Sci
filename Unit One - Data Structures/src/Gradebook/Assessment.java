package Gradebook;

public class Assessment {    
    private String aName;
    private int aMark;
    private String courseCode;

    public Assessment(String aName, int aMark, String courseCode) {
        this.aName = aName;
        this.aMark = aMark;
        this.courseCode = courseCode;
    }

    public String getaName(){
        return aName;
    }

    public int getaMark(){
        return aMark;
    }

    public String getcourseCode(){
        return courseCode;
    }
}
