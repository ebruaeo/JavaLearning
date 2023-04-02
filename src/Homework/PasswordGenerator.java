package Homework;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Random;



public class PasswordGenerator {
    public static void main(String[] args) {
        /* 10 haneli içinde 2 tane büyük harf, 2 tane noktalama işareti 2 tane sayı ve 4 tane de küçük harf bulunan bir şifre oluştur.
         Buradaki şifre deseni (pattern) şöyle olsun:
            bbnnsskkkk
                b: büyük harf
                n: noktalama işareti
                s: sayı
                k: küçük harf

        Part-2
          Her oluşturduğun şifrenin deseni (pattern) farklı olsun.
          Yani her oluşturduğun şifre bbnnsskkkk şeklinde değil de her oluşturduğunda farklı olsun
                 Kısaca karıştır.
            Örn;
                1. çalıştırdığında: bnknsbskkk
                2. çalıştırdığında: knknsbbskk
                gibi her çalıştırdığında farklı olsun.
         */
        String LOWER = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int r = random.nextInt(26);
        char l1 = LOWER.charAt(r);
        System.out.println("r: " + r);
        System.out.println("letter: " + l1);
        char l2 = LOWER.charAt(random.nextInt(26));
        System.out.println("l2: " + l2);
        String password = "" + l1 + l2 ;
        System.out.println("password: " + password);
        char l3 = LOWER.charAt(random.nextInt(26));
        char l4 = LOWER.charAt(random.nextInt(26));

        String UPPER = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        char u1 = UPPER.charAt(random.nextInt(26));
        char u2 = UPPER.charAt(random.nextInt(26));

        String PUNCTUATION = "!'^+%&/()=?";
        char p1 = PUNCTUATION.charAt(random.nextInt(11));
        char p2 = PUNCTUATION.charAt(random.nextInt(11));

        String NUMBER = "1234567890";
        char n1 = NUMBER.charAt(random.nextInt(10));
        char n2 =NUMBER.charAt(random.nextInt(10));


//  bbnnsskkkk
        System.out.println("password: " +u1+u2+p1+p2+n1+n2+l1+l2+l3+l4);

        String password2 = "" + u1+u2+p1+p2+n1+n2+l1+l2+l3+l4;
        String shuffledPassword = "";
        char s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;

        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;

        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;
        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;
        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;
        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;
        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;
        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;
        s = password2.charAt(random.nextInt(password2.length()));
        password2 = password2.replaceFirst(String.valueOf(s), "");
        shuffledPassword += s;

        shuffledPassword += password2;
        System.out.println("shuffledPassword: " + shuffledPassword);




    /*
        // Sabitleri en yukarı al, sabit değişken, dinamik bound, stringsiz sayı ekleme, password stringi, char'sız, tek satır

        // Sabitleri en yukarı al, sabit değişken: final,
        final String lowers = "abcdefghijklmnopqrstuvwxyz";
        final String uppers = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        final String punctuations = "!'^+%&/()=?";
        final String numbers = "1234567890";

        char nok1 = punctuations.charAt(random.nextInt(punctuations.length()));
        char nok2 = punctuations.charAt(random.nextInt(punctuations.length()));

//        dinamik bound: lowers.length(), uppers.length()
        char k1 = lowers.charAt(random.nextInt(lowers.length()));
        char k2 = lowers.charAt(random.nextInt(lowers.length()));
        char k3 = lowers.charAt(random.nextInt(lowers.length()));
        char k4 = lowers.charAt(random.nextInt(lowers.length()));
        char b1 = uppers.charAt(random.nextInt(uppers.length()));
        char b2 = uppers.charAt(random.nextInt(uppers.length()));

        // Stringsiz sayı ekleme
        int s1 = random.nextInt(10); // numbers gereksiz
        int s2 = random.nextInt(10); // numbers gereksiz

        // password stringi
        String password1 = "" + b1 + b2 + nok1 + nok2 + s1 + s2 + k1 + k2 + k3 + k4;
        System.out.println("password1: " + password1);

        // char'sız password
        String password2 = "";
        password2 += uppers.charAt(random.nextInt(uppers.length()));
        password2 += uppers.charAt(random.nextInt(uppers.length()));

        password2 += punctuations.charAt(random.nextInt(punctuations.length()));
        password2 += punctuations.charAt(random.nextInt(punctuations.length()));

        password2 += random.nextInt(10);
        password2 += random.nextInt(10);

        password2 += lowers.charAt(random.nextInt(lowers.length()));
        password2 += lowers.charAt(random.nextInt(lowers.length()));
        password2 += lowers.charAt(random.nextInt(lowers.length()));
        password2 += lowers.charAt(random.nextInt(lowers.length()));
        System.out.println("password2: " + password2);

        //  tek seferde password
        String password3 = "" + uppers.charAt(random.nextInt(uppers.length())) + uppers.charAt(random.nextInt(uppers.length()))
                + punctuations.charAt(random.nextInt(punctuations.length())) + punctuations.charAt(random.nextInt(punctuations.length()))
                + random.nextInt(10) + random.nextInt(10)
                + lowers.charAt(random.nextInt(lowers.length())) + lowers.charAt(random.nextInt(lowers.length())) + lowers.charAt(random.nextInt(lowers.length()))
                + lowers.charAt(random.nextInt(lowers.length()));
        System.out.println("password3: " + password3);*/



    }
}
