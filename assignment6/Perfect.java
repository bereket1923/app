package POP.assignment6;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Step 2: Display proper divisors and check if the number is perfect
        boolean isPerfect = checkPerfectNumber(num);

        if (isPerfect) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    // Function to check if a number is perfect and display its proper divisors
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        System.out.print("Proper divisors of " + num + " are: ");

        // Step 3: Find and display proper divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println(); // For line break

        // Step 4: Check if the sum of proper divisors equals the number
        return sum == num;
    }
}