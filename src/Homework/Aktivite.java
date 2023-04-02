package Homework;

import java.util.Scanner;

public class Aktivite {
    public static void main(String[] args) {
        //4 soruluk quiz +
        //- 4 tane 4 işlem sorusu yaz++++++
        //- sırayla kullanıcıya soruları sor ve cevaplarını al+++++
        //- doğru cevap sayısını tut ve en sonda ekrana yazdır.++++++
        //- Ek-1: yanlış yapılan soruları en sonra yanlış yapılan sorular şeklinde ekrana bastır ++++++
        //- Ek-2: cevap yanlış olursa 1 hak daha ver yine yanlış olursa sonraki soruya geç
        //- ipucu: önce 2 soruluk yap sonra 4 soruya çıkart
        //Ek-1 ve Ek-2'yi diğerlerini yaptıktan sonra yap.

        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;
        // toplama
        System.out.println("4+4= ");
        double toplama = Double.parseDouble(scanner.nextLine());
        if (toplama == 8) {
            correctAnswer++;
        } else {
            System.out.println("4+4= ");
            toplama = Double.parseDouble(scanner.nextLine());
            if (toplama == 8) {
                correctAnswer++;
            }
        }
        // çıkarma
        System.out.println("8-4= ");
        double cikarma = Double.parseDouble(scanner.nextLine());
        if (cikarma == 4) {
            correctAnswer++;
        } else {
            System.out.println("8-4= ");
            cikarma = Double.parseDouble(scanner.nextLine());
            if (cikarma == 4) {
                correctAnswer++;
            }
        }
        //çarpma
        System.out.println("4*4= ");
        double carpım = Double.parseDouble(scanner.nextLine());
        if (carpım == 16) {
            correctAnswer++;
        } else {
            System.out.println("4*4= ");
            carpım = Double.parseDouble(scanner.nextLine());
            if (carpım == 16) {
                correctAnswer++;
            }
        }
        //bölme
        System.out.println("8/2= ");
        double bolum = Double.parseDouble(scanner.nextLine());
        if (bolum == 4) {
            correctAnswer++;
        } else {
            System.out.println("8/2= ");
            bolum = Double.parseDouble(scanner.nextLine());
            if (bolum == 4) {
                correctAnswer++;
            }
        }
        System.out.println("Doğru cevap sayınız: " + correctAnswer);
        if (toplama != 8) {
            System.out.println("Toplama sorusunu yanlış yaptınız.");
        }
        if (cikarma != 4) {
            System.out.println("Çıkartma sorusunu yanlış yaptınız.");
        }
        if (carpım != 16) {
            System.out.println("Çarpma işlemini yanlış yaptınız.");
        }
        if (bolum != 4) {
            System.out.println("Bölme işlemini yanlış yaptınız.");
        }


    }
}
