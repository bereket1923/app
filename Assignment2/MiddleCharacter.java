package POP.Assignment2;

public class MiddleCharacter {
    public static void main(String[] args) {
        String java = "Honey";  // diffVariable string
        char[] word = java.toCharArray();  // Convert string to char POP.array
        int length = word.length;

        // Check if the length of the string is odd
        if (length % 2 != 0) {
            // If odd, print the middle character
            int middleIndex = length / 2;
            System.out.println("The middle character is: " + word[middleIndex]);
        } else {
            // If even, print the two middle characters
            int middleIndex = length / 2;
            System.out.println("The middle characters are: " + word[middleIndex - 1] + word[middleIndex]);
        }
    }
}