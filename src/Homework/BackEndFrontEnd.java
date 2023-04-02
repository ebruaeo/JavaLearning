package Homework;

import java.util.Scanner;

public class BackEndFrontEnd {
    public static void main(String[] args) {
        /*- Bir websitesi back-end ve front-end şeklinde isimlendirilen 2 parçadan oluşur.
        Back-end verilerin saklandığı yer olurken front-end ise butonların ekranların olduğu kullanıcıdan girdilerin alınabildiği,
        kullanıcının etkileşime geçtiği yerdir. Bir websitesine giriş yapıldıktan sonra kullanıcıya dil seçeneği sunuluyor.
        Kullanıcı ingilizce için en, türkçe için tr yazarsa karşısına seçtiği dile göre bir karşılama metni çıkıyor.
        (Metin seçimi serbest, merhaba günaydın vb.)
    Yukarıdaki senaryoyu simüle eden bir java programı yaz.
    İpucu-1: Java programında backend kodları yazdığımız yer, frontend ise kullanıcının input girdiği yer
         */
        Scanner scanner = new Scanner(System.in);



        System.out.println("Dil seçiniz: ");
        String language = scanner.nextLine();

        if (language.equals("en")) {
            System.out.println("Hello! I hope this message finds you well.");
        } else if (language.equals("tr")) {
            System.out.println("Merhaba! Mesajınızın size iyi geldiğini umarım.");
        } else {
            System.out.println("Geçersiz bir seçim yaptınız.");
        }


    }
}
