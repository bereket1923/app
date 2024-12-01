package POP.assignment9;

public class SymmetryPyramid {
    public static void main(String[] args) {

        ////If the number of stars in a row is odd,
        // you can perfectly center it by adding spaces before the stars,
        // forming a symmetric pyramid, otherwise we can not do
        // Outer loop for the number of rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop for printing spaces
            for (int k = 1; k <= 5-i; k++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int x = 1; x <= (2*i-1); x++) {
                System.out.print("*");
            }

            // Print a new line after each row
            System.out.println();
        }
    }
}
