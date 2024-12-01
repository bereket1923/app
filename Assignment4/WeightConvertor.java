package POP.Assignment4;
import java.util.Scanner;
public class WeightConvertor {
    private double gravityMultiplier;
    private double earthWeight;
    private double weightOnPlanet;

    // Constructor to initialize the gravity multiplier
    public WeightConvertor(double gravityMultiplier) {
        this.gravityMultiplier = gravityMultiplier;
    }
    // Method to convert the Earth weight to the corresponding planet's weight
    public double convert(double weightOnPlanet) {
        weightOnPlanet = earthWeight * gravityMultiplier;
        return weightOnPlanet;
    }
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their Earth weight
        System.out.print("Enter your weight on Earth (in kg): ");
        double earthWeight = input.nextDouble();

        // Calculate the weight on each planet using the given multipliers
        double mercuryWeight = earthWeight * 0.4;
        double venusWeight = earthWeight * 0.9;
        double jupiterWeight = earthWeight * 2.5;
        double saturnWeight = earthWeight * 1.1;

        // Display the results
        System.out.println("Your weight on different planets:");
        System.out.println("Mercury: " + mercuryWeight + " kg");
        System.out.println("Venus: " + venusWeight + " kg");
        System.out.println("Jupiter: " + jupiterWeight + " kg");
        System.out.println("Saturn: " + saturnWeight + " kg");

    }
}
