package problemsolving;

import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd-length string or number: ");
        String input = sc.next();
        int length = input.length();

        // Ensure the input is of odd length
        if (length % 2 == 0) {
            System.out.println("The input should be of odd length.");
            return;
        }

        // Print the X-shaped pattern
        for (int i = 0; i < length; i++) {
            for (int x = 0; x < length; x++) {
                if (x == i || x == length - 1 - i) {
                    System.out.print(input.charAt(x));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}