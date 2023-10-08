package Methods;

public class ExerciseArraysOperations {
//Write a Java method called "findMax" that takes an array of integers as a parameter and returns the maximum value in the array.
// Then, write another method called "findMin" that finds the minimum value in the same array.
// Test these methods in the main method with different arrays.


    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4}));
        System.out.println(findMin(new int[]{1, 2, 3, 4}));
    }


}
