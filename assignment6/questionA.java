package POP.assignment6;

public class questionA {
    public static void main(String[] args) {
        // a: Logical error (infinite loop) and undefined variables
        //corrected
        int x = 0, y = 1; // Initialize with proper values
        int a = 2, b = 3; // Initialize with proper values
        for (int i = 10; i > 0; i--) { // Corrected to decrement 'i'
            x = y;
            a = b;
            System.out.println(i);
        }
    }
}