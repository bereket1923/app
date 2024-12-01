package POP.lesson3;

public class CharData {
    public static void main(String[] args) {
        char gender = 'M'; // Initialize gender with a value to avoid the compilation error
        System.out.println("Gender: " + gender);

        boolean bereket = true; // Declare and initialize 'active'
        if (bereket) {
            gender = 'M'; // This will only execute if 'bereket' is true
        } else {
            gender = 'F';
        }
    }
}

