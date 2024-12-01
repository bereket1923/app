package exercise;

public class oneDim {
    public static void main(String[] args) {
        // Step 1: Declare and initialize two arrays with the same size
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1, 2, 3, 4, 5};

        // Step 2: Create a third POP.array to store the sum
        int[] sumArray = new int[array1.length]; // array1 and array2 must be of same length

        // Step 3: Add corresponding elements from both arrays
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
            System.out.println(sumArray[i]);
        }
    }
}