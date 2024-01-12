package Loops;

import java.util.Scanner;

public class FactorialCalculator {

  /*?  Write a Java program that calculates the factorial of a user-inputted positive integer.
       ?Use a loop to perform the calculation. Display the result.  */
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n = scanner.nextInt();
      int fact=1;
      for (int i = 1; i <= n; i++) {
          fact*=i;

      }          System.out.println(fact);
  }

















}
