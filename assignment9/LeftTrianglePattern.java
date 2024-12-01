package POP.assignment9;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        // Outer loop controls the number of rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop prints stars in each row
            // The number of stars printed in each row equals the current row number (i)
            for (int x = 1; x <= i; x++) {
                System.out.print(" *");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}