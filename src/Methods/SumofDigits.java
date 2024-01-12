package Methods;

import java.util.Scanner;

public class SumofDigits {
    /* ! Write a Java program that takes an integer input from the user and calculates the sum of its digits using a method called "calculateSumOfDigits."
     !Display the result to the user. */


/*      ? Solution 1
        static int calculateSumOfDigits (int number) {
        int sum =0;
        while (number !=0) {
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        return sum; }*/


    static int calculateSumOfDigits (int number) {
        String s =""+number;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum+=s.charAt(i) - 48;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculateSumOfDigits(Integer.parseInt(scanner.nextLine())));
    }





















}
