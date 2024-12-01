package POP.lesson2;

public class ArithmeticExample {
    public static void main(String[] args) {
        // Declare variables
        int num1 = 15;
        int num2 = 4;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum:" + sum); // Output: 19

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference); // Output: 11

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product); // Output: 60

        // Division (integer division)
        int quotient = num1 / num2;
        System.out.println("Quotient (integer division): " + quotient); // Output: 3

        // Modulus (remainder of the division)
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder); // Output: 3

        // Division (floating-point division)
        double Quotient2 = num1 / 4.0; // One operand is a double to perform floating-point division
        System.out.println("Quotient (floating-point division): " + Quotient2); // Output: 3.75
        // the average
        double average = (double) sum / 2; // Casting to double to ensure precision
        System.out.println("Average: " + average); // Output: Average of num1 and num2

    }
}
