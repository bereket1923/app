package problemsolving;

public class iteration {
    public static void main(String[] args) {
        //number of iteration
        int number = 2;
        boolean done = false;
        while (!done) {
            number = number * 2;
            if (number > 64)
                done = true;
        }
    }
}
//solution
//Let's trace the iterations:
//
//Iteration 1: number = 2 * 2 = 4 (not greater than 64, continue)
//Iteration 2: number = 4 * 2 = 8 (not greater than 64, continue)
//Iteration 3: number = 8 * 2 = 16 (not greater than 64, continue)
//Iteration 4: number = 16 * 2 = 32 (not greater than 64, continue)
//Iteration 5: number = 32 * 2 = 64 (not greater than 64, continue)
//Iteration 6: number = 64 * 2 = 128 (greater than 64, exit loop)
