package POP.Assignment7;
import java.util.Scanner;

public class EasyPaChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        while (true) {
            System.out.print("Enter a word: ");
            word = scanner.next();


            if (word.length() == 0) {
                break;
            }

            // Check if the word is a palindrome and print the result
            if (isPalindrome(word)) {
                System.out.println("The word \"" + word + "\" is a palindrome.");
            } else {
                System.out.println("The word \"" + word + "\" is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        String lowerStr = str.toLowerCase(); // Convert to lowercase to ignore case
        return lowerStr.equals(new StringBuilder(lowerStr).reverse().toString());
    }
}