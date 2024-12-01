package arrayBegin;
public class maxMinSingleArray {
    public static void main(String[] args) {
        // diffVariable POP.array of numbers
        int[] numbers = {3, 5, 4, 1, 9};

        // Initialize the minimum value to the first element of the POP.array
        int minimum = numbers[0];
        int maximum = numbers[0];

        // Loop through the POP.array starting from the second element
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
            if (numbers[i] > maximum) {
                maximum = numbers[i];

            }
        }
        // Print the final minimum and maximum values
        System.out.println("The minimum value is: " + minimum);
        System.out.println("The maximum value is: " + maximum);
            }
        }
