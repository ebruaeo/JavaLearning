package DöngülerExercises;

import java.util.Scanner;

public class SequenceOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;

        while (sum <100 ) {
            int value = scanner.nextInt();
            sum += value;
        }
        System.out.println("done");
    }
}