package POP.lesson3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius of the circle
        System.out.println("Enter the radius of the circle:");

        // Check if the input is a valid double
        if (scanner.hasNextDouble()) {
            double radius = scanner.nextDouble();

            // Check for negative radius
            if (radius < 0) {
                System.out.println("Radius cannot be negative. Please enter a valid radius.");
            } else {
                // Calculate the area using Math.PI
                double area = Math.PI * radius * radius;

                // Output the area of the circle
                System.out.println("The area of the circle is: " + area);

                // Create an object of DecimalFormat to format the output
                DecimalFormat df = new DecimalFormat("#.###");

                // Output the formatted area of the circle
                System.out.println("The area of the circle (formatted) is: " + df.format(area));
            }
        } else {
            System.out.println("Invalid input. Please enter a numeric value for the radius.");
        }

    }
}