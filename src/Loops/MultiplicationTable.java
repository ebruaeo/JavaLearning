package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    /*Create a program that generates a multiplication table for a user-inputted number N.
     Display the multiplication table from 1 to 10 for that number using a loop.
     */
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int N=scanner.nextInt();
        for (int i = 0; i <=10; i++) {
            System.out.println(N+"*"+i+"="+N*i);
        }

    }


}
