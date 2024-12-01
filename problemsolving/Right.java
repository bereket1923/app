package problemsolving;

public class Right {
    public static void main(String[] args) {
        int rows = 4;
        for (int i= 1; i <= 4; i++) {
            // Print spaces
            for (int x = 1; x <= 4 - i; x++) {
                System.out.print(" ");//print space
            }
            // Print numbers
            for (int x = 1; x <= i; x++) {
                System.out.print(x);//print value
            }
            System.out.println();
        }
    }
}