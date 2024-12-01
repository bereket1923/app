package POP.assignment6;

import java.util.Scanner;

public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < n; i++) { // Check divisibility from 2 to n-1
            if (n % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // Otherwise, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (negative to quit): ");
            int num = scanner.nextInt(); // Read user input

            if (num < 0) {
                System.out.println("Program stopped."); // Stop when input is negative
                break;
            }

            // Check if the number is prime and display the result
            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}