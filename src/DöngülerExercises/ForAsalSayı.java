package DöngülerExercises;

import java.util.Scanner;

public class ForAsalSayı {
    public static void main(String[] args) {
        // ASAL SAYI BULMA UYGULAMASI

        System.out.println("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        boolean asalMi = false;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            } else {
                asalMi = true;
            }
        }
        if (asalMi) {
            System.out.println("Girdiğiniz " + sayi + " sayısı asaldır.");
        } else {
            System.out.println("Girdiğiniz " + sayi + " sayısı asal değildir.");

        }


    }
}
