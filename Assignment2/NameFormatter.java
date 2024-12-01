package POP.Assignment2;

import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        // Create a POP.lesson1.Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the user's first, middle, and last name
        System.out.println("what is your first name?");
        String firstName = scanner.next();

        System.out.println("what is your middle name?");
        String middleName = scanner.next();

        System.out.println("what is your last name?");
        String lastName = scanner.next();

        // Extract the first letter of the middle name (middle initial)
        char middleInitial = middleName.charAt(0);

        // Display the name in the format: FirstName M. LastName
        System.out.println(firstName + " " + middleInitial + ". " + lastName);

    }
}