package Methods;

    /* ? Write a Java method called "generateFibonacci" that generates and prints the first N numbers in the Fibonacci sequence, where N is a parameter.
    ?The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the two preceding ones.
    ?Test the "generateFibonacci" method in the main method with different values of N.   */

import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        int N = 10; // Change N to the desired number of Fibonacci numbers
        generateFibonacci(N);
    }

    public static void generateFibonacci(int N) {
        if (N <= 0) {
            System.out.println("Wrong parameter.");
//                return;
        } else {
            int[] fib = new int[N]; // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            // 0, 1, 1, 2, 3, 5, 8, 13, 21,
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < N; i++) {
                int n = fib[i - 1] + fib[i - 2];
                fib[i] = n;
            }

            System.out.println(Arrays.toString(fib));

        }


    }
}
