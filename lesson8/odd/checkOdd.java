package lesson8.odd;

public class checkOdd {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 5};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]+ ":is odd");
            }else{
                System.out.println(num[i]+ ":is even");
            }
        }
    }
}
