package POP.Assignment3;
import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their body weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double bodyWeight = input.nextDouble();

        // Calculate the number of calories needed per day
        double calories = bodyWeight * 19;

        // Display the result
        System.out.println("You need " + calories + " calories per day based on your weight.");

    }
}