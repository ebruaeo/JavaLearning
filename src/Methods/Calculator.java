package Methods;

import java.util.Scanner;

public class Calculator {
    /* ? Write a Java program that includes methods for addition, subtraction, multiplication, and division.
    ? Prompt the user to enter two numbers and an operator (+, -, *, or /).
    ?Then, call the appropriate method based on the operator and display the result. */

    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double n1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a number");
        double n2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter an operator");
        String s = scanner.nextLine();
        String operators = "/*-+";
        if (operators.contains(s)) {
            if (s.equals("+")) {
                System.out.println(addition(n1, n2));
            } else if (s.equals("-")) {
                System.out.println(subtraction(n1, n2));
            } else if (s.equals("/")) {
                System.out.println(division(n1, n2));
            } else if (s.equals("*")) {
                System.out.println(multiplication(n1, n2));
            }
        } else {
            System.out.println("Please enter a correct operator");

        }

       /*
        ? Diğer çözüm

       if (!s.equals("+") && !s.equals("-") && !s.equals("/") && !s.equals("*")) {
            System.out.println("Please enter a correct operator");
        }

        if (s.equals("+")) {
            System.out.println(addition(n1, n2));
        } else if (s.equals("-")) {
            System.out.println(subtraction(n1, n2));
        } else if (s.equals("/")) {
            System.out.println(division(n1, n2));
        } else if (s.equals("*")) {
            System.out.println(multiplication(n1, n2));
        } */


    }
}
