package POP.Assignment7;
import java.util.Scanner;

public class UppercaseCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a string (or press Enter to quit): ");
            input = scanner.nextLine();

            // Exit if the user enters an empty string
            if (input.isEmpty()) {
                break;
            }

            int uppercaseCount = countUppercaseLetters(input);
            System.out.printf("Number of uppercase letters: %d%n", uppercaseCount);
        }
    }

    public static int countUppercaseLetters(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }
}
