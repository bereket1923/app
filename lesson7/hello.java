package POP.lesson7;

public class hello {
    public static void main(String[] args) {
        String data1 =new String("hello");
        String data2 =new String("hello");
        System.out.println(data1 ==data2);//false b/c of different object address
        System.out.println(data1.equals(data2));
        String data3 ="java";
        String data4 ="java";
        System.out.println(data3.equals(data4));
        System.out.println(data3 == data4);//True there is no explicit object and object is
        // created by java run time
        // b/c object is not created by new keyword
    }
}
