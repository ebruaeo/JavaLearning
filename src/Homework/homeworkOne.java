package Homework;

import java.security.DigestException;

public class homeworkOne {
    public static void main(String[] args) {

        // fahrenheit celciusa çevirme
        double celsius = 40.4;
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " celsius " + fahrenheit);

        // kilogramı pounda çevirme
        double pound = 55.5;
        double kilograms = pound * 0.454;
        System.out.println(pound + "pound " + kilograms);

        // metreyi feete çevirme
        double feet = 16.5;
        double meters = feet * 0.305;
        System.out.println(feet + " feet are " + meters + " meters.");

        // dikdörtgen alan hesaplama
        int longSide = 15;
        int shortSide = 6;
        int area = longSide * shortSide;
        System.out.println("Dikdörtgenin alanı: " + area);

        // dikdörtgen çevre hesaplama
        int perimeter = (longSide + shortSide) * 2;
        System.out.println("Dikdörtgenin çevresi: " + perimeter);

        // Çember alan hesapllama
        int r = 3;
        double cemberAlanı = Math.PI * Math.pow(r, 2); // A=Pi*r*r
        System.out.println("Çember alanı: " + cemberAlanı);

        // Çemberin çevresi
        double cevre = 2 * Math.PI * r;
        System.out.println("Çemberin çevresi: " + cevre);

        // vücut kitle indeksi hesaplama
        //Vücut kitle indeksi, vücut ağırlığının boy uzunluğunun karesine bölünmesiyle (kg/m²) hesaplanır.
        double kilo = 65.7;
        double boy = 1.70;
        double BMI = kilo / (Math.pow(boy, 2));
        System.out.println("Vücut kitle indeksi: " + BMI);

        // İki basamaklı sayının basamaklarını toplamak
        int x = 69;
        int xCopy = x;
        int birler = x % 10; // kalan 9
        x = x / 10; // 69 / 10 -> 6.9 -> 6, 1245 / 10 = 124.5 -> 124
        int onlar = x % 10;
        int toplam = birler + onlar;
        System.out.println(xCopy + "'in basamakları toplamı: " + toplam);

        int e = 13;
        int ebirler = e % 10;
        int eonlar = (e - ebirler) / 10;
        int eToplam = ebirler + eonlar;
        System.out.println("e sayısının rakamları toplamı: " + eToplam);

        int ö = 152;
        int öBirler = ö % 10;
        System.out.println("birler basamağı: " + öBirler);
        int öYüzler = ö / 100;
        System.out.println("yüzler basamağı: " + öYüzler);
        int öOnlar = ((ö % 100) - öBirler) / 10;
        System.out.println("onlar basamağı: " + öOnlar);

        int öToplam = (öOnlar) + (öBirler) + (öYüzler);
        System.out.println("ö sayısının rakamları toplamı: " + öToplam);


        // find the years, days
        int minutes = 905648418;
        int hour = minutes / 60;
        int day = hour / 24;
        int year = day / 365;
        System.out.println("905648418 dakika: " + year + " yıl eder.");
        System.out.println("905648418 dakika: " + day + "gün eder.");

        //  Verilen bir sayının tek mi çift mi olup olmadığını bulan programı yaz

        int number = 35;
        if (number % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else if (number % 2 == 1)
            System.out.println("Sayı tektir.");

        // Vize, final ve ödev notları verilen bir öğrencinin verilen vize/final/ödev ağırlıklarına göre
        // ortalamasını hesaplayan ve verilen baraja göre dersi geçip geçmediğini söyleyen programı yaz.
        // Vize %30, Final %50, Ödev %20, Baraj 45


        
        int vize = 10;
        int Final = 80;
        int ödev = 15;
        int ortalama = ((vize * 30) + (Final * 50) + (ödev * 20)) / 100;
        if (ortalama >= 45) {
            System.out.println(ortalama + " Geçtiniz.");

        } else
            System.out.println(ortalama + " Kaldınız.");

        // Vücut Kitle Endeksi hesaplayan ve sonuca göre normal obez vs yazan program. VKI aralıkları aşağıda
        //		BMI < 18.5 Underweight
        //      18.5 ≤ BMI < 25.0 Normal
        //    25.0 ≤ BMI < 30.0 Overweight
        //  30.0 ≤ BMI Obese

        double _boy= 1.80;
        double _kilo= 93;
        double vki= _kilo / (Math.pow(_boy,2));
           if (vki < 18.5) {
               System.out.println("Underweight");
           } else if (18.5 <= vki && vki < 25.5) {
               System.out.println("Normal");
           } else if (25.0 <= vki && vki < 30.0) {
               System.out.println("Overweight");
           } else if (30.0 <= vki) {
               System.out.println("Obese");
           }


    }

}
