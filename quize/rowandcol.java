package quize;

public class rowandcol {

        public static void main(String[] args) {
            int number = 10; // Start from 10
            //determines how many lines are printed.
            //condition col <= row does not appear in the outer loop
            // because the outer loop controls the rows, not the columns
            for (int row = 10; number <= 49; row++) {
                // Inner loop to print numbers based on the pattern
                //Both parts are conditions (col <= row and number <= 49)
                //Inner loop: Controls the columns—it determines how many numbers
                // are printed on a single row
                for (int col = 1; col <= row && number <= 49; col++) {
                    System.out.print(number + " ");
                    number++; // Increment the number after printing
                }
                System.out.println(); // Move to the next line after printing numbers in the row
            }
        }
    }