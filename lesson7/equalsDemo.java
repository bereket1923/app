package POP.lesson7;

public class equalsDemo {
    public static void main(String[] args) {
        String day1 = "thursday";
        String day2 = "thursday";
        //check both are equal
        if (day1.equals(day2)) {
        System.out.println("both are equal");
    }else {
        System.out.println("both are not equal");
    }
        String day3 =new String("friday");
        if(day2.equals(day3))
        {
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }
        String day4= new String("thursday");
        if (day1.equals(day4)) {
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }
      //  System.out.println(int)'T');
    }

}
