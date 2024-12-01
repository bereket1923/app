package quize;

public class exandim {
    public static void main(String[] args) {
        // Class-level variable declaration
        int i = 10;
        double d = i; // Implicit casting (int to double) or double d=(double)i
        System.out.println(d);//10.00
        double m = 20.5;
        int f = (int) m;
        System.out.print(f);//20//explicit
    }
}
