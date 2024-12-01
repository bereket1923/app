package POP.Assignment5;
import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Call the method to check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

    }

    // Method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Check if the year is divisible by 100
            if (year % 100 == 0) {
                // Check if the year is also divisible by 400
                if (year % 400 == 0) {
                    return true; // It is a leap year
                } else {
                    return false; // It is not a leap year
                }
            } else {
                return true; // It is a leap year
            }
        } else {
            return false; // It is not a leap year
        }
    }
}