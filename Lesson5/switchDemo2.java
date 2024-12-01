package POP.Lesson5;

import java.util.Scanner;

public class switchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter number: ");
        number1 = sc.nextInt();
        System.out.println("Enter number: ");
        number2 = sc.nextInt();
        System.out.println(
                "select an operation :\n"
                        + "1. subtraction (-)\n"
                        + "2. multiplication (*)\n"
                        + "3. division (/)\n"
                        + "4.addition (+)\n"
                        + "5.modulus (%)\n"

        );
        System.out.println("enter your choice: +, /, %, - or * ");
        //read + , -, % or *
        char choice = sc.next().charAt(0); // Read the operation symbol
        if (choice == '+') {
        } else if (choice == '-') {
        } else if (choice == '*') {
        } else if (choice == '/') {
        } else if (choice == '%') {

            //old java verision option 1
            switch (choice) {
                case '+':
                    System.out.println(number1 + number2);
                    break;
                case '-':
                    System.out.println(number1 - number2);
                    break;
                case '*':
                    System.out.println(number1 * number2);
                    break;
                case '/':
                    System.out.println(number1 / number2);
                    break;
                case '%':
                    System.out.println(number1 % number2);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            //jdk 14 17 23/new version (option 2)
            int result = switch (choice) {
                case '+' -> number1 + number2;
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                case '/' -> number1 / number2;
                case '%' -> number1 % number2;
                default -> {
                    System.out.println("Invalid choice");
                    yield 0;
                }
            };
            System.out.println(result);
        }

    }

}

