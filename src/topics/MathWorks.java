package topics;

import java.util.Random;

public class MathWorks {
    public static void main(String[] args) {
        /** The Rounding Methods (Yuvarlama işlemleri) */

        /* ceil: bir üst tam sayıya yuvarlar: sayı doğrusunda sağa doğru
            Örn;
                3.5 -> 4
                3.8 -> 4
                9.2 -> 10
                -2.2 -> -2
         */
        System.out.println("Ceil");
        System.out.println("Math.ceil(3.5): " + Math.ceil(3.5));
        System.out.println("Math.ceil(3.8): " + Math.ceil(3.8));
        System.out.println("Math.ceil(9.2): " + Math.ceil(9.2));
        System.out.println("Math.ceil(-2.2): " + Math.ceil(-2.2));
        System.out.println("Math.ceil(5): " + Math.ceil(5));
        System.out.println("Math.ceil(-5): " + Math.ceil(-5));
        System.out.println();

        /* floor: bir alt tam sayıya yuvarlar: sayı doğrusunda sola doğru
            3.5 -> 3
            3.8 -> 3
            9.2 -> 9
            -2.2 -> -3
            5 -> 5
            -5 -> -5
         */
        // string concatenation

        System.out.println("Floor");
        System.out.println("Math.floor(3.5): " + Math.floor(3.5));
        System.out.println("Math.floor(3.8): " + Math.floor(3.8));
        System.out.println("Math.floor(9.2): " + Math.floor(9.2));
        System.out.println("Math.floor(-2.2): " + Math.floor(-2.2));
        System.out.println("Math.floor(5): " + Math.floor(5));
        System.out.println("Math.floor(-5): " + Math.floor(-5));
        System.out.println();

        /* round: yuvarlama kurallarına göre yuvarlar.
            Pozitif sayılar için noktadan sonrası 0.5 veya üstü ise yukarı, 0.5 altı ise aşağı yuvarlar
            Negatif sayılar için noktadan sonrası 0.5 veya üstü ise aşağı, 0.5 altı ise yukar yuvarlar
            sonuç long olur (long geriye döndürür)
            3.2 -> 3
            3.8 -> 4
            -2.2 -> -2
            -2.8 -> -3
         */
        System.out.println("Round");
        System.out.println("Math.round(3.2): " + Math.round(3.2));
        System.out.println("Math.round(3.8): " + Math.round(3.8));
        System.out.println("Math.round(-2.2): " + Math.round(-2.2));
        System.out.println("Math.round(-2.8): " + Math.round(-2.8));
        System.out.println();

        double d = Math.floor(123.56);

        double m = Math.floor(6.7);
        System.out.println("6.7:" + m);

        /** min, max, abs (mutlak değer) */
        System.out.println("min, max, abs (mutlak değer)");
        System.out.println("Math.min(2, 5): " + Math.min(2, 5)); // int sonuç verir
        System.out.println("Math.max(3,8): " + Math.max(3,8));
        System.out.println("Math.abs(3-5): " + Math.abs (3-5));

        // Sayılardan bir tanesi double ise double sonuç verir
        System.out.println("Math.min(2.2, 5.3): " + Math.min(2.2, 5.3));
        System.out.println("Math.min(2, 5.3): " + Math.min(2, 5.3));
        System.out.println();


        System.out.println("Random");
        Random random = new Random();
        int r1 = random.nextInt(20) + 12;
        int r2 = (int) (Math.random() * 20 + 12);
        System.out.println(Math.random() * 20); // 0-20 arası, 20 dahil değil
        System.out.println(Math.random() * 10); // 0-10 arası, 10 dahil değil
        System.out.println(Math.random() * 4 + 5); // 5-9 arası, 9 dahil değil
        System.out.println(Math.random() * -10); // -10, -9 arası, -9 dahil değil
        System.out.println(Math.random()); // 0, 1 arası 1 dahil değil

    }
}
