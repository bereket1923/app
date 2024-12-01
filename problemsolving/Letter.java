package problemsolving;
import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter (A-Z or a-z): ");
        char letter = sc.next().charAt(0);


        //The character 'A' has an ASCII value of 65.
        //The character 'Z' has an ASCII value of 90.
        //The lowercase letter 'a' has an ASCII value of 97.
        //The lowercase letter 'z' has an ASCII value of 122
        // Check if the input is a valid letter
        if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {

            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
                    letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("You entered a vowel: " + letter);
            } else{
                System.out.println("You entered a consonant: " + letter);
            }
        } else {

            System.out.println("Error: Invalid input. Please enter a valid letter.");
        }
    }
}
