package Assignment12;

import java.util.Scanner;

public class Bill {
    // Constants for discount and tax rates
    final static double DISCOUNT_RATE = 0.1;
    final static double TAX_RATE = 0.07;

    // Method to get the total price of all items
    static double getTotalPrice(double[] costOfAllItems) {
        double totalPrice = 0;
        for (int i = 0; i < costOfAllItems.length; i++) {
            totalPrice += costOfAllItems[i];
        }
        return totalPrice;
    }

    // Method to apply discount based on total price
    static double applyDiscount(double totalPrice) {
        double appliedDiscount = 0;
        if (totalPrice > 100) {
            appliedDiscount = totalPrice * DISCOUNT_RATE;
        }
        return appliedDiscount;
    }

    // Method to calculate tax (7% of discounted amount)
    static double calculateTax(double totalPrice, double appliedDiscount) {
        double tax = (totalPrice - appliedDiscount) * TAX_RATE;
        return tax;
    }

    // Method to calculate the final amount to be paid
    static double calculateFinalAmount(double totalPrice, double appliedDiscount, double tax) {
        double finalCost = totalPrice - appliedDiscount + tax;
        return finalCost;
    }

    // Main method: Handling user input and output display
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of items from the user
        System.out.println("Enter the number of items: ");
        int numberOfItems = sc.nextInt();

        // Create an POP.array to store the cost of each item
        double[] costOfAllItems = new double[numberOfItems];

        // Collect the cost of each item from the user
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter the cost of item " + (i + 1) + ":");
            costOfAllItems[i] = sc.nextDouble();
        }

        //calling methods//if the main method is void the left side is not assigned
        double totalPrice = getTotalPrice(costOfAllItems);

        double appliedDiscount = applyDiscount(totalPrice);

        double tax = calculateTax(totalPrice, appliedDiscount);

        double finalAmount = calculateFinalAmount(totalPrice, appliedDiscount, tax);


        // Display the total, discount, tax, and final amount
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Applied: $" + appliedDiscount);
        System.out.println("Tax: $" + tax);
        System.out.println("Final Amount to be Paid: $" + finalAmount);
    }
}