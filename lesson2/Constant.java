package POP.lesson2;

public class Constant {
    // Constant declarations
    public static final int max = 100;
    public static final double PI = 3.14159;
    public static final String Ap = "MyApplication";

    public static void main(String[] args) {
        // Outputting constants
        System.out.println("Max Users: " + max);
        System.out.println("Value of PI: " + PI);
        System.out.println("Application Name: " + Ap);
        System.out.println(max + PI);
        System.out.println(Ap + max);

        // String concatenation examples
        System.out.println(1 + 2 + " test");
        System.out.println("test" + 1 + 2);
        System.out.println("test" + 2 + 2 + "test");
    }
}