package selection;

import java.util.Scanner;

public class NumberClassifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();  // Read the integer input

        // Conditional logic to classify the number
        if (n % 2 != 0) {  // Check if the number is odd
            System.out.println("Weird");
        } else {  // If the number is even
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if(n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}