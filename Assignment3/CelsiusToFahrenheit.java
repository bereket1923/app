package POP.Assignment3;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = 1.8 * celsius + 32;

        // Display the result
        System.out.println(celsius + " degrees Celsius is equivalent to " + fahrenheit + " degrees Fahrenheit.");

    }
}
