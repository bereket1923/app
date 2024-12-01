package quize;

public class kkk {
    public static void main(String[] args) {
        int numbers1[] = {2, 1, 2, 3, 4};
        int numbers2[] = {2, 2, 0};
        int numbers3[] = {1, 3, 5};

        // Count and print even numbers in each POP.array
        System.out.println("Count of even numbers in numbers1: " + countEvenNumbers(numbers1));
        System.out.println("Count of even numbers in numbers2: " + countEvenNumbers(numbers2));
        System.out.println("Count of even numbers in numbers3: " + countEvenNumbers(numbers3));
    }

    // Method to count even numbers in an POP.array
    public static int countEvenNumbers(int[] nums) {
        int count = 0;

        // Iterate through each element and check if it's even
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}