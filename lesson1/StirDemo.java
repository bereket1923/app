package POP.lesson1;

public class StirDemo {
    public static void main(String[] args) {
        // Create a string object
        String courseName; // declare object name
        courseName = new String("procedural programming");
        System.out.println(courseName);
        // Extract "gram" from courseName
        System.out.println(courseName.substring(10, 15));

        // Store the extracted data in a variable
        String extractedData = courseName.substring(10, 15);
        System.out.println(extractedData);

        // Another example with the string "Computer Science Computes"
        String data = "Computer Science Computes";

        // Find the starting position of the first occurrence of the substring "put"
        System.out.println(data.indexOf("put")); // Outputs: 3

    }
}