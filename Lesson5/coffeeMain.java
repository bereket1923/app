package POP.Lesson5;

import java.util.Scanner;

public class coffeeMain {
    public static void main(String[] args) {
        //access coffee size
        System.out.println(CoffeeSize.SMALL);
        System.out.println(CoffeeSize.MEDIUM);
        System.out.println(CoffeeSize.LARGE);
        //store variable
        CoffeeSize smallCup = CoffeeSize.SMALL;
        CoffeeSize mediumCup = CoffeeSize.MEDIUM;
        CoffeeSize largeCup = CoffeeSize.LARGE;
        System.out.println(smallCup);
        System.out.println(mediumCup);
        System.out.println(largeCup);
        //read small from the user during run time
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coffee size(small/medium/large): ");
        String coffeeType = sc.next().toUpperCase();
        CoffeeSize coffee  = CoffeeSize.valueOf(coffeeType);
        System.out.println("coffee type is" +coffee);
        switch (coffee) {
            case SMALL:
                System.out.println("Coffee type is small");
                break;
           case MEDIUM:
                    System.out.println("Coffee type is medium");
                    break;
            case LARGE:
                        System.out.println("Coffee type is large");
                        break;
        }
    }
}