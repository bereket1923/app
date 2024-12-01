package quize;

import java.util.Scanner;

public class booleanm {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a boolean value
        System.out.println("Enter a boolean value (true/false): ");

        // Use nextBoolean() to read the user's input
        boolean userInput = scanner.nextBoolean();

        // Output the value entered by the user
        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();
    }
}