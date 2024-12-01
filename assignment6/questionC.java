package POP.assignment6;

import java.util.Scanner;

public class questionC {
    public static void main(String[] args) {
        // c: Logical error (unreachable condition) and undefined variables
        //corrected
        int x;
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a value for x (between 1 and 10): ");
        x = sc.nextInt();

        // Keep asking until x is within the range [1, 10]
        while (x < 1 || x > 10) {
            System.out.println("Invalid input. Please enter a value between 1 and 10.");
            x = sc.nextInt();
        }

        // Output the final value of x
        System.out.println("You entered: " + x);
    }
}