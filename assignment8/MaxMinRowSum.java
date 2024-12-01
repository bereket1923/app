package assignment8;

public class MaxMinRowSum {

    public static void findMaxMinRowSum(int[][] matrix) {
        int maxRowSum = Integer.MIN_VALUE;
        int minRowSum = Integer.MAX_VALUE;
        int rowIndexMax = -1;
        int rowIndexMin = -1;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int x = 0; x < matrix[i].length; x++) {
                rowSum += matrix[i][x];  // Sum of the current row
            }

            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                rowIndexMax = i;
            }

            if (rowSum < minRowSum) {
                minRowSum = rowSum;
                rowIndexMin = i;
            }
        }

        // Print results
        System.out.println("Maximum row sum: " + maxRowSum + " (Row " + (rowIndexMax + 1) + ")");
        System.out.println("Minimum row sum: " + minRowSum + " (Row " + (rowIndexMin + 1) + ")");
    }

    public static void main(String[] args) {
        // diffVariable 2D POP.array (3x4 matrix)
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { -1, -2, -3, -4 }
        };

        findMaxMinRowSum(matrix);
    }
}
