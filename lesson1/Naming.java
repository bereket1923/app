package POP.lesson1;

import java.util.Scanner;

public class Naming {
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner scan = new Scanner(System.in);

        // Read first name
        System.out.println("Enter first name:");
        firstName = scan.next();

        // Read last name
        System.out.println("Enter last name:");
        lastName = scan.next();

        // Extract the first letter of firstName
        String firstLetter = firstName.substring(0, 1);

        // Extract the first letter of lastName
        String lastLetter = lastName.substring(0, 1);

        // Print the first letters
        System.out.println("First letter of first name: " + firstLetter);
        System.out.println("First letter of last name: " + lastLetter);

    }
}