package assignment8;

public class FindMinMax {
    public static void main(String[] args) {
        // Sample input POP.array
        int[] arr = {3, 1, 4, 1, 5, 9};

        // Call the function to find the minimum and maximum elements
        int[] minMax = findMinMax(arr);

        // Print the minimum and maximum elements
        System.out.println("Max: " + minMax[1] + ", Min: " + minMax[0]);
    }

    // Function to find the minimum and maximum elements in an POP.array
    public static int[] findMinMax(int[] arr) {
        // Initialize min and max with the first element of the POP.array
        int min = arr[0];
        int max = arr[0];

        // Iterate through the POP.array and find the smallest and largest elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return both min and max in an POP.array
        return new int[]{min, max};
    }
}