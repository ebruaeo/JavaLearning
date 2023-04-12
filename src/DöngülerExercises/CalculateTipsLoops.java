package DöngülerExercises;

import java.util.Scanner;

public class CalculateTipsLoops {
    public static void main(String[] args) {
//        - Financial application: calculate tips
//        Hizmet bedeli ve himet bedeli üzerinden verilecek bahşişi hesaplayan program yaz.
//                Örn;
//        Hizmet bedeli: 10
//        Bahşiş oranı: %15
//        Çıktı: Bahşiş 1.5₺, toplam ödenecek tutar: 11.5₺
//        - Financial application: calculate tips ödevini tekrar yap. Hizmet bedeli ve bahşiş oranını kullanıcıdan input alarak yap.
//                Sonucu bastırdıktan sonra kullanıcıya "Başka hesap yapmak ister misiniz? (y/n)" diye sor.
//        Kullanıcı "y" derse program çalışmaya devam etsin; "n" derse "Program sonlandırılıyor..." şeklinde ekrana basıp programı sonlandır.


        Scanner scanner = new Scanner(System.in);


//        System.out.println("Hizmet Bedeli: ");
//        double hizmetBedeli= Double.parseDouble(scanner.nextLine());
//        System.out.println("Bahşiş Oranı: ");
//        double tip =  Double.parseDouble(scanner.nextLine());
//        double toplamHesap = ((hizmetBedeli*tip)/100)+hizmetBedeli;
//        System.out.println("Ödenecek Toplam Tutar: " + toplamHesap);
//        System.out.println("Başka hesap yapmak ister misin?");
//        String choice = scanner.nextLine();
//        while (choice.equalsIgnoreCase("Yes")) {
//            System.out.println("Hizmet Bedeli: ");
//            hizmetBedeli= Double.parseDouble(scanner.nextLine());
//            System.out.println("Bahşiş Oranı: ");
//            tip =  Double.parseDouble(scanner.nextLine());
//            toplamHesap = ((hizmetBedeli*tip)/100)+hizmetBedeli;
//            System.out.println("Ödenecek Toplam Tutar: " + toplamHesap);
//            System.out.println("Başka hesap yapmak ister misin?");
//            choice = scanner.nextLine();
//
//        }
//        System.out.println("Program sonlandırılıyor..");


//        System.out.println("Hizmet Bedeli: ");
//        double hizmetBedeli= Double.parseDouble(scanner.nextLine());
//        System.out.println("Bahşiş Oranı: ");
//        double tip =  Double.parseDouble(scanner.nextLine());
//        double toplamHesap = ((hizmetBedeli*tip)/100)+hizmetBedeli;
//        System.out.println("Ödenecek Toplam Tutar: " + toplamHesap);
//        System.out.println("Başka hesap yapmak ister misin?");
//        String choice = scanner.nextLine();
//
//        for (;choice.equalsIgnoreCase("Yes"); choice = scanner.nextLine()) {
//            System.out.println("Hizmet Bedeli: ");
//           hizmetBedeli= Double.parseDouble(scanner.nextLine());
//            System.out.println("Bahşiş Oranı: ");
//          tip =  Double.parseDouble(scanner.nextLine());
//            toplamHesap = ((hizmetBedeli*tip)/100)+hizmetBedeli;
//            System.out.println("Ödenecek Toplam Tutar: " + toplamHesap);
//            System.out.println("Başka hesap yapmak ister misin?");
//        }
//        System.out.println("Program sonlandırılıyor..");


        do {
            System.out.println("Hizmet Bedeli: ");
            double hizmetBedeli = Double.parseDouble(scanner.nextLine());
            System.out.println("Bahşiş Oranı: ");
            double tip = Double.parseDouble(scanner.nextLine());
            double toplamHesap = ((hizmetBedeli * tip) / 100) + hizmetBedeli;
            System.out.println("Ödenecek Toplam Tutar: " + toplamHesap);
            System.out.println("Başka hesap yapmak ister misin?");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Hizmet Bedeli: ");
                hizmetBedeli = Double.parseDouble(scanner.nextLine());
                System.out.println("Bahşiş Oranı: ");
                tip = Double.parseDouble(scanner.nextLine());
                toplamHesap = ((hizmetBedeli * tip) / 100) + hizmetBedeli;
                System.out.println("Ödenecek Toplam Tutar: " + toplamHesap);
                System.out.println("Başka hesap yapmak ister misin?");
                choice = scanner.nextLine();
            } else {
                break;
            }
        } while (true)  ;
        System.out.println("Program sonlandırılıyor..");


    }
}
