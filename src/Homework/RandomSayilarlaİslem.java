package Homework;

import java.util.Random;
import java.util.Scanner;

public class RandomSayilarlaİslem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswer = 0;
        //TOPLAMA

        int random_1 = random.nextInt(10);
        int random_2 = random.nextInt(10);
        System.out.println(random_1 + "+" + random_2 + "=");
        double toplama = Double.parseDouble(scanner.nextLine());
        if (toplama == (random_1 + random_2)) {
            correctAnswer++;
        } else {
            System.out.println("yanlış cevap tekrar deneyiniz.");
            System.out.println(random_1 + "+" + random_2 + "=");
            double toplama2 = Double.parseDouble(scanner.nextLine());
            if (toplama2 == (random_1 + random_2)) {
                correctAnswer++;
            }
        }

        //ÇIKARMA

        random_1 = random.nextInt(10); //**
        random_2 = random.nextInt(10); //**
        System.out.println(random_1 + "-" + random_2 + "=");
        double cıkarma = Double.parseDouble(scanner.nextLine());
        if (cıkarma == (random_1 - random_2)) {
            correctAnswer++;
        } else {
            System.out.println("Yanlış cevap tekrar deneyiniz.");
            System.out.println(random_1 + "-" + random_2 + "=");
            cıkarma = Double.parseDouble(scanner.nextLine()); //**
            if (cıkarma == (random_1 - random_2)) {
                correctAnswer++;
            }
        }

        //ÇARPMA
        int random5 = random.nextInt(10);
        int random6 = random.nextInt(10);
        System.out.println(random5 + "*" + random6 + "=");
        double carpma = Double.parseDouble(scanner.nextLine());
        if (carpma == (random5 * random6)) {
            correctAnswer++;
        } else {
            System.out.println("Yanlış yaptınız tekrar deneyiniz.");
            System.out.println(random5 + "*" + random6 + "=");
            double carpma2 = Double.parseDouble(scanner.nextLine());
            if (carpma2 == (random5 * random6)) {
                correctAnswer++;
            }
        }


        System.out.println("Doğru cevap sayınız:" + correctAnswer);


    }
}
