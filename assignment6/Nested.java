package POP.assignment6;

public class Nested {
    public static void main(String[] args) {
        int number = 10;

        for (int row = 10; number <= 49; row++) {

            for (int col = 1; col <= row && number <= 49; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(number);
        }
    }
}