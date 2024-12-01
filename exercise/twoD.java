package exercise;

public class twoD {
    public static void main(String[] args) {
        // Step 1: Declare and initialize two 2D arrays (same size)
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Step 2: Create a 2D POP.array to store the sum
        int[][] sumArray = new int[array1.length][array1[0].length];

        // Step 3: Add corresponding elements from both arrays
        for (int i = 0; i < array1.length; i++) { // Iterate through rows
            for (int x = 0; x < array1[i].length; x++) { // Iterate through columns
                sumArray[i][x] = array1[i][x] + array2[i][x];
                if(sumArray[i] [x]> 9){
                    sumArray[i][x] = 0;
                }
                System.out.print(sumArray[i][x] + " ");
            }
            System.out.println();
        }

    }
}
