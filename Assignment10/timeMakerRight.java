package Assignment10;

public class timeMakerRight {
    public static void main(String[] args) {
        // Initialize the POP.array of time markers
        int[] timeMarkers = {1, 2, 3, 4, 5};

        // Store the last element in a temporary variable
        int temp = timeMarkers[timeMarkers.length - 1];

        // Shift each element one position to the right
        for (int i = timeMarkers.length - 1; i > 0; i--) {
            timeMarkers[i] = timeMarkers[i - 1];
        }

        // Place the last element at the first position
        timeMarkers[0] = temp;

        // Print the modified POP.array
        for (int i = 0; i < timeMarkers.length; i++) {
            System.out.print(timeMarkers[i] + " ");
        }
    }
}
