package POP.assignment6;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input N from the user
        System.out.print("Enter a positive integer N (greater than 2): ");
        int N = sc.nextInt();

        // Check if the input is greater than 2
        if (N <= 2) {
            System.out.println("N must be greater than 2.");
            return;
        }

        // Step 2: Initialize the prime count
        int primeCount = 0;

        // Step 3: Iterate through numbers from 2 to N
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        // Step 4: Display the result
        System.out.println("Number of primes between 2 and " + N + ": " + primeCount);
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        // 1 is not prime, skip numbers below 2
        if (num < 2) {
            return false;
        }
        // Check if the number is divisible by any number from 2 to num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
}