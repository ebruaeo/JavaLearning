package topics;

import java.nio.charset.StandardCharsets;
import java.time.temporal.ValueRange;
import java.util.Objects;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in); // ezber

//        System.out.println("1. Sayı:");
//        String n1 = reader.nextLine();
//
//        System.out.println("2. Sayı: ");
//        String n2 = reader.nextLine();
//
//        int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
//        System.out.println("Toplam: " + sum);

//        System.out.println("1. Sayı:");
//        String n1 = reader.nextLine();
//        int i1 = Integer.parseInt(n1);
//        int i1 = Integer.parseInt(reader.nextLine());
//        System.out.println("2. Sayı: ");


        // Kullanıcıdan bu günün tarihini alıp ekrana yazdır
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bugünün tarihi: " );
//        String date = scanner.nextLine();
//        System.out.println("Bugünün tarihi: " + date);

        //Scanner scanner = new Scanner(System.in);
//        System.out.println("Sayı 1: ");
////        String s1 = scanner.nextLine();
////        double sayi1= Double.parseDouble(s1);
//
//        double sayi1 = Double.parseDouble(scanner.nextLine());
////
//        System.out.println("Sayı 2: ");
//        double sayi2= Double.parseDouble(scanner.nextLine());
//        double sonuc = sayi1-sayi2;
//        System.out.println("Sonuç= " + sonuc);


//        System.out.println("1. Sayı:");
//        String n1 = scanner.nextLine();

//        System.out.println("2. Sayı: ");
//        String n2 = scanner.nextLine();
//        System.out.println("1. ve 2. sayıyı giriniz");
//        int sum = Integer.parseInt(scanner.nextLine()) + Integer.parseInt(scanner.nextLine());
//        System.out.println("Toplam: " + sum);
//
//
//        Scanner scanner2 = new Scanner(System.in);
//        double speed = 10.5;
//        String str= "Bilgisayar";


        /** Ex- 2 İşlemli Hesap Makinesi
         *      - Kullanıcı 3 tane input girecek. Sırayla;
         *          1. sayı
         *          operatör
         *          2. sayı
         *
         *      - Operatör + ya da - olabilir.
         *      - Eğer + ise verilen sayıları topla, eğer - ise verilen sayıları çıkart.
         *      - Eğer + veya - harici bir şey girerse "Yanlış operatör girildi" şeklinde uyarı bastır
         *
         *
         */

        // Scanner scanner = new Scanner(System.in);

        //System.out.println("Sayı 1: ");
        // double sayi1 = Double.parseDouble(scanner.nextLine());
        //System.out.println("Sayı 2:");
        //double sayi2 = Double.parseDouble(scanner.nextLine());
        //System.out.println("operatör");
        ////String operator = scanner.nextLine();
        //if (operator.equals("+")) {
        //  double toplama = sayi1 + sayi2;
        //System.out.println("Toplam: " + toplama);
//
//        } else if ("-".equals(operator)) {
//            double cıkarma = sayi1 - sayi2;
//            System.out.println("Sonuç: " + cıkarma);
//
//        } else if (operator.equals("*")) {
//            double carpma = sayi1 * sayi2;
//            System.out.println("Sonuç: " + carpma);
//
//        } else if (operator.equals("/")) {
//            if (sayi2==0){
//                System.out.println("Sayılar sıfıra bölünemez.");
//            } else if (operator.equals("/") && sayi2 !=0) { // operator.equals("/") kontrolü gereksiz (neden?)
//                                                            // sadece else kullansak olur. (neden?)
//                double bolme = sayi1 / sayi2;
//                System.out.println("Sonuç: " + bolme);

        //         }
        //   }
        // Nested if yerine bu da yapılabilir ama nested if tercih edilmeli. (neden?)
//        else if (operator.equals("/") && sayi2 == 0) {
//            System.out.println("Bölünemez");
//        } else if (operator.equals("/") && sayi2 != 0) {
//            System.out.println("Sonuç:" + (sayi1 / sayi2));
//        }
//        else {
        //  System.out.println("Yanlış operatör girdiniz.");

        //4 soruluk quiz +
        //- 4 tane 4 işlem sorusu yaz+
        //- sırayla kullanıcıya soruları sor ve cevaplarını al+
        //- doğru cevap sayısını tut ve en sonda ekrana yazdır. +
        //- Ek-1: yanlış yapılan soruları en sonra yanlış yapılan sorular şeklinde ekrana bastır
        //- Ek-2: cevap yanlış olursa 1 hak daha ver yine yanlış olursa sonraki soruya geç
        //- ipucu: önce 2 soruluk yap sonra 4 soruya çıkart
        //Ek-1 ve Ek-2'yi diğerlerini yaptıktan sonra yap.


        Scanner reader = new Scanner(System.in);
        int correctAnswer = 0;

        // toplama
        /*
        * 1- Kullanıcıdan ınput al
        * 2- ınputun doğruluğunu kontrol et
        * 3- ınput doğru ıse doğru cevap sayısını arttır
        * 4- ınput yanlış ıse
        *       4.1- soruyu tekrar sor
        *       4.2- ınput al
        *       4.3- yenı ınputu kontrol et
        *       4.4- ınput doğruysa doğru cevap sayısını arttır
        *       4.5- ınput doğru değılse bır şey yapma, sonrakı soru gelsın
        * */
        System.out.println("6+4= ");
        double toplama = Double.parseDouble(reader.nextLine());
        if (toplama == 10) {
            correctAnswer++;
        } else {
            System.out.println("6+4= ");
            toplama = Double.parseDouble(reader.nextLine());
            System.out.println("toplama:" + toplama);
            if (toplama == 10) {
                System.out.println("L146. satırdakı ıf bloğu");
                correctAnswer++;
            }
        }

        // çıkarma
        System.out.println("6-4= ");
        double cıkarma = Double.parseDouble(reader.nextLine());
        if (cıkarma == 2) {
            correctAnswer++;
        } else {
            System.out.println("6-4= ");
            Double.parseDouble(reader.nextLine());
            if (cıkarma == 2) {
                correctAnswer++;
            }
        }
        //çarpma
        System.out.println("4*4 = ");
        double carpma = Double.parseDouble(reader.nextLine());
        if (carpma == 16) {
            correctAnswer++;
        } else {
            System.out.println("4*4= ");
            Double.parseDouble(reader.nextLine());
            if (carpma == 16) {
                correctAnswer++;
            }
        }
        //bölme
        System.out.println("8/4= ");
        double bolme = Double.parseDouble(reader.nextLine());
        if (bolme == 2) {
            correctAnswer++;
        } else {
            System.out.println("8/4= ");
            Double.parseDouble(reader.nextLine());
            if (bolme == 2) {
                correctAnswer++;
            }
        }

        System.out.println("Doğru cevap sayınız: " + correctAnswer);

        System.out.println("Yanlış yaptığınız sorular: ");
        if (toplama != 10) {
            System.out.println("toplama işlemini yanlış yaptınız. ");
        }
        if (cıkarma != 2) {
            System.out.println("Çıkarma işlemini yanlış yaptınız. ");
        }
        if (carpma != 16) {
            System.out.println("çarpma işlemini yanlış yaptınız.");
        }
        if (bolme != 2) {
            System.out.println("bölme işlemini yanlış yaptınız.");
        }
    }
}