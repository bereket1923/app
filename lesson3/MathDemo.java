package POP.lesson3;

public class MathDemo {
    public static void main(String[] args) {
        // find the square root of a number
        int number = 2;
        double number2 = 3;
       // int SquareRoot = math.sqrt(number); //compile time error
        double SquareRoot = Math.sqrt(number);
        System.out.println("Square Root = " + SquareRoot);
        System.out.println(Math.floor(3.2));//3.0
        System.out.println(Math.ceil(3.2));//4.0
        //find max
        System.out.println(Math.max(number, number2));
        System.out.println(Math.min(number, number2));
        System.out.println(Math.pow(number, number2));
        System.out.println(Math.random());
        System.out.println(Math.exp(number));
        System.out.println(Math.log(number));

    }
}
