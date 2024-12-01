package arrayBegin;

public class Arrayintial {
    public static void main(String[] args) {
        // Array declaration, creation, and initialization (three in one line)
        double[] rainfall = {0.29, -0.70, 0.36, 0.68, -1.61, 0.68, -1.52, 2.18, 1.94, -1.26, 1.94, 1.54};

        // Creating POP.array to store month names
        String[] monthName = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October",
                "November", "December"
        };

        // Check if both arrays have the same length
        if (rainfall.length == monthName.length) {// both have same length row=1 and column =12
            // Loop through and print both rainfall and month name together
            for (int i = 0; i < monthName.length; i++) {
                System.out.println("Month: " + monthName[i] + ", Rainfall: " + rainfall[i]);
            }
        } else {
            System.out.println("Error: The length of the rainfall and month arrays do not match.");
        }
    }
}