package _2homeworkRepetition;

import java.util.Scanner;

public class Backend {
    public static void main(String[] args) {
        /*
        - Bir websitesi back-end ve front-end şeklinde isimlendirilen 2 parçadan oluşur.
        Back-end verilerin saklandığı yer olurken front-end ise butonların ekranların olduğu kullanıcıdan girdilerin alınabildiği,
        kullanıcının etkileşime geçtiği yerdir. Bir websitesine giriş yapıldıktan sonra kullanıcıya dil seçeneği sunuluyor.
        Kullanıcı ingilizce için en, türkçe için tr yazarsa karşısına seçtiği dile göre bir karşılama metni çıkıyor.
        (Metin seçimi serbest, merhaba günaydın vb.)
    Yukarıdaki senaryoyu simüle eden bir java programı yaz.
    İpucu-1: Java programında backend kodları yazdığımız yer, frontend ise kullanıcının input girdiği yer
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("dil seçiniz: ");
        String secim = sc.nextLine();

        if (secim.equals("en")) {
            System.out.println("Hello everyone!");
        } else if (secim.equals("tr")) {
            System.out.println("Herkese merhaba!");

        }

    }
}
