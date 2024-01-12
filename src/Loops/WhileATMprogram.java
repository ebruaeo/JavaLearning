package Loops;

import java.util.Scanner;

public class WhileATMprogram {
    public static void main(String[] args) {
        /* 1 bakiye öğren
           2 para çekme
           3 para yatırma
           Çıkış Q
     */

        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;
        String islemler = "1. işlem: bakiye öğren\n"
                + "2. işlem: para çekme\n"
                + "3. işlem: para yatırma\n"
                + "Çıkış için q ya basın";
        System.out.println(islemler);

        while (true) {
            System.out.println("işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor..");
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz: " + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int cekilecekTutar = Integer.parseInt(scanner.nextLine());
                if (bakiye - cekilecekTutar < 0) {
                    System.out.println("Bakiyeniz yeterli değil. Bakiyeniz: " + bakiye);
                } else {
                    bakiye -= cekilecekTutar;
                    System.out.println("Kalan bakiye: " + bakiye);
                }

            } else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int yatırılacakTutar = Integer.parseInt(scanner.nextLine());
                bakiye += yatırılacakTutar;
                System.out.println("Toplam bakiyeniz: " + bakiye);
            } else {
                System.out.println("Geçersiz bir işlem yaptınız.");
            }
        }


    }


}
