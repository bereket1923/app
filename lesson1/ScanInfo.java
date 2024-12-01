package POP.lesson1;
import java.util.Scanner;
//purpose of using scanner is to read data during run time
public class ScanInfo {
    int ageOfStudent;
    String firstName;
    double score;
    float weight;
    String quote;
//creating constructor and this.variable name is important
// to differentiate local variable with field variable if the name is same

    public ScanInfo(int ageOfStudent, String firstName, double score, float weight, String quote) {
        this.ageOfStudent = ageOfStudent;
        this.firstName = firstName;
        this.score = score;
        this.weight = weight;
        this.quote = quote;
    }
    public static void main(String[] args) {
        //creat object and Set up to read input
        Scanner sc = new Scanner(System.in);
        // instruction to the program to print the message to the console
        System.out.println("Enter age of student: ");
        System.out.println("Enter first name:");
        System.out.println("enter your score");
        System.out.println("enter your weight");
        System.out.println("enter a quote");
        // read input from the user
        int ageOfStudent = sc.nextInt();
        String firstName = sc.next();
        double score = sc.nextDouble();
        float weight = sc.nextFloat();
        String quote = sc.next();
        //display out put
        System.out.println("your first name is: " + firstName);
        System.out.println("your score is " + score);
        System.out.println("your weight is " + weight);
        System.out.println("your quote is " + quote);
        System.out.println("your age is: "+ ageOfStudent);


    }
}
