package Assignment11;

import java.util.Scanner;

public class Interest {

    // Method to calculate simple interest
    static double calculateSimpleInterest(double principalAmount, double rate, int timePeriod) {
        return (principalAmount * rate * timePeriod) / 100;
    }

    // Method to display the details of the interest calculation
    static void displayDetails(double principalAmount, double rate, int timePeriod, double simpleInterest) {
        System.out.println("Principal Amount: $" + principalAmount);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Duration: " + timePeriod + " years");
        System.out.println("Calculated Simple Interest: $" + simpleInterest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect user inputs
        System.out.println("Enter principal amount: ");
        double principalAmount = sc.nextDouble();

        System.out.println("Enter the rate of interest (in percentage): ");
        double rate = sc.nextDouble();

        System.out.println("Enter the number of years: ");
        int timePeriod = sc.nextInt();

        // Call the method to calculate simple interest
        double simpleInterest = calculateSimpleInterest(principalAmount, rate, timePeriod);

        // Call the method to display the details
        displayDetails(principalAmount, rate, timePeriod, simpleInterest);
    }
}