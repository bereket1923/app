package methodProblem;

import java.util.Scanner;

public class StudentPerformance {
//static void displayGrade(double totalScore){
//    String grade;
//    if (totalScore >= 90 && totalScore <= 100) {
//        System.out.println("grade:A");
//    } else if (totalScore >= 80 && totalScore <= 89) {
//        System.out.println("grade:B");
//    } else if (totalScore >= 70 && totalScore <= 79) {
//    System.out.println("grade:C");
//    } else {
//        System.out.println("grade:NC");
//    }
//
//    }
static String displayGrade(double totalScore) {
    String grade;  // Declare the grade variable

    if (totalScore >= 90 && totalScore <= 100) {
        grade = "A";
    } else if (totalScore >= 80 && totalScore <= 89) {
        grade = "B";
    } else if (totalScore >= 70 && totalScore <= 79) {
        grade = "C";
    } else {
        grade = "NC";
    }
    return grade;  // Return the grade

}
    static double calculateTotalScore(double attendanceScore, double examScore) {
        //find weight attendance score
        double weightAttendance = attendanceScore + ATTENDANCE_WEIGHT;
        //weight exam score
        double weightExam = examScore + EXAM_WEIGHTAGE;
        //find overall score
        double totalScore = weightAttendance + weightExam;
        System.out.println("Total score is: " + totalScore);
        return totalScore;//return double data type

    }

    static final double ATTENDANCE_WEIGHT = 0.2;
    static final double EXAM_WEIGHTAGE = 0.80;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Attendance Score: ");
        double attendanceScore = input.nextDouble();
        System.out.print("Exam Score: ");
        double examScore = input.nextDouble();
        double totalScore = calculateTotalScore(attendanceScore, examScore);
        System.out.println("Total score is: " + totalScore);
        System.out.println("grade is: " + displayGrade(totalScore));


    }
}

