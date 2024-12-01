package Assignment11;

import java.util.Scanner;

public class Grade {

    // Method to calculate the average of three scores
    static double studentGrade(double score1, double score2, double score3) {
        double averageScore = (score1 + score2 + score3) / 3;
        return averageScore;
    }

    // Method to determine if the student passed or failed based on the average score
    static String determineResult(double averageScore) {
        if (averageScore >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collecting scores for three assignments from the user
        System.out.println("Enter assignment 1 score out of 100: ");
        double score1 = sc.nextDouble();

        System.out.println("Enter assignment 2 score out of 100: ");
        double score2 = sc.nextDouble();

        System.out.println("Enter assignment 3 score out of 100: ");
        double score3 = sc.nextDouble();

        //calling
        double averageScore = studentGrade(score1, score2, score3);
        String result = determineResult(averageScore);

        // Display the average score and result
        System.out.println("The average score is: " + averageScore);
        System.out.println("The student has: " + result);
    }
}