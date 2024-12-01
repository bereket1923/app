package POP.lesson3;

/**
 * This class represents a basic coffee sales system.
 * It calculates the total price of the coffee.
 */
public class Documentation {

    // Instance variables for price per pound and bag weight (for demonstration)
    private static final double PRICE_PER_POUND = 5.99;
    private final double weight;  // Marked as final to prevent reassignment

    // Constructor to initialize the coffee bag's weight
    public Documentation(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates the total price of the coffee based on weight.
     *
     * @return the total price of the coffee.
     */
    public double calculateTotalPrice() {
        return weight * PRICE_PER_POUND;
    }

    /*
     * This is a regular multi-line comment.
     * It explains some internal details of the class, and it's ignored by the compiler.
     */

    // This is a single-line comment for brief explanations

    public static void main(String[] args) {
        // Creating a CoffeeBag object with a weight of 2 pounds
        Documentation coffeeBag = new Documentation(2);

        // Calculate and print the total price of the coffee
        System.out.println("Total Price: $" + coffeeBag.calculateTotalPrice());
    }
}