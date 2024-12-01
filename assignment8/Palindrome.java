package assignment8;

import java.util.Scanner;

public class Palindrome {

    // Method to check if the word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string word:");
        String word = sc.next();
        System.out.println(isPalindrome(word));
    }
}