package POP.Lesson5;

import java.util.Scanner; // Import the Scanner class

public class Booleanoperator {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        // Boolean comparisons
        // logical and
        System.out.println(number1 == number2); // false, they are not equal
        System.out.println(number1 != number2); // true, they are not equal
        System.out.println(number1 > number2 && number2 > 0); // false && true => false
        System.out.println(number1 < number2 && number2 > 0); // true && true => true

        // Logical OR
        System.out.println(number1 > number2 || number2 > 0); // false || true => true
        System.out.println(number1 < number2 || number2 < 0); // true || false => true

        // Getting user input for numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        number2 = scanner.nextInt();

        // Do division with validation
        if (number2 != 0) {
            System.out.println(number1 / number2); // Print result if number1 is non-zero
        } else {
            System.out.println("Division is not possible"); // Handle division by zero
        }

        // Check if both numbers are even and add them
        if ((number1 % 2 == 0) && (number2 % 2 == 0)) {
            System.out.println("Both numbers are even. Their sum is: " + (number1 + number2));
        }
    }
}