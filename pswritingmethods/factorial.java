package pswritingmethods;

import java.util.Scanner;

public class factorial {
    public static long calculateFactorial(int n) {
        int product =1;

        for (int i = 1; i <= n; i++) {
            product = product * i;

        }
        return product;//do not put return inside loop
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        long result =calculateFactorial(number);
        System.out.println("Factorial of this number is: " + result);
    }
}
