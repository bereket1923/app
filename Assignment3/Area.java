package POP.Assignment3;

public class Area {
    public static void main(String[] args) {

        // Declare and initialize variables
        int A = 2;
        int B = 3;
        int C = 1;
        double X = 5.8;
        double Y = 4.6;
        double radius = 7.5;

        // The square root of B² + 4AC
        double result1 = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        System.out.println("The square root of B² + 4AC: " + result1);

        // The square root of X + 4Y³
        double result2 = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println("The square root of X + 4y³: " + result2);

        // The cube root of the product of X and Y
        double result3 = Math.cbrt(X * Y);
        System.out.println("The cube root of X * Y: " + result3);

        // The Area of a Triangle
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
    }
}