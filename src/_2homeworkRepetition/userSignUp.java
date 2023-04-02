package _2homeworkRepetition;

import java.util.Random;
import java.util.Scanner;

public class userSignUp {
    public static void main(String[] args) {
        /*
    Bir program yaz. Bu programın amacı yeni bir kullanıcı kayıt ettirmek.
    Program çalıştığında kullanıcı adı ve şifre sorsun.
    Eğer kullanıcı adı daha önce kullanılmamışsa ve şifre en az 8 karakter içeriyorsa ekrana "Kullanıcı oluşturuldu" yazsın.
    Eğer kullanıcı adı başkası tarafından kullanılıyorsa "Bu kullanıcı adı zaten alınmış." diyip 2 tane kullanıcı adı önersin.
    Önereceği kullanıcı adları ise kullanıcının yazdığı ad+rastgele 2 basamaklı sayı şeklinde olsun.
    Eğer şifre 8 karakterden kısa ise "Şifre en az 8 karakter olmalı" şeklinde ekrana yazsın.
    Örnek çalıştırma 1;
        Kullanıcı adı: nüüb123
        Şifre: 12345678
        Kullanıcı oluşturuldu
    Örnek çalıştırma 2;
        Kullanıcı adı: omerokumus
        Şifre: 12345678
        Kullanıcı adı zaten alınmış. Şunları deneyebilirsiniz;
        omerokumus78 veya omerokumus42
    Örnek çalıştırma 3;
        Kullanıcı adı: nüüb123
        Şifre: 12345
        Şifre en az 8 karakter olmalı
         */
        String oldUser1 = "omerokumus";
        String oldUser2 = "eminokumus";
        String oldUser3 = "pisipisi";
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Kullanıcı adı: ");
        String userName = sc.nextLine();
        System.out.println("Şifre: ");
        String password = sc.nextLine();
        int random1= ra.nextInt(90);
        int random2 = ra.nextInt(90);



        if (!userName.equals(oldUser1) && !userName.equals(oldUser2) && !userName.equals(oldUser3) && password.length() >= 8 ) {
            System.out.println("Kullanıcı oluşturuldu.");
        } else if (userName.equals(oldUser1) || userName.equals(oldUser2) || userName.equals(oldUser3)){
            System.out.println("Bu kullanıcı adı zaten alınmış.");
            System.out.println("Şunlardan birini şeçin: ");
            System.out.println(userName+random1);
            System.out.println(userName+random2);
        } else if (password.length() <= 8) {
            System.out.println("Şifre en az 8 karakter olmalı");
        }


    }
}
