package Methods;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    /*!Write a Java program that generates a random number between 1 and 100 and asks the user to guess it.
    !Create a method called "checkGuess" that takes the user's guess as input and provides feedback (too high, too low, or correct).
    !Repeat until the user guesses correctly. */

    public static void main(String[] args) {
        Random random=new Random();
        int number= random.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        int guess =0;
        do {
            System.out.println("Guess the number");
            guess=Integer.parseInt(scanner.nextLine());
        } while (!checkGuess(number, guess));
    }

    static boolean checkGuess (int number, int guess) {
        if (number<guess) {
            System.out.println("Too high");
           return false;
        } else if (number>guess) {
            System.out.println("Too low");
            return false;
        } else {
            System.out.println("Correct");
            return true;
        }

    }
}
