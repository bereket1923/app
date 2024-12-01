package problemsolving;

import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit (0-9) and corresponding dots is displayed: ");
       int digit = sc.nextInt();
        switch (digit) {
            case 0-> System.out.println("0=no dot");
            case 1->System.out.println("1=.");
            case 2->System.out.println("2=..");
            case 3->System.out.println("3=...");
            case 4->System.out.println("4=....");
            case 5->System.out.println("5=.....");
            case 6->System.out.println("6=......");
            default -> System.out.println("Invalid digit");
        }
    }
}
