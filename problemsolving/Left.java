package problemsolving;

public class Left {

    public static void main(String[] args) {
        int x =1;
        int i =1;

        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //for raw1

//        for ( x = 1; x <= 1; x++) {
//            System.out.print(x);
//            System.out.println();
//        }
//        //raw2
//        System.out.print(1);
//        System.out.print(2);
//        for (x = 1; x <= 2; x++) {
//            System.out.print(x);
//            System.out.println();
//        }
//        //raw3
//        System.out.print(1);
//        System.out.print(2);
//        System.out.print(3);
//        for (x = 1; x <= 3; x++) {
//            System.out.print(x);
//            System.out.println();
//        }
//        //raw4
//        System.out.print(1);
//        System.out.print(2);
//        System.out.print(3);
//        System.out.print(4);
//        for (x = 1; x <= 4; x++) {
//            System.out.print(x);
//            System.out.println();
//        }
        //summery
        // Outer loop controls the rows (1 to 4)
        for (i= 1; i <= 4; i++) {//Inner loop prints numbers in each row (from 1 to i)
            for (x = 1; x <= i; x++) {
                System.out.print(x + " ");  // Print the numbers on the same line
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}