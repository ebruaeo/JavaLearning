package Methods;

public class ExerciseSimpleMath {

    //Write a Java method called "addition" that takes two integers as parameters and returns their sum.
    // Then, write a main method to test the "addition" method by passing different pairs of integers.

    static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addition(30, 50));

        int[] intArr = {10, 1, 2, 3, 4, 5, 10};
        System.out.println(sumArray(intArr));

    }

    /* ! Array Sum
        !Write a Java method called "sumArray" that takes an array of integers as a parameter and returns the sum of all elements in the array.
        !Test the "sumArray" method in the main method with different arrays. */

    static int sumArray(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
