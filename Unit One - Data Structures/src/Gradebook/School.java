package Gradebook;

import java.util.Scanner;

public class School {
    private static Student[] enrolledStudents;
    private static int numStudents = 0;
    private static Course[] offeredCourses;
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
        for(Student x:enrolledStudents){
          if (x!=null){
              System.out.println();
              System.out.println(x.getfName());
              System.out.println(x.getlName());
              System.out.println(x.getSnumber());
          }  
        }
    }

    public static void addAssess(){
        String Snumber = in.nextLine();
        for(Student x:enrolledStudents){
            if (x.getSnumber()==Snumber){
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

    public static void getAverageCourse(){
        System.out.println("Please enter the course code: ");
        String courseCode = in.nextLine();
        Student.getAverage(courseCode);
    }
}
