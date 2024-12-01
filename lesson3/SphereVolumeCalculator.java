package POP.lesson3;

import java.util.Scanner; // Import the Scanner class for user input

public class SphereVolumeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the sphere (r): ");
        double radius = scanner.nextDouble(); // Use double for more precision

        // Calculate the volume of the sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is " + volume);
        // Display the volume of the sphere
        System.out.printf("The volume of the sphere with radius %.2f is: %.2f\n", radius, volume);

    }
}