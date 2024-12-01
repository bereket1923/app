package selection;

import java.util.Scanner;

class AlphabetPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = sc.next().charAt(0);
        switch (letter){
            case 'a', 'b','c','d','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'-> System.out.println("the letter is:"+letter);
            default -> System.out.println("Invalid character.");
        }
    }
}