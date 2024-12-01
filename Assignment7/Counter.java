package POP.Assignment7;

public class Counter {

    public static void main(String[] args) {
        String sentence = "Mary had A little lamb";

        // Call the method to display vowel counts
        displayVowelCounts(sentence);
    }

    // Corrected method signature: should include parentheses and accept a string argument
    public static void displayVowelCounts(String sentence) {
        // Initialize vowel counts
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        // Count the vowels
        for (char c : sentence.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a': aCount++; break;
                case 'e': eCount++; break;
                case 'i': iCount++; break;
                case 'o': oCount++; break;
                case 'u': uCount++; break;
            }
        }

        // Print the results in the specified format
        System.out.println("\nVowel counts for the sentence:");
        System.out.println(sentence);
        System.out.println("# of 'a': " + aCount);
        System.out.println("# of 'e': " + eCount);
        System.out.println("# of 'i': " + iCount);
        System.out.println("# of 'o': " + oCount);
        System.out.println("# of 'u': " + uCount);
    }
}