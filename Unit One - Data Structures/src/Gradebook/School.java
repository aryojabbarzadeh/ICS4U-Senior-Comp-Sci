package Gradebook;

import java.util.Scanner;

public class School {
    private static final int MAX_STUDENTS = 1000;
    private static final int MAX_CLASSES = 50;
    private static Student[] enrolledStudents = new Student[MAX_STUDENTS];
    private static int numStudents = 0;
    private static Course[] offeredCourses = new Course[MAX_CLASSES];
    private static int numCourses = 0;


    static Scanner in = new Scanner(System.in);

    public static void newStudent (){
        System.out.println("Please enter the last name of the student: ");
        String lname = in.nextLine();
        System.out.println("Please enter the first name of the student: ");
        String fname = in.nextLine();
        System.out.println("Please enter the student number: ");
        String studentNumber = in.nextLine();

        Student f = new Student (fname, lname, studentNumber);
        enrolledStudents[numStudents] = f;
        numStudents++;
    }

    public static void newCourse(){
        System.out.println("Please enter the course code: ");
        String courseCode = in.nextLine();
        System.out.println("Please enter the course name: ");
        String courseName = in.nextLine();

        Course k = new Course(courseCode, courseName);
        offeredCourses[numCourses] = k;
        numCourses++;
    }

    public static void displayStudents(){
        for(int x = 0; x<enrolledStudents.length-1; x++){
            if (enrolledStudents[x]!=null){
              System.out.println();
              System.out.print(enrolledStudents[x].getfName()+" ");
              System.out.print(enrolledStudents[x].getlName()+", ");
              System.out.println("Student Number: " + enrolledStudents[x].getSnumber());
          }  
        }
    }

    public static void addAssess(){
        System.out.println("Please enter the student number: ");
        String Snumber = in.nextLine();
        for(int x = 0; x<enrolledStudents.length-1; x++){
            if (enrolledStudents[x]!=null){
            if (enrolledStudents[x].getSnumber().equals(Snumber)){
                System.out.println("Please enter the name of the assessment: ");
                String aName = in.nextLine();
                System.out.println("Please enter the mark: ");
                int aMark = Integer.parseInt(in.nextLine());
                System.out.println("Please enter the course code: ");
                String courseCode = in.nextLine();

                Assessment a = new Assessment(aName, aMark, courseCode);
                Student.addAssessment(a);
            }
        }
        }

    }

    public static void getAverageCourse(){
        System.out.println("Please enter the course code: ");
        String courseCode = in.nextLine();
        Student.getAverage(courseCode);
    }
}
