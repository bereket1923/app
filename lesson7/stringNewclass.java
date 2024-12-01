package POP.lesson7;

public class stringNewclass {
    private static int count = 0;  // Initialize count to 0

    public static void main(String[] args) {
        String proverb = "pride goes before fall";

        // Extract and print the first two letters
        char data1 = proverb.charAt(0);
        char data2 = proverb.charAt(1);
        System.out.println(data1);  // Output: p
        System.out.println(data2);  // Output: r

        // Extract and print the last letter
        char lastletter = proverb.charAt(proverb.length() - 1);
        System.out.println(lastletter);  // Output: l

        // Loop through the string and count vowels
        //Strings use length() as a method to calculate the number of characters
        for (int i = 0; i < proverb.length(); i++) {
            char ch = proverb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Print the total number of vowels found
        System.out.println("Total number of vowels: " + count);
    }
}