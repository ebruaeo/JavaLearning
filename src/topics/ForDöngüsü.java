package topics;

public class ForDöngüsü {
    public static void main(String[] args) {
        // FOR DÖNGÜSÜ GİRİŞ

        // for (int i = başlangıç; koşul; arttırma; {    }

        // 1'den 10'a kadar sayıları ekrana yazdıralım.
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        .
//        .
//        .

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
