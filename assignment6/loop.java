package POP.assignment6;

public class loop {
    public static void main(String[] args) {
        // Sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= 100; i++) {
            sumFor += i;
        }
        System.out.println("Sum (for loop) from 1 to 100: " + sumFor);
        // Sum using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= 100) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum (while loop) from 1 to 100: " + sumWhile);
        // Sum using do-while loop
        int sumDoWhile = 0;
        int j = 1;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= 100);
        System.out.println("Sum (do-while loop) from 1 to 100: " + sumDoWhile);
        //Using a for loop:
// Sum of multiples of 5 using for loop
        int sumForMultiples = 0;
        for (i = 5; i <= 50; i += 5) {
            sumForMultiples += i;
        }
        System.out.println("Sum (for loop) of multiples of 5 from 5 to 50: " + sumForMultiples);
        //Using a while loop:

// Sum of multiples of 5 using while loop
        int sumWhileMultiples = 0;
        int k = 5;
        while (k <= 50) {
            sumWhileMultiples += k;
            k += 5;
        }
        System.out.println("Sum (while loop) of multiples of 5 from 5 to 50: " + sumWhileMultiples);
    }
}
