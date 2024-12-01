package POP.lesson7;

public class StringOperator {
    public static void main(String[] args) {

        // diffVariable 1: compareTo()
        String str1 = "apple";
        String str2 = "banana";
        int compareResult = str1.compareTo(str2);
        if (compareResult == 0) {
            System.out.println("Both strings are equal.");
        } else if (compareResult < 0) {
            System.out.println(str1 + " is lexicographically smaller than " + str2);
        } else {
            System.out.println(str1 + " is lexicographically larger than " + str2);
        }

        // diffVariable 2: substring()
        String str3 = "HelloWorld";
        String subStr = str3.substring(1, 4);  // Extracts "ell"
        System.out.println("Substring is: " + subStr);

        // diffVariable 3: trim()
        String str4 = "  Hello World!  ";
        String trimmedStr = str4.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // diffVariable 4: valueOf()
        double number = 123.4565;
        String strNumber = String.valueOf(number);
        System.out.println("String representation of the number: " + strNumber);

        // diffVariable 5: startsWith()
        String str5 = "HelloWorld";
        boolean startsWithHello = str5.startsWith("Hello");
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);

        // diffVariable 6: endsWith()
        boolean endsWithWorld = str5.endsWith("World");
        System.out.println("Does the string end with 'World'? " + endsWithWorld);
    }
}
