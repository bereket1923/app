package POP.lesson7;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("enter the number between 1 and 20");
        int number = scanner.nextInt();  // Read the number

//        // Check if the number is even or odd
//        if (number % 2 == 0) {
//            System.out.println(number + " is an even number.");
//        } else {
//            System.out.println(number + " is an odd number.");
//        }
//        //option two using switch
        switch (number % 2) {
            case 0:
                System.out.println(number + " is an even number.");
                break;
            case 1:
                System.out.println(number + " is an odd number.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
