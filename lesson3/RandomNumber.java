package POP.lesson3;

import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        // Create an object of the Random class
        Random random = new Random();
        // Generate a random number between 0 and 9 (10 is exclusive)
       // System.out.println(random.nextInt(10));

        // Generate a random number between 0 and 10 (11 is exclusive)
        //System.out.println(random.nextInt(11));
        for (int i = 1; i <= 3; i++) {
            System.out.println(random.nextInt(11));
        }
    }
}