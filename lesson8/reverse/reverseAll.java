package lesson8.reverse;

public class reverseAll {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5} ;
        // Loop 1: Swapping elements to reverse the POP.array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        // Loop 2: Printing the reversed POP.array
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
