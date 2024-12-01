package POP.Lesson5;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("inter number2");
        int num2 = sc.nextInt();
        System.out.println(
                "1. Addition\n +"
                + "2. Subtraction\n "
                + "3. Multiplication\n "
        );
        //else if choice
        System.out.println("Enter choice (say 1 or 2 or 3: ");
       int choice = sc.nextInt();
       if (choice == 1) {
            System.out.println(num+ " + " +num2+ "=" +(num + num2));
        }else if(choice == 2) {
           System.out.println(num + "-" +num2+ "="  +(num - num2));
       } else if (choice == 3) {
            System.out.println(num + "*" +num2+ "=" +(num * num2));


        }
     //second option (switch case)
       switch (choice){
            case 1:
               System.out.println(num+ " + " +num2+ "=" +(num + num2));
                break;
                case 2:
                    System.out.println(num + "-" +num2+ "=" +(num - num2));
                    break;
                    case 3:
                        System.out.println(num + "*" +num2+ "=" +(num * num2));
                        break;
                       default:
                           System.out.println("Invalid choice");

        }
    }


    }