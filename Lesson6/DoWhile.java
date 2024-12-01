package POP.Lesson6;

public class DoWhile {
    public static void main(String[] args) {
        // Initialize counter to 1
        int count = 1;

        // Do-while loop to print from 1 to 10
        do {
            System.out.println("Hello World " + count); // Print with counter
            count++; // Increment the counter
        } while (count <= 10); // Continue loop until counter reaches 10
    }
}