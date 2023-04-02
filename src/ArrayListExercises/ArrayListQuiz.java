package ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;
        ArrayList<String> questions = new ArrayList<>(Arrays.asList("4+4= ", "9-5= ", "8/2= ", "3*3= "));

        System.out.println(questions.get(0));
        int answer1 = scanner.nextInt();
        int q1Answer = 4 + 4;
        if (answer1 == q1Answer) {
            correctAnswer++;
        } else {
            System.out.println(questions.get(0));
            answer1 = scanner.nextInt(); // *
            if (answer1 == q1Answer) {
                correctAnswer++;
            }
        }
        System.out.println(questions.get(1));
        int answer2 = scanner.nextInt();
        int q2Answer = 9 - 5;
        if (answer2 == q2Answer) {
            correctAnswer++;
        } else {
            System.out.println(questions.get(1));
            answer2 = scanner.nextInt();
            if (answer2 == q2Answer) {
                correctAnswer++;
            }
        }
        System.out.println(questions.get(2));
        int answer3 = scanner.nextInt();
        int q3Answer = 8 / 2;
        if (answer3 == q3Answer) {
            correctAnswer++;
        } else {
            System.out.println(questions.get(2));
            answer3 = scanner.nextInt();
            if (answer3 == q3Answer) {
                correctAnswer++;
            }
        }
        System.out.println(questions.get(3));
        int answer4 = scanner.nextInt();
        int q4Answer = 3 * 3;
        if (answer4 == q4Answer) {
            correctAnswer++;

        } else {
            System.out.println(questions.get(3));
            answer4 = scanner.nextInt();
            if (answer4 == q4Answer) {
                correctAnswer++;
            }
        }


        System.out.println("Doğru cevap sayınız: " + correctAnswer);
        if ((answer1 != q1Answer)) {
            System.out.println("Toplama sorusu yanlış");
            System.out.println(questions.get(0));
        }
        if ((answer2 != q2Answer)) {
            System.out.println("çıkarma sorusu yanlış");
            System.out.println(questions.get(1));
        }
        if (answer3 != q3Answer) {
            System.out.println("Bölme sorusu yanlış");
            System.out.println(questions.get(2));
        }
        if ((answer4 != q4Answer)) {
            System.out.println("Çarpma sorusu yanlış");
            System.out.println(questions.get(3));
        }


    }
}
