package Assignment11;

import java.util.Scanner;

public class factorial {
    static long factorial(int number) {
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product = product * i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
       long result= factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}
