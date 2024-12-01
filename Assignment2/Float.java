package POP.Assignment2;

public class Float {
        public static void main(String[] args) {
            //creat a byte variable
            byte b = 120;
            //byte c =128;//error-it exceeds the range for byte
            short S = 32767;
            // short S2 = 32768; //error -it exceed the range for short
            int i = 327676786;
            long number = 123;
            //one more way to store long data type
            long number2 = 123L;
            System.out.println(number2);
            //how to store a float data type
            float costOfPen = 3.45F;//float costOfPen 3.45f;
            //store double value
            double heightOfWall = 10.5678;
            System.out.println(10 / 3); // Prints integer division
            System.out.println((float) 10 / 3); // Prints floating-point division
            int value = (int) 3.5; // Casting double to int, value will be 3
            int x = (int) 2.3;
            System.out.println(x);
        }
    }
