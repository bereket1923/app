package lesson8.reverse;

public class rightReverse {
    public static void main(String[] args) {

        int arr[] = {1, 4, 3, 2, 6, 5};

        // Method to rotate the POP.array one position to the right
        int temp = arr[arr.length - 1];  // Store the last element
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  // Shift elements to the right
        }
        arr[0] = temp;  // Place the last element at the front

        // Print the entire POP.array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element
        }
        System.out.println();
    }
}