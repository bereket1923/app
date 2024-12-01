package quize;
import java.util.Scanner;
import java.util.Random;

public class toss {

    public static void main(String[] args) {
        int n =10;
        Random rand = new Random(); // Random number generator

                for (int i = 0; i < n; i++) {
                    int toss = rand.nextInt(3); // Generates 0 or 1
                    if (toss == 0) {
                        System.out.println("H"); // Heads
                    } else {
                        System.out.println("T"); // Tails
                    }
                }
            }
    }
