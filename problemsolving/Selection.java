package problemsolving;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an uppercase letter: ");
        char letter = sc.next().charAt(0);
//
//        switch (letter) {
//            case 'A', 'B', 'C' -> System.out.println("The digit 2 corresponds to letter " + letter + " on the phone");
//            case 'D', 'E', 'F' -> System.out.println("The digit 3 corresponds to letter " + letter + " on the phone");
//            case 'G', 'H', 'I' -> System.out.println("The digit 4 corresponds to letter " + letter + " on the phone");
//            case 'J', 'K', 'L' -> System.out.println("The digit 5 corresponds to letter " + letter + " on the phone");
//            case 'M', 'N', 'O' -> System.out.println("The digit 6 corresponds to letter " + letter + " on the phone");
//            case 'P', 'Q', 'R', 'S' -> System.out.println("The digit 7 corresponds to letter " + letter + " on the phone");
//            case 'T', 'U', 'V' -> System.out.println("The digit 8 corresponds to letter " + letter + " on the phone");
//            case 'W', 'X', 'Y', 'Z' -> System.out.println("The digit 9 corresponds to letter " + letter + " on the phone");
//            default -> System.out.println("Invalid input! Please enter an uppercase letter.");
//        }
//    }
//}
//        if (letter == 'A' || letter == 'B' || letter == 'C') {
//            System.out.println("You have entered:" + letter);
//        } else if (letter == 'D' || letter == 'E' || letter == 'F') {
//            System.out.println("You have entered:" + letter);
//        } else if (letter == 'G' || letter == 'H' || letter == 'I') {
//            System.out.println("You have entered: " + letter);
//            //.....
//            //.....
//        } else {
//            System.out.println("there is no digit corresponds to:" + letter);
//        }
//    }
//}
//another way, function of beak implement this step coming out from switch case
        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("The digit 2 corresponds to letter " + letter + " on the phone");
                //break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("The digit 3 corresponds to letter " + letter + " on the phone");
                break;
            case 'G':
            case 'H':
            case 'I':
                System.out.println("The digit 4 corresponds to letter " + letter + " on the phone");
                break;
            default:
                System.out.println("Invalid input! Please enter an uppercase letter.");

        }
    }
}