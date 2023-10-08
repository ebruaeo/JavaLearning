package Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExercisesWithOmer {
    /* TODO Exercise 1: Simple Math

Write a Java method called "addition" that takes two integers as parameters and returns their sum.
Then, write a main method to test the "addition" method by passing different pairs of integers.
     */
//
    static int addition(int a, int b) {
        int sum = a + b;
        return sum;
//        return a+b;
    }
//
//    public static void main(String[] args) {
//        System.out.println(addition(10,20));
//    }


//    TODO Exercise 2: String Manipulation

    //    Create a method called "reverseString" that takes a String as input and returns the reverse of that String.
    //    Write a main method to test the "reverseString" method by passing various strings.
    static String reverseString(String str) {
        String reversed = "";
        int lastIndex = str.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
//
//    public static void main(String[] args) {
//        System.out.println("reverse of abc: " + reverseString("abc"));
//        System.out.println("reverse of miyav: " + reverseString("miyav"));
//        System.out.println("reverse of muhammed: " + reverseString("muhammed"));
//    }


//    TODO Exercise 3: Array Operations
//    Write a Java method called "findMax" that takes an array of integers as a parameter and returns the maximum value in the array.
//    Then, write another method called "findMin" that finds the minimum value in the same array.
//    Test these methods in the main method with different arrays.

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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

   /* public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {7,6,5,4};
        int[] arr3 = {-2, 5, 3, 5, 9, 12, 78, 14};
        System.out.println("max of " + Arrays.toString(arr1) + ": " + findMax(arr1) );
        System.out.println("max of " + Arrays.toString(arr2) + ": " + findMax(arr2) );
        System.out.println("max of " + Arrays.toString(arr3) + ": " + findMax(arr3) );

        System.out.println("min of " + Arrays.toString(arr1) + ": " + findMin(arr1) );
        System.out.println("min of " + Arrays.toString(arr2) + ": " + findMin(arr2) );
        System.out.println("min of " + Arrays.toString(arr3) + ": " + findMin(arr3) );


        System.out.println("is 5 in " + Arrays.toString(arr1) + ": " + findElement(arr1, 5));
        System.out.println("is -25 in " + Arrays.toString(arr1) + ": " + findElement(arr1, -25));


        int[] people = {1,2,3,4,5,6, 7, 8};
        int person = 5;
        if (findElement(people, person)) {
            System.out.println("Bu kişi listenizde zaten mevcut");
        } else {
            System.out.println("Kişi listeye eklendi");
        }
    }

*/
    // TODO Exercise Int Bir array içinde bir eleman arayan method yaz. Bulursa true, bulamazsa false döndürsün

    static boolean findElement(int[] arr, int e) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                isFound = true;
            }
        }

        return isFound;
    }

    static boolean findElement2(int[] arr, int e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = bay();
        System.out.println(Arrays.toString(nums));

        System.out.println("Aranacak sayı: ");
        int e = scanner.nextInt();
        if (baybay(nums, e)) {
            System.out.println("Bulundu");
        } else {
            System.out.println("Bulunamadı");
        }
    }

    static int[] bay() {
        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }
        return numbers;
    }

    static boolean baybay(int[] nums, int e) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e) {
                return true;
            }
        }
        return false;
    }

    // TODO Rastgele elemanlardan oluşan 100 elemanlı bir int array oluştur


    // TODO Rastgele 100 elemanlı bir array oluştur. Bu arrayi ekrana bastır. Kullanıcıdan int bir sayı al ve bu
    //  sayının bu array içinde olup olmadığını ekrana bastır


}
