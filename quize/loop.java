package quize;

public class loop {
    public static void main(String[] args) {
        int number = 10;
//        for(x=1;x<=6;x++){
//            System.out.println(x);
//        while(x<=8){
//            System.out.println(x);
//            x++;
//        }
//        do {
//            System.out.println(x);
//            x++;
//        }while(x<=10);
//
//            }
        for (int i = 1; i <= 10; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
            String news = "Hello World";
            // Convert the sentence to a char POP.array to iterate over it
            System.out.println("Vowels in the sentence:");
            for (int y = 0; y < news.length(); y++) {
                char ch = news.charAt(y);

                // Check if the character is a vowel (both lowercase and uppercase)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.print(ch + " ");
                }

            }
        }
    }
}