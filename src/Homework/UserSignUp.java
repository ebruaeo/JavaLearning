package Homework;

import java.util.Random;
import java.util.Scanner;

public class UserSignUp {
    public static void main(String[] args) {
        /*
      Sistemde kayıtlı olanlar:
        omerokumus - 12345
        eminokumus - qwaszx
        pisipisi - meow

    1- Kullanıcı adı ve şifre sor
    2- Eğer kullanıcı adı daha önce kullanılmamışsa ve şifre en az 8 karakter içeriyorsa ekrana "Kullanıcı oluşturuldu" yazsın.
    3- Eğer kullanıcı adı başkası tarafından kullanılıyorsa "Bu kullanıcı adı zaten alınmış." diyip 2 tane kullanıcı adı önersin.
        3.1- Önereceği kullanıcı adları ise kullanıcının yazdığı ad+rastgele 2 basamaklı sayı şeklinde olsun.
    4- Eğer şifre 8 karakterden kısa ise "Şifre en az 8 karakter olmalı" şeklinde ekrana yazsın.
        */


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String old1 = "omerokumus"; // userName1
        String old2 = "eminokumus";
        String old3 = "pisipisi";

        System.out.println("Kullanıcı adınız: ");
        String userName = scanner.nextLine();  // isim önerisi: userName -> userNameIn
        System.out.println("Şifreniz: ");
        String password = scanner.nextLine();  // password -> passwordInd
       // int letterNumber = password.length();  // letterNumber -> passwordLength
        //int random1 = random.nextInt(90)+10;
        //int random2 = random.nextInt(90)+10;

        if (!userName.equals(old1) && !userName.equals(old2) && !userName.equals(old3) && password.length() >= 8) {
            System.out.println("Kullanıcı oluşturuldu.");
        } else if (userName.equals(old1) || userName.equals(old2) || userName.equals(old3)) {
            int random1 = random.nextInt(90)+10;
            int random2 = random.nextInt(90)+10;
            System.out.println("Bu kullanıcı adı zaten alınmış.");
            System.out.println("Şunlardan birini seçin: ");
            System.out.println(userName + random1);
            System.out.println(userName + random2);

        } else if (password.length() < 8) {
            System.out.println("Şifre en az 8 karakter olmalı");

        }


        if (!userName.equals(old1) && !userName.equals(old2) && !userName.equals(old3)) {
            if (password.length() >= 8) {
                System.out.println("Kullanıcı oluşturuldu.");
            } else {
                System.out.println("Şifre en az 8 karakter olmalı");
            }
        } else {
            int random1 = random.nextInt(90)+10;
            int random2 = random.nextInt(90)+10;
            System.out.println("Bu kullanıcı adı zaten alınmış.");
            System.out.println("Şunlardan birini seçin: ");
            System.out.println(userName + random1);
            System.out.println(userName + random2);
        }

    }
}
