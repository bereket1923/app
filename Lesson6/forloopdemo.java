package POP.Lesson6;

public class forloopdemo {
    public static void main(String[] args) {
        //print value from 1 to 30
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i+"");
        for (int k = 10; k <= 20; k++) {
            System.out.println(k + "");
            k++;

            //second option
            //for (int i =1; i<=i+10;i++){
            //    System.out.println(i+"");
            //divisor
            for (int x = 1; x <= 10; x++) {
                if (10 % x == 0) {
                    System.out.println(x);

                }
//read character from a string
                String quote = "pride goes before fall";
                char ch;
                int count = 0;
                //first step
                ch = quote.charAt(0);
                System.out.println(ch);
                //second step
                ch = quote.charAt(1);
                System.out.println(ch);
                //third step
                ch = quote.charAt(2);
                System.out.println(ch);
            }
            //star print *****

            for (int x = 0; x < 5; x++) {
                int count = 0;
            }
            System.out.println("*");
            System.out.println();
            for (int x = 0; x < 5; x++) {
                System.out.println("*");
                System.out.println();
                // for (int x=0; x<5; x++){
                System.out.println("*");
                System.out.println();
                // for (int x=0; x<5; x++){
                System.out.println("*");
                System.out.println();
                // for (int x=0; x<5; x++){
                System.out.println("*");
                System.out.println();
            }
//short option
            for (int x = 1, count = 0; count < 5; x++) {
                count++;
                System.out.println(x);
            }
            //cell
            System.out.println(19 * 5 * 11 + "");
            //second cell
            System.out.println(19 * 10 * 11 + "");
            //third cell
            System.out.println(19 * 15 * 11 + "");
            //total
            for (int x = 5; x < +25; x = x + 5) {
                System.out.println(19 * x * 11 + "");
            }

        }

    }
//         }
//
//        }
}