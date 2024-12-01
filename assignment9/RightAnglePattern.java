package POP.assignment9;

public class RightAnglePattern {
    public static void main(String[] args) {
        // Outer loop controls the number of rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop for printing spaces (to align the stars to the right)
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            // The number of stars increases with each row
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}