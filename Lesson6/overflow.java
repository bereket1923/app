package POP.Lesson6;

public class overflow {
    public static void main(String[] args) {
        byte number = (byte)129;//-128 to 127
        System.out.println(number);
        int count = 0;
        while (count < 200) {
            number +=1;
            count++;
            System.out.print(number + " ");
        }

    }
}
