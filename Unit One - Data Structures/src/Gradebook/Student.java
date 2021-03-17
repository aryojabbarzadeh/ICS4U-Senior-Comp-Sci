package Gradebook;

public class Student {

    private String fname;
    private String lname;
    private String Snumber;
    private static Assessment[] assessments;
    private static int numAssess;

    public Student(String fname, String lname, String Snumber) {
        this.fname = fname;
        this.lname = lname;
        this.Snumber = Snumber;

    }

    public String getfName(){
        return fname;
    }

    public String getlName(){
        return lname;
    }

    public String getSnumber(){
        return Snumber;
    }

    public static void addAssessment(Assessment a){
        assessments[numAssess] = a;
        numAssess++;
    }

    public void getAverage(){
        int allMarks = 0;
        for (int i = 0; i<assessments.length-1;i++){
            allMarks = allMarks + assessments[i].getaMark();
        }

        allMarks = allMarks/assessments.length;
        System.out.println(allMarks);
    }

    public static void getAverage(String courseCode){
        int allMarks = 0;
        int k = 1;
        for (int i = 0; i<assessments.length-1;i++){
            if (assessments[i].getcourseCode().equals(courseCode)){
                allMarks = allMarks + assessments[i].getaMark();
                k++;
            }
        }

        allMarks = allMarks/k;
        System.out.println(allMarks);
    }
}
