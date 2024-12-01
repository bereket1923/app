package POP.Lesson5;

import java.util.Scanner;

public class SwichCase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of day: ");
        String day = sc.next().toUpperCase();

        int numberOfLetters = switch (day) {
            case "MONDAY", "Friday", "Sunday" -> 6;
            case "Wednesday" -> 9;
            case "Tuesday", "Thursday", "Saturday" -> 8;
            default -> 0; // Handle unknown days

        };
        System.out.println(numberOfLetters);
    }
}