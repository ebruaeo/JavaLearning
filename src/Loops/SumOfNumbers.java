package Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*Write a Java program that calculates and displays the sum of all numbers from 1 to N, where N is a user-inputted positive integer.
        Use a loop to iterate through the numbers and accumulate the sum.
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum =0;
        for (int i = 0; i <= N; i++) {
            sum+=i;
        }
        System.out.println(sum);









    }
}
