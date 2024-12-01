package Assignment11;

import java.util.Scanner;

public class BillSplitter {

    // Method to calculate the amount each friend needs to pay
    static double calculateAmountPerFriend(double totalBill, int numberOfFriends) {
        return totalBill / numberOfFriends;
    }

    // Method to display the total bill, number of friends, and amount per friend
    static void displayBillDetails(double totalBill, int numberOfFriends, double amountPerFriend) {
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Number of Friends: " + numberOfFriends);
        System.out.println("Amount each friend needs to pay: $" + amountPerFriend);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect the total bill amount from user
        System.out.println("Enter the total bill amount:");
        double totalBill = sc.nextDouble();

        // Collect the number of friends
        System.out.println("Enter the number of friends:");
        int numberOfFriends = sc.nextInt();

        // Validate input to ensure no division by zero or negative numbers
        if (numberOfFriends <= 0) {
            System.out.println("Number of friends must be greater than 0.");
            return;
        }

        // Call the method to calculate the amount per friend
        double amountPerFriend = calculateAmountPerFriend(totalBill, numberOfFriends);

        // Call the method to display the results
        displayBillDetails(totalBill, numberOfFriends, amountPerFriend);
    }
}