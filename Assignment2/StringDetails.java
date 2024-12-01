package POP.Assignment2;

public class StringDetails {
    public static void main(String[] args) {
        // Create a String object to read input
        String java = "maharishi";
        // get first character
        char first = java.charAt(0);
        //get last character
        char last = java.charAt(java.length()-1);
        System.out.println("first character" +first);
        System.out.println("last character" +last);
    }
}