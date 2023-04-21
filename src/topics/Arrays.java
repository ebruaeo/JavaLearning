package topics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // Dizi oluşturma - değer atama - yazdırma

        String[] isimDizisi = {"Ali", "Veli", "Yakup", "Bilal"};
        for (int i = 0; i < isimDizisi.length; i++) {
            System.out.println(isimDizisi[i]);
        }
        // FARKLI VERİ TİPLERİNDE DİZİ TANIMLAMA

        /** INT */

        // Yöntem 1:
        int[] sayilar1 = {15, 18, 79, 56};

        // Yöntem 2:
        int[] sayilar = new int[6];
        sayilar[0] = 15;
        sayilar[1] = 12;
        sayilar[2] = 23;
        sayilar[3] = 76;
        sayilar[4] = 89;
        sayilar[5] = 67;
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        /** CHAR */

        char[] karakterDizi = {'e', 'n', 'e', 's'};
        for (int i = 0; i < karakterDizi.length; i++) {
            System.out.println(karakterDizi[i]);
        }

        /** DOUBLE */

        double[] doubleDizi = {12.5, 13.5, 56.5};
        for (int i = 0; i < doubleDizi.length; i++) {
            System.out.println(doubleDizi[i]);
        }

        // KULLANICIDAN İNPUT ALMA

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun: ");
        int diziUzunluk = Integer.parseInt(scanner.nextLine());

        String[] isimler = new String[diziUzunluk];

        for (int i = 0; i < diziUzunluk; i++) {
            System.out.println("Dizinin " + i + ". index değerini giriniz. ");
            isimler[i] = scanner.nextLine();
        }
        System.out.println("Dizinin elemanları: ");
        for (int i = 0; 0 < isimler.length; i++) {
            System.out.println(isimler[i]);
        }
    }
}
