package lesson8.reverse;

public class leftReverse {
    public static void main(String[] args) {

        int arr[] = {1, 4, 3, 2, 6, 5};

        //Arrays use length as a property or field, which stores the number of elements in the POP.array
        // Method to rotate the POP.array one position to the left
        int temp = arr[0];  // Store the first element
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];  // Shift elements to the left
        }
        arr[arr.length - 1] = temp;  // Place the first element at the end

        // Method to print the POP.array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print the entire POP.array
        }
        System.out.println();
    }
}