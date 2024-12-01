package problemsolving;

import java.util.Scanner;

public class planet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the planet");
        String name = sc.next();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        System.out.println("Enter number");
        int num = sc.nextInt();

        switch (name){
            case "mercury"-> System.out.println(name+ ":is the coolest planet.");
            case "earth"-> System.out.println(num+ ": is the only planet known to support life.");
            default -> System.out.println("Invalid planet name.");
        }
        switch (ch){
        case 'a' -> System.out.println("every body wants to see:");
        case 'b' -> System.out.println(" we are living on it:");
            default -> System.out.println("Invalid character.");
        }
        switch (num){
            case 1 -> System.out.println ("but, only scientist observed");
            case 2 -> System.out.println("every body can see.");
            default -> System.out.println("Invalid number.");
        }
    }
}
