package POP.lesson7;

import java.util.Scanner;

public class multipleGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many students' grades need to be entered
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Loop through each student and calculate their grade
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter grade score for student " + i + ": ");
            int grade = scanner.nextInt();

            // Determine the grade letter based on the score
            String gradeLetter;
            if (grade >= 90) {
                System.out.println("gradeLetter is: A");
            } else if (grade >= 80) {
                System.out.println(gradeLetter = "B");
            } else if (grade >= 70) {
                System.out.println(gradeLetter = "C");
            } else if (grade >= 60) {
                System.out.println(gradeLetter = "D");
            } else {
                System.out.println(gradeLetter = "F");
            }
        }
    }
}
