package POP.Lesson5;

import java.util.Scanner;

public class SelectionDemo {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Read the age from the user
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Ask if the user has an ID card
        System.out.println("Do you have an ID card? (true/false): ");
        boolean hasIdCard = sc.nextBoolean();

        // CHECK IF THE CANDIDATE IS ELIGIBLE TO VOTE
        if (age >= 18 && hasIdCard) {
            System.out.println("You are eligible to vote.");
        } else if (age >= 18 && !hasIdCard) {
            System.out.println("You are not eligible to vote because you don't have an ID card.");
        } else {
            System.out.println("You are not eligible to vote because you are under 18.");
        }
    }
}
