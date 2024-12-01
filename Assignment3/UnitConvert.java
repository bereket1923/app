package POP.Assignment3;
import java.util.Scanner;

public class UnitConvert {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length in centimeters
        System.out.print("Enter the length in centimeters: ");
        double centimeters = input.nextDouble();

        // Convert centimeters to inches (1 inch = 2.54 cm)
        double totalInches = centimeters / 2.54;

        // Convert inches to feet (1 foot = 12 inches)
        int feet = (int) totalInches / 12;  // Get the number of whole feet
        double remainingInches = totalInches % 12;  // Get the remaining inches

        // Display the result
        System.out.println(centimeters + " cm is approximately " + feet + " feet and "
                + String.format("%.2f", remainingInches) + " inches.");

    }
}