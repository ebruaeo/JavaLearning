package Loops;

import java.util.Scanner;

public class ArmstrongSayısıDoWhile {
    public static void main(String[] args) {
        /* girilen bir sayının armstrong sayısı olup olmadığını bulmaya çalışın
            örneğin
            1634 = 1^4 + 6^4 + 3^4+ 4^4 basamak sayısı kadar olan kuvvetlerinin toplamı sayının kendisine eşitse
            371 = 3^3 +7^3+1^3
            do while kullanarak
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak Sayısı: ");
        int basamakSayisi= scanner.nextInt();

        int geciciSayi= sayi;
        int toplam =0;

        do {
            int basamakDegeri= geciciSayi%10;
            geciciSayi/=10;
            toplam +=Math.pow(basamakDegeri,basamakSayisi);


        } while (geciciSayi>0 );

        if (sayi==toplam) {
            System.out.println("Sayı Armstrong sayısıdır.");
        } else {
            System.out.println("Armstrong sayısı değildir.");
        }
    }
}
