package POP.lesson7;

public class regularExpression {
    public static void main(String[] args) {
        String name = "Bereket Dress Fekadie";

        // Check pattern: First letter uppercase, followed by lowercase letters,
        // space, then another word
        System.out.println(name.matches("[A-Z][a-z]+ [A-Z][a-z]+( [A-Z][a-z]*)+"));
        //star value that much? so use ( followed by space or \\s for space
        // return true and there is a space next to parenthesis

        // Check if all characters are lowercase (which is not true for "Bereket Dress")
        System.out.println(name.matches("[a-z]*"));  // Expected to return false

        // Check if both first name and last name follow the pattern of
        // starting with an uppercase letter
        System.out.println(name.matches("[A-Z][a-z]+\\s[A-Z][a-z]+"));  // Expected to return true
    }
}