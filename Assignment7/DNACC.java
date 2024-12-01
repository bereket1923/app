package POP.Assignment7;
import java.util.Scanner;

public class DNACC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dnaStrand;

        while (true) {
            System.out.print("Enter a DNA strand: ");
            dnaStrand = scanner.nextLine();

            // Exit if the user enters an empty string
            if (dnaStrand.isEmpty()) {
                break;
            }

            String complementStrand = findComplement(dnaStrand);
            System.out.println("Complementary DNA strand: " + complementStrand);
        }
    }

    public static String findComplement(String dna) {
        // Replace nucleotides with their complements
        return dna.replace('A', 't')
                .replace('T', 'a')
                .replace('G', 'c')
                .replace('C', 'g')
                .toUpperCase();  // Convert to uppercase for consistency
    }
}
