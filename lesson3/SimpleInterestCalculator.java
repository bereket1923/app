package POP.lesson3;

import java.util.Scanner; // Import the Scanner class for user input

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the principal amount
        System.out.print("Enter the principal amount (P): ");
        float principal = scanner.nextFloat();

        // Prompt the user for the rate of interest
        System.out.print("Enter the rate of interest (R) in percentage: ");
        float rateOfInterest = scanner.nextFloat();

        // Prompt the user for the time period in years
        System.out.print("Enter the time period in years (T): ");
        int time = scanner.nextInt();

        // Calculate simple interest
        float simpleInterest = (principal * rateOfInterest * time) / 100;

        // Display the simple interest
        System.out.printf("The simple interest (S.I.) is: %.2f\n", simpleInterest);

    }
}