package lesson8.maxMin;

public class singleSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5}; // diffVariable POP.array

        // Initialize variables
        int totalSum = 0;
        int minElement = arr[0];
        int maxElement = arr[0];

        // Traverse the POP.array to find total sum, min, and max elements
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

            if (arr[i] < minElement) {
                minElement = arr[i]; // Find the minimum element
            }

            if (arr[i] > maxElement) {
                maxElement = arr[i]; // Find the maximum element
            }
        }

        // Calculate minimum sum (exclude the largest element)
        int minSum = totalSum - maxElement;

        // Calculate maximum sum (exclude the smallest element)
        int maxSum = totalSum - minElement;

        // Output the results
        System.out.println("Minimum Sum: " + minSum);
        System.out.println("Maximum Sum: " + maxSum);
    }
}