package lesson8.odd;

public class oddWithArraySize {
    public static void main(String[] args) {
        int oddNums[] = new int[5];
        int evenNums[] = new int[5];

        // Populate the POP.array with odd numbers and print them directly
        for (int i = 0, oddNumber = 1; i < oddNums.length; i++, oddNumber += 2) {
            oddNums[i] = oddNumber;
            System.out.println(oddNums[i] + ": is odd");
        }
        for(int i=0, evenNumber =2; i<evenNums.length; i++, evenNumber +=2){
            evenNums[i] = evenNumber;
            System.out.println(evenNums[i]+ ": is even");
        }
    }
}