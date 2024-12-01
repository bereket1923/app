package POP.Assignment3;
import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Get the current year using java.time.LocalDate
        int currentYear = LocalDate.now().getYear();

        // Prompt the user to enter their birth year
        System.out.print("Enter the year you were born: ");
        int birthYear = input.nextInt();

        // Calculate the person's age
        int age = currentYear - birthYear;

        // Output the result
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");


    }
}