package POP.assignment6;

import java.util.Scanner; // Import the Scanner class

public class questionB {
    public static void main(String[] args) {
        // b: Syntactical error (until instead of while) and undefined variable
        // corrected
        int sum = 0;
        Scanner sc = new Scanner(System.in); // Use java.util.Scanner for input
        int num; // Declare num
        do {
            num = sc.nextInt(); // Read input from the user
            sum += num;
        } while (sum <= 10000); // Changed 'until' to 'while'
        System.out.println("Sum exceeded 10000: " + sum);
    }
}