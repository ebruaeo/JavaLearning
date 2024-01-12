package Loops;

import java.util.Scanner;

public class ForDöngüsü {
    public static void main(String[] args) {
        // FOR DÖNGÜSÜ GİRİŞ

        // for (int i = başlangıç; koşul; arttırma veya azaltma; {    }
        //döngü koşulumuz doğru olduğu sürece çalışacak

        /*! int i= 0;
        ! for (; i<6; i++) {
        !..... } */
        /*? int i=0;
          ? int J=10;
        ? For (; i<10 && j>0; i++,j-- ) {} */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayı = scanner.nextInt();
        int fakt=1;
        for (int i =1; i<=sayı; i++) {
            fakt*=i;
        }
        System.out.println(fakt);













        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        // 1'den 10'a kadar olan çift olan sayıları ekrana yazdır

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 1'den 10'a kadar olan tek olan sayıları ekrana yazdır
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        // çift sayıların toplamı
        int ctoplam = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                ctoplam += i;
            }
        }
        System.out.println("Sonuç: " + ctoplam);

        // tek sayıların toplamı
        int ttoplam = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                ttoplam += i;
            }
        }
        System.out.println("Sonuç: " + ttoplam);


        // çift sayıların yerine başka bi kelime yazma
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Enes");
            } else {
                System.out.println(i);
            }
        }

        // NESTED FOR LOOPS

        for (int i = 9; i >= 0; i--) {
            for (int k = 9; k >= 0; k--) {
                System.out.print(k + "  ");
            }
            System.out.println();

        }


        for (int i = 9; i >= 0; i--) {
            for (int k = i; k >= 0; k--) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }
}
