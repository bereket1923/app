package problemsolving;

public class nested {
    public static void main(String[] args) {
        double height = 70.5;   // diffVariable: Height of the person (in cm or other unit)
        double minHeight = 160.0; // diffVariable: Minimum required height
        double weight = 65.0;    // diffVariable: Weight of the person (in kg or other unit)
        double minWeight = 55.0;  // diffVariable: Minimum required weight
        if (height >= minHeight) {
            if (weight >= minWeight) {
                System.out.println("Eligible to serve.");

            } else {
                System.out.println("Too light to serve.");
            }
        } else {
            if (weight >= minWeight) {
                System.out.print("Too short to serve.");
            } else {
                System.out.print("Too short and too light to serve or not eligible to serve.");
            }

        }

    }
}