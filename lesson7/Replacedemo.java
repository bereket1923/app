package POP.lesson7;

public class Replacedemo {
   public static void main(String[] args) {
       String proverb = "pride goes before fall";
      // System.out.println(args[0]);
      // System.out.println(args[0]);

       //replace all vowel
       System.out.println(
  proverb.replaceAll( "[aeiou]",  "*")//proverb.replaceAll("[aeiou]", "*")
       ) ;
       System.out.println(
  proverb.replaceAll( "[^ aeiou]",  "*")
       ) ;
   }
}
