package pswritingmethods;

import java.util.Scanner;

public class nameformatter {
    static  String firstNamelastNameFormat(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    static String firstNameLastNameMiddleInitial(String firstName, String lastName, char middleIName){
        return firstName + " " + lastName + " " + middleIName;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first name");
        System.out.println("enter the last name");
        System.out.println("enter the middleIName");
        String firstName =sc.next();//prompt the user to enter the first name
        String lastName =sc.next();
        char middleIName =sc.next().charAt(0);
       //call
        firstNamelastNameFormat(firstName,lastName);
        System.out.println("format 1:"+firstName+" "+lastName);
        firstNameLastNameMiddleInitial(firstName,lastName,middleIName);
        System.out.println("format 2:"+firstName+" "+lastName+" "+middleIName);


    }
}
