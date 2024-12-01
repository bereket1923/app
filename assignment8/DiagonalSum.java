package assignment8;

public class DiagonalSum {

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {// Add the primary diagonal element (i, i)

            sum += matrix[i][i];

            // Add the secondary diagonal element (i, matrix.length - 1 - i)
            if (i != matrix.length - 1 - i) {  // To avoid counting the center element twice
                // in odd matrix.length
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // diffVariable matrix (3x3)
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int result = diagonalSum(matrix);
        System.out.println("Diagonal sum: " + result);  // Output should be 25
    }
}