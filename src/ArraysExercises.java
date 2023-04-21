import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {

        // Dizinin elemanlarını kullanıcıdan alalım
        // daha sonra dizinin içindeki elemanların asal olanlarını ve olmayanlarını ayrı bir şekilde yazdıralım
        Scanner scanner = new Scanner(System.in);

        System.out.println("ASAL SAYI BULMA UYGULAMASINA HOŞGELDİNİZ");
        System.out.println("****************************************");

        int asalToplam=0;
        int asalOlmayanToplam=0;

        String asalSayilar="";
        String asalOlmayanSayilar="";

        boolean asalMi = false;

        System.out.println("Dizinin eleman sayısını giriniz");
        int diziUzunluk = Integer.parseInt(scanner.nextLine());

        int[] sayilar = new int[diziUzunluk];

        for (int i = 0; i< sayilar.length; i++) {
            System.out.println("Dizinin " + i + ". index değerini giriniz :" );
            sayilar [i] = Integer.parseInt(scanner.nextLine());
        }
        for (int sayi : sayilar) {
            asalMi=true;
            for (int j = 2; j< sayi; j++) {
                if (sayi%j == 0) {
                    asalOlmayanToplam+=1;
                    asalOlmayanSayilar+= String.valueOf(sayi)+" ";
                    asalMi=false;
                    break;
                }
            }
            if (asalMi) {
                asalToplam++;
                asalSayilar+=" "+sayi;
            }
        }
        System.out.println("ASAL BİLGİLERİ");
        System.out.println("Asal toplam= "+ asalToplam + " Asal Sayılar= "+ asalSayilar);
        System.out.println("***************************************************************");

        System.out.println("ASAL OLMAYAN BİLGİLERİ");
        System.out.println("Asal olmayan toplam= "+ asalOlmayanToplam + " Asal Olmayan Sayılar= "+ asalOlmayanSayilar);






    }
}
