package Homework;

import java.util.Random;
import java.util.Scanner;

public class music_app {
    public static void main(String[] args) {
        // Çalma listesi
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Çalma listesini giriniz: ");
        String liste = scanner.nextLine();

        int sarkı1 = (random.nextInt(10));
        int sarkı2 = (random.nextInt(15));
        int sarkı3 = (random.nextInt(20));

        if (liste.equals("L1")) {
            System.out.println(sarkı1 + ". Şarkı çalınıyor.");
        } else if (liste.equals("L2")) {
            System.out.println(sarkı2 + ". Şarkı çalınıyor.");
        } else if (liste.equals("L3")) {
            System.out.println(sarkı3 + ". Şarkı çalınıyor.");
        } else {
            System.out.println("Böyle bir çalma listesi bulunmamaktadır.");
        }


    }
}
