package Loops;

import java.util.Scanner;

public class WhileKullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki=3;
        String sys_kullaniciadi="Mustafa Murat";
        String sys_parola="12345";

        System.out.println("********************");
        System.out.println("Kullanıcı girişine hoşgeldiniz");
        System.out.println("***********************");

        while (true) {
            System.out.print("Kullanıcı adı: ");
            String kullaniciAdi = scanner.nextLine();
            System.out.println("Parola: ");
            String parola= scanner.nextLine();
            
            if (kullaniciAdi.equals(sys_kullaniciadi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz "+ sys_kullaniciadi);
                break;
            } else if (kullaniciAdi.equals(sys_kullaniciadi) && !parola.equals(sys_parola)) {
                System.out.println("Şifre yanlış");
                giris_hakki--;
                
            }else if (!kullaniciAdi.equals(sys_kullaniciadi) && parola.equals(sys_parola)) {
                System.out.println("kullanıcı adı yanlış");
                giris_hakki--;

            } else{
                System.out.println("kullanıcı adınız ve parolanız hatalı");
                giris_hakki--;
            }

            if (giris_hakki==0) {
                System.out.println("Giriş hakkınız bitti.");
                break;
            }


        }
    }
}
