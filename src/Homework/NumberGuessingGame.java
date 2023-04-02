package Homework;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        /*
        1-20 arasında sayı üret
        Kullanıcının bu sayıyı tahmin edebilmesi için bir program yaz. Kullanıcının 3 tahmin hakkı olcak.
        Eğer kullanıcının tahmini daha düşükse "Bilemediniz, daha büyük bir sayı deneyin.
        Kalan tahmin ..." şeklinde yazdırıp kalan tahmin sayısını da yazdır.
        Eğer kullanıcının tahmini daha büyükse "Bilemediniz, daha küçük bir sayı deneyin.
        Kalan tahmin ..." şeklinde yazdırıp kalan tahmin sayısını da yazdır.
        Eğer kullanıcı sayıyı bulursa "Tahmin doğru. Tebrikler! ... denemede sonuca ulaştınız" şeklinde yazdır ve program sonlansın.
        Eğer 3 tahmin sonunda kullanıcı bilemezse "Tahmin hakkınız doldu. Bilemediniz. Bulmanız gereken sayı <Sayı> idi." şeklinde ekrana yazdır.
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guessing = 2;

        int mainNumber = random.nextInt(19);
        System.out.println(mainNumber);
        System.out.println("Sayı tahmini: ");
        int userGuess1 = scanner.nextInt();

        if (userGuess1 == mainNumber) {
            System.out.println("Tahmin doğru, tebrikler.");
        } else if (userGuess1 < mainNumber) {
            guessing--;
            System.out.println("Bilemediniz, daha büyük bir sayı deneyin.");
            System.out.println("Kalan tahmin: " + guessing);
            System.out.println("Sayı tahmini: ");
            userGuess1 = scanner.nextInt();
            if (userGuess1 > mainNumber) {
                System.out.println("Tahmin hakkınız doldu. Bilemediniz. Bulmanız gereken sayı " + mainNumber + "idi.");
            } else if (userGuess1 < mainNumber) {
                System.out.println("Tahmin hakkınız doldu. Bilemediniz. Bulmanız gereken sayı " + mainNumber + " idi.");
            } else {
                System.out.println("Tebrikler, doğru bildiniz.");
            }
        } else if (userGuess1 > mainNumber) {
            guessing--;
            System.out.println("Bilemediniz, daha küçük bir sayı deneyin.");
            System.out.println("Kalan tahmin: " + guessing);
            System.out.println("Sayı tahmini: ");
            userGuess1 = scanner.nextInt();
            if (userGuess1 > mainNumber) {
                System.out.println("Tahmin hakkınız doldu. Bilemediniz. Bulmanız gereken sayı " + mainNumber + "idi.");
            } else if (userGuess1 < mainNumber) {
                System.out.println("Tahmin hakkınız doldu. Bilemediniz. Bulmanız gereken sayı " + mainNumber + " idi.");
            } else {
                System.out.println("Tebrikler, doğru bildiniz.");
            }
        }

        guessing = 3;
        mainNumber = random.nextInt(21);
        System.out.println(mainNumber);
        System.out.println("Sayı tahmini: ");
        userGuess1 = scanner.nextInt();
        boolean isFinished = false;

        if (userGuess1 == mainNumber) {
            isFinished = true;
            System.out.println("Doğru. Oyun bitti");
        } else if (userGuess1 < mainNumber) {
            guessing--;
            System.out.println("Daha büyük dene. kalan: " + guessing);
        } else {
            guessing--;
            System.out.println("Daha küçük dene. kalan: " + guessing);
        }

        if (!isFinished) {
            System.out.println("Sayı tahmini: ");
            userGuess1 = scanner.nextInt();
            if (userGuess1 == mainNumber) {
                isFinished = true;
                System.out.println("Doğru. Oyun bitti");
            } else if (userGuess1 < mainNumber) {
                guessing--;
                System.out.println("Daha büyük dene. kalan: " + guessing);
            } else {
                guessing--;
                System.out.println("Daha küçük dene. kalan: " + guessing);
            }
        }

        if (!isFinished) {
            System.out.println("Sayı tahmini: ");
            userGuess1 = scanner.nextInt();
            if (userGuess1 == mainNumber) {
                isFinished = true;
                System.out.println("Doğru. Oyun bitti");
            } else if (userGuess1 < mainNumber) {
                guessing--;
                // System.out.println("Daha büyük dene. kalan: " + guessing);
                System.out.println("Bilemediniz. Bilmeniz gereken sayı " + mainNumber + " idi");
                isFinished = true;

            } else {
                guessing--;
                //  System.out.println("Daha küçük dene. kalan: " + guessing);
                System.out.println("Bilemediniz. Bilmeniz gereken sayı " + mainNumber + " idi");
                isFinished = true;

            }
        }

//        if (guessing == 0) {
//            System.out.println("Bilemediniz. Bilmeniz gereken sayı " + mainNumber + " idi");
//        }

//        boolean isFinished = false;
//        System.out.println(isFinished == false);
//        System.out.println(!isFinished);
//
//
//        if (isFinished == false) {
//            System.out.println("ğam");
//        }
//        if (!isFinished) {
//            System.out.println("ğam2");
//        }

        int dummy = 5;
        if (userGuess1 == mainNumber) {
            isFinished = true;
            System.out.println("Doğru. Oyun bitti");
            dummy = 0;
        } else if (userGuess1 < mainNumber) {
            guessing--;
            // System.out.println("Daha büyük dene. kalan: " + guessing);
            System.out.println("Bilemediniz. Bilmeniz gereken sayı " + mainNumber + " idi");
            isFinished = true;
            dummy = 0;
        } else {
            guessing--;
            //  System.out.println("Daha küçük dene. kalan: " + guessing);
            System.out.println("Bilemediniz. Bilmeniz gereken sayı " + mainNumber + " idi");
            isFinished = true;
            dummy = 0;
        }
        //dummy = 0;
    }


}

