package POP.assignment9;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows (height of upper and lower parts)

        // Upper pyramid
        for (int i = 1; i <= rows; i++) {
            // Printing leading spaces
            for (int x = 1; x <= rows - i; x++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower inverted pyramid
        for (int i = rows - 1; i >= 1; i--) {
            // Printing leading spaces
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}