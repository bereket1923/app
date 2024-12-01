package arrayBegin;

public class arrayDemo4 {
    public static void main(String[] args) {
        // Declare, create, and initialize a 1D POP.array
        int[] oddNumber = {1, 3, 5, 7};
        System.out.println("odd number row:" +oddNumber.length);
        // Two-dimensional POP.array: there are three elements, each element is a 1D POP.array
        int[][] evenNumber = new int[3][]; // Column sizes are optional because it's a ragged POP.array

        // Initialize each row in the evenNumber POP.array, it is to show ragged value
        evenNumber[0] = new int[2]; // First row with 2 columns
        evenNumber[1] = new int[1]; // Second row with 1 column
        evenNumber[2] = new int[4]; // Third row with 4 columns

        // lets assign some value as an example
        evenNumber[1][0] = 10; // Assign value 10 to the second row, second column
        //when you leave it uninitialized), the elements are initially set to null
        // in certain types of arrays

        // Print the length of the 2D POP.array (number of rows)
        System.out.println("even number of rows: " + evenNumber.length);

        // Print the value stored in evenNumber[1][1]
        System.out.println("Value at evenNumber[1][1]: " + evenNumber[1][0]);
    }
}