package _2homeworkRepetition;

import java.util.Scanner;

public class userlogin {
    public static void main(String[] args) {
        /*
        omerokumus - 12345
        eminokumus - qwaszx
        pisipisi - meow

    Bir program yaz. Program çalıştığında kullanıcı adı ve şifre sorsun.+++++++++++
    Eğer kullanıcı adı ve şifre doğru ise. Hoşgeldin <kullanıcı adı>. şeklinde ekrana yazı yazsın. +++
    Eğer kullanıcı adı yanlış ise "böyle bir kullanıcı kayıtlı değildir",
    eğer şifre yanlış ise "yanlış şifre" şeklinde ekrana yazı yazsın.
    Örn çalıştırma 1;
        Kullanıcı adı: omerokumus
        Şifre: 12345
        Hoşgeldin omerokumus
    Örn çalıştırma 2;
    Kullanıcı adı: pisipisi
    Şifre: miyav
    Yanlış şifre
    Örn çalıştırma 3;
    Kullanıcı adı: eminokumus3
    Şifre: qwaszx
    Boöyle bir kullanıcı kayıtlı değildir
         */

        String user1 = "omerokumus";
        String password1 = "12345";
        String user2 = "eminokumus";
        String password2 = "qwaszx";
        String user3 = "pisipisi";
        String password3= "meow";


        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanıcı adınız: ");
        String userName= sc.nextLine();
        System.out.println("Şifreniz: ");
        String password= sc.nextLine();

        if (userName.equals(user1) && password.equals(password1)) {
            System.out.println("Hoşgeldiniz " + user1);
        } else if (userName.equals(user2) && password.equals(password2)) {
            System.out.println("Hoşgeldiniz " + user2);
        } else if (userName.equals(user3) && password.equals(password3)) {
            System.out.println("Hoşgeldiniz " + user3);
        }

        if (!userName.equals(user1) && !userName.equals(user2) && !userName.equals(user3)) {
            System.out.println("Böyle bir kullanıcı yoktur.");
        }

        if (!password.equals(password1) && !password.equals(password2) && !password.equals(password3)) {
            System.out.println("Şifreniz yanlış.");
        }

    }
}
