package Homework;

import java.util.Scanner;

public class user_login {
    public static void main(String[] args) {
        /*
        Kullanıcı bilgileri
        omerokumus1 - 12345
        eminokumus1 - qwaszx
        pisipisi1 - meow


    1- ilk olarak kullanıcı adı ve şifre sor
            1.1 Eğer kullanıcı adı ve şifre doğru ise. Hoşgeldin <kullanıcı adı>. şeklinde ekrana yazı yazsın.
            1.2 Eğer kullanıcı adı yanlış ise "böyle bir kullanıcı kayıtlı değildir",
            1.3 eğer şifre yanlış ise "yanlış şifre" şeklinde ekrana yazı yazsın.
         */

        Scanner scanner = new Scanner(System.in);
        String user1 = "omerokumus1";
        String password1 = "12345";
        String user2 = "eminokumus1";
        String password2 = "qwaszx";
        String user3 = "pisipisi1";
        String password3 = "meow";

        System.out.println("Kullanıcı adınız: ");
        String userName = scanner.nextLine();
        System.out.println("Şifre: ");
        String password = scanner.nextLine();

        if (userName.equals(user1)) {
            if (password.equals(password1)) {
                System.out.println("Hoşgeldiniz " + user1);
            } else if (!password.equals(password1)) {
                System.out.println("Yanlış şifre.");
            }
        } else if (userName.equals(user2)) {
            if (password.equals(password2)) {
                System.out.println("hoşgeldiniz " + user2);
            } else if (!password.equals(password2)) {
                System.out.println("Yanlış şifre.");
            }
        } else if (userName.equals(user3)) {
                if (password.equals(password3)) {
                    System.out.println("Hoşgeldiniz " +user3);
                } else {
                    System.out.println("Şifre yanlış");
                }
        } else {
            System.out.println("Böyle bir kullanıcı yoktur.");
        }

//        if (userName.equals(user1) && password.equals(password1)) {
//            System.out.println("Hoşgeldiniz " + user1);
//        } else if (userName.equals(user2) && password.equals(password2)) {
//            System.out.println("Hoşgeldiniz " + user2);
//        } else if (userName.equals(user3) && password.equals(password3)) {
//            System.out.println("Hoşgeldiniz " + user3);
//        }
//
//
//        if (userName.equals(user1) && !password.equals(password1)) {
//            System.out.println("Yanlış şifre.");
//        } else if (userName.equals(user2) && !password.equals(password2)) {
//            System.out.println("Yanlış şifre.");
//        } else if (userName.equals(user3) && !password.equals(password3)) {
//            System.out.println("Yanlış şifre");
//        }
//
//        if (!userName.equals(user1) && !userName.equals(user2) && !userName.equals(user3)) {
//            System.out.println("Böyle bir kullanıcı yoktur.");
//        }


//        boolean ısUser1 = userName.equals(user1) && password.equals(password1);
//        boolean ısUser2 = userName.equals(user2) && password.equals(password2);
//        boolean ısUser3 = userName.equals(user3) && password.equals(password3);
//
//        if (ısUser1 || ısUser2 || ısUser3) {
//            System.out.println("Hoşgeldiniz" + user1 + || +user2 + || +user3);
//        } else if (!userName.equals(user1)) {
//            System.out.println("Böyle bir kullanıcı kayıtlı değildir");
//        } else if (!password.equals(password1)) { //sadece else de bırakabiliriz.
//            System.out.println("Yanlış şifre.");
//
//        }
    }
}
