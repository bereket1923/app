package Assignment10;

public class StrengthTournament {
    public static void main(String[] args) {
        // Input list of strengths
        int[] strengths = {3, 8, 10, 5, 9, 1};

        // Initialize first and second strongest to the smallest possible value
        int firstStrongest = Integer.MIN_VALUE;
        int secondStrongest = Integer.MIN_VALUE;

        for (int i = 0; i < strengths.length; i++) {
            // Update first and second strongest if necessary
            if (strengths[i] > firstStrongest) {
                secondStrongest = firstStrongest;
                firstStrongest = strengths[i];
            } else if (strengths[i] > secondStrongest) {
                secondStrongest = strengths[i];
            }
        }
        // Output of second strongest
        System.out.println("The second strongest person has a strength of " + secondStrongest);
    }
}