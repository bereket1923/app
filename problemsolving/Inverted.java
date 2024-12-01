package problemsolving;

public class Inverted {
    public static void main(String[] args) {
        //1 2 3 4
        //1 2 3
        //1 2
        //1
        //row 1
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        //raw2
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);

        for (int y = 4; y >= 1; y--) {

            for (int x = 1; x <= y; x++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}