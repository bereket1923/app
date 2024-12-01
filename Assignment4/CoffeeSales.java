package POP.Assignment4;
import java.text.DecimalFormat;

class CoffeeBag {
    // Class constants for price per pound and tax rate
    public static final double PRICE_PER_POUND = 5.99;
    public static final double TAX_RATE = 0.0725;  // 7.25%

    // Instance variables for bag weight and number of bags, marked as final
    private final double bagWeight;
    private final int numberOfBags;

    // Constructor to initialize bag weight and number of bags
    public CoffeeBag(double bagWeight, int numberOfBags) {
        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
    }

    // Method to calculate total price before tax
    public double calculateTotalPrice() {
        return bagWeight * numberOfBags * PRICE_PER_POUND;
    }

    // Method to calculate total price with tax
    public double calculateTotalPriceWithTax() {
        double totalPrice = calculateTotalPrice();
        return totalPrice + totalPrice * TAX_RATE;
    }
}

public class CoffeeSales {
    public static void main(String[] args) {
        // Input: weight of each bag and number of bags sold
        double bagWeight = 5;  // in pounds
        int numberOfBags = 32;

        // Create a CoffeeBag object
        CoffeeBag sale = new CoffeeBag(bagWeight, numberOfBags);

        // Calculate total price and total price with tax
        double totalPriceWithTax = sale.calculateTotalPriceWithTax();

        // Format the total price to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        // Output the result in the specified format
        System.out.println("POP.Assignment5.Number of bags sold: " + numberOfBags);
        System.out.println("Weight per bag: " + bagWeight + " lb");
        System.out.println("Price per pound: $" + CoffeeBag.PRICE_PER_POUND);
        System.out.println("Sales tax: 7.25%");
        System.out.println("Total price: $" + df.format(totalPriceWithTax));
    }
}