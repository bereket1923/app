package POP.Assignment5;

import java.util.Scanner;

public class Number {
    public class PowerOfTen {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for a power of 10
            System.out.print("Enter a power of 10 (e.g., 6, 9, 12, etc.): ");
            int power = scanner.nextInt();

            // Determine the corresponding number name
            String numberName;

            switch (power) {
                case 6:
                    numberName = "Million";
                    break;
                case 9:
                    numberName = "Billion";
                    break;
                case 12:
                    numberName = "Trillion";
                    break;
                case 15:
                    numberName = "Quadrillion";
                    break;
                case 18:
                    numberName = "Quintillion";
                    break;
                case 21:
                    numberName = "Sextillion";
                    break;
                case 30:
                    numberName = "Nonillion";
                    break;
                case 100:
                    numberName = "Googol";
                    break;
                default:
                    numberName = null; // For values that do not correspond to any known word
                    break;
            }

            // Display the result
            if (numberName != null) {
                System.out.println("The power of 10^" + power + " is called " + numberName + ".");
            } else {
                System.out.println("There is no corresponding word for the power of 10^" + power + ".");
            }

        }
    }

}
