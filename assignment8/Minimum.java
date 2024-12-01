package assignment8;

public class Minimum {
    public static void main(String[] args) {

        // Declare and initialize an POP.array
        int[] numberArray = {3, 1, 4, 1, 5, 9};

        // Initialize `minimum` with the first element of the POP.array
        int minimum = numberArray[0];

        // Loop through the POP.array to find the minimum value
        for (int i = 1; i < numberArray.length; i++) {  // Start from index 1
            if (numberArray[i] < minimum) {
                minimum = numberArray[i];  // Update `minimum` if current element is smaller
            }
        }

        // Print the minimum value after the loop
        System.out.println("The minimum value in the POP.array is: " + minimum);
    }
}
