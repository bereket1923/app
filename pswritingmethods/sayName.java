package pswritingmethods;

public class sayName {

    private static String LastName;

    // Method to print name
    static void sayName() {
        System.out.println("My firstName is Bereket");
        System.out.println("My middle name is Fekadie");
        System.out.println("My lastName is Dress");
        // Removed recursive call to prevent infinite recursion
    }
    static void addNumber(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    static int getsubstraction(int a, int b) {// return sub to its caller, the caller is main method
       int sub= a-b;
       return sub;
    }
    static void sayFNameLastName(String firstName,String lastName) {//parameters are firstName and lastName
        System.out.println("my first name is:"+ firstName);
        System.out.println("my last name is:"+ lastName);
    }

    public static void main(String[] args) {
        int y = 10;
        int x = 5;
        addNumber(y, x);
        int result = getsubstraction(x, y);
        System.out.println("the subtraction of" +x+ "and" +y+ "is" +result);
        System.out.println("the subtraction of" +x+ "and" +y+ "is"+getsubstraction(x, y));
        System.out.println("the subtraction of" +x+ "and" +y+ "is" +getsubstraction(20, 4));

        // use or call the method, sayName
        sayName();
        //once crate methods we can do a lot of tasks, but the same variable type
        // passing two argument(input) ,bereket and dress
        sayFNameLastName("Bereket", "Dress");
        sayFNameLastName("abebe", "Belay");
        sayFNameLastName("Dawit", "Ayalew");
//        //addition
//        int sum=y+x;
//        System.out.println("sum="+sum);
//        //division
//        int remainder = x/y;
//        System.out.println("remainder="+remainder);
//        //subtraction
//        int subtract = x-y;
//        System.out.println("subtract="+subtract);
//        //multiplication
//        int multiply = x*y;
//        System.out.println("multiply="+multiply);
    }
}