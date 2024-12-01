package problemsolving;

public class ReversePyramid {
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;
        for (int y = 4; y >= 1; y--) {
            // Print spaces
            for (int x = y; x < rows; x++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int x = 1; x <= (2 * y - 1); x++) {
                System.out.print(num++);
            }
            System.out.println();
            num = 1; // Reset num after each row
        }
    }
}
