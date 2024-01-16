import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {
    /*!Write a Java program that allows the user to input the number of students and their scores for a test.
    !Create a method called "calculateAverage" that takes an array of scores and calculates the average score.
    !Then, use a loop to collect and store scores for each student, calculate the average score, and determine the grade for each student based on the following criteria:
      !A: 90 and above
      !B: 80 to 89
      !C: 70 to 79
      !F: below 60
    !Finally, display the average score and the grades for each student. */

    public static void main(String[] args) {
        int[] studentScoreArray = {10, 45, 76, 89, 90, 36};
        System.out.println("Sınav Ortalaması:" + calculateAverage(studentScoreArray));
        printLetters(studentScoreArray);
    }

    static void printLetters (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=90) {
                System.out.println("Harf notunuz A.");
            } else if (arr[i]>=80&&arr[i]<=89) {
                System.out.println("Harf notunuz B.");
            } else if (arr[i]>=70&&arr[i]<=79) {
                System.out.println("Harf notunuz C.");
            } else {
                System.out.println("Harf notunuz F.");
            }
        }

    }


    static double calculateAverage(int[] studentScoreArray) {
        double sumScore = 0;
        for (int i = 0; i < studentScoreArray.length; i++) {
            sumScore += studentScoreArray[i];
        }
        return sumScore / studentScoreArray.length;

    }


}
