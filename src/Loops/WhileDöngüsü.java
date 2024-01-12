package Loops;

import java.util.Scanner;

public class WhileDöngüsü {
    public static void main(String[] args) {

      /*   int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        } */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= scanner.nextInt();
        int fact =1;
        while (sayi>0) {
            fact *=sayi;
            sayi--;
        }
        System.out.println(fact);













        // 1'den 10'a kadar olan çift olan sayıları ekrana yazdır
        int i2 = 1;
        while (i2 <= 10) {
            if (i2 % 2 == 0) {
                System.out.println(i2);
            }
            i2++;
        }

        // çift sayıların toplamı


        int toplam = 0;
        int i3 = 1;
        while (i3 <= 10) {
            if (i3 % 2 == 0) {
                toplam += i3;
            }
            i3++;
        }
        System.out.println("Çift sayıların toplamı; " + toplam);

        // tek sayıların toplamı


        int ttoplam = 0;
        int i4 = 1;
        while (i4 <= 10) {
            if (i4 % 2 == 1) {
                ttoplam += i4;
            }
            i4++;
        }
        System.out.println("Tek sayıların toplamı; " + ttoplam);


        System.out.println("Guess the password: ");
        String password = "let me in";
        Scanner scanr = new Scanner(System.in);
        String guess = scanr.nextLine();

        while (!guess.equals(password)) {
            System.out.println("Guess the password: ");
            guess = scanr.nextLine();
        }
        System.out.println("correct");


        // NESTED WHILE LOOPS

        int m = 9;
        while (m>=0) {
            int k = m;
            while (k>=0)  {
                System.out.println(k+"  ");
                k--;
            }
            System.out.println();
            m--;
        }















    }
}
