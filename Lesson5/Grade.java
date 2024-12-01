package POP.Lesson5;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade of the student: ");
        int grade = sc.nextInt();
        if (grade >= 93) {
            System.out.println("Grade is A.");
        } else if (grade >=89) {
            System.out.println("Grade is A-.");
        } else if (grade >=85) {
            System.out.println("Grade is B+.");
        } else if (grade >=82) {
            System.out.println("Grade is B.");
        } else if (grade >=78) {
            System.out.println("Grade is B-.");
        } else if (grade >=75) {
            System.out.println("Grade is C.");
        }else if (grade >=68) {
            System.out.println("Grade is c-.");
        }else if (grade >=0) {
            System.out.println("Grade is NC.");
        }
    }
}
