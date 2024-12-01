package problemsolving;

public class Sumsquare {
    public static void main(String[] args) {
        int sum = 0;  // Variable to store the sum of numbers

        // Sum of numbers from 1 to 5
        for (int x = 1; x <= 5; x++) {
            sum += x;
        }
        System.out.println("The sum of numbers from 1 to 5 is: " + sum);

        // Reset sum for the next calculation (sum of squares)
        sum = 0;

        // Sum of squares from 1 to 5
        for (int x = 1; x <= 5; x++) {
            sum += (x * x);  // Sum of squares
        }
        System.out.println("The sum of squares from 1 to 5 is: " + sum);
        //factorial
        sum = 0;
        int fact =1;
        for (int z = 1; z <= 5; z++) {
            fact = fact*z;
            sum += fact;
        }
        System.out.println("the factorial of this number is" +fact);
        System.out.println("The fact of numbers from 1 to 5 is: " + sum);
    }
}
