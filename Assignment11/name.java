package Assignment11;

import java.util.Scanner;

public class name {
    static void firstNameLastName (String firstName, String lastName) {

    }
     static void firstNameLastNameMiddleInitial (String firstName, String lastName, char middleInitial) {

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstName");
        String firstName = sc.next();
        System.out.println("Enter your lastName");
        String lastName = sc.next();
        System.out.println("Enter your middleNameInitial");
        char middleNameInitial = sc.next().charAt(0);
        //calling
        firstNameLastName(firstName, lastName);
        System.out.println("format 1:" +firstName + " " + lastName);
        firstNameLastNameMiddleInitial(firstName, lastName, middleNameInitial);
        System.out.println("format 2:" +firstName + "," + lastName+ "," + middleNameInitial+".");
      

    }
}
