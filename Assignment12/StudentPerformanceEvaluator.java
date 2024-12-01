package Assignment12;

import java.util.Scanner;

public class StudentPerformanceEvaluator {
    final static double ATTENDANCE_RATE =0.20;
    final static double EXAM_RATE =0.80;

    // Method to calculate attendance score
    public static double calculateAttendanceScore(double attendancePercentage) {
        return attendancePercentage * 0.20;
    }

    // Method to calculate weighted exam score
    public static double calculateExamScore(double examScore) {
        return examScore * 0.80;
    }
    // Main method to orchestrate the calculations
    public static void studentPerformanceAndResult(double attendanceScore, double examScore) {
        double overallScore = attendanceScore + examScore;
        System.out.println("Overall Score: " + overallScore);

        if (overallScore >= 90) {
            System.out.println("Grade: A");
        } else if (overallScore >= 80) {
            System.out.println("Grade: B");
        } else if (overallScore >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: NC");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect input for attendance percentage and exam score
        System.out.println("Enter attendance percentage: ");
        double attendanceScore = sc.nextDouble();

        System.out.println("Enter exam score: ");
        double examScore = sc.nextDouble();

        // Call the method to evaluate student performance
       double exam = calculateExamScore(examScore);
       double attend = calculateAttendanceScore(attendanceScore);
        studentPerformanceAndResult(attendanceScore, examScore);
    }
}