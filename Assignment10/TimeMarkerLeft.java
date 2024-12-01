package Assignment10;

public class TimeMarkerLeft {
    public static void main(String[] args) {
        // Initialize the POP.array of time markers
        int[] timeMarkers = {1, 2, 3, 4, 5};

        // Store the first element in a temporary variable
        int temp = timeMarkers[0];

        // Increment each element (except the last one) by 1
        for (int i = 0; i < timeMarkers.length - 1; i++) {
            timeMarkers[i] = timeMarkers[i + 1];
        }
        timeMarkers[timeMarkers.length - 1] = temp;

        // Print the modified POP.array
        for (int i = 0; i < timeMarkers.length; i++) {
            System.out.print(timeMarkers[i] + " ");
        }
    }
}