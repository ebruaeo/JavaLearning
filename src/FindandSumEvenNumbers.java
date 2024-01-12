import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindandSumEvenNumbers {

    /*!Write a Java program that allows the user to input a positive integer N.
    !Create a method called "findEvenNumbers" that generates an array of N random numbers (you can use Math.random() for this) between 1 and 100.
   !Then, use a loop to find and display all the even numbers in the array. Finally, calculate and display the sum of those even numbers.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(4);

        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            int[] randomNumberArray = new int[N];
            for (int i = 0; i < N; i++) {
                randomNumberArray[i] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(randomNumberArray));
            System.out.println(findEvenNumbers(randomNumberArray));
        }

    }

    static int findEvenNumbers(int[] arr) {
        int evenNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                evenNumbers += arr[i];
            }

        }
        return evenNumbers;
    }


}


