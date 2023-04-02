package topics;

import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        Random rastgele = new Random();

        //Java'da bir random oluşturmak için ya bir maksimum değer belirlemelisiniz
        // ya da hiçbir değer vermeden rastgele bir sayı çekmesini söylemelisiniz.
        // Şu şekilde rastgele bir sayı çekebilirsiniz;

        int rastSayi = rastgele.nextInt(100);// 0-99 arası sayıları çeker
        System.out.println(rastSayi);
        //Burada yer alan 100 değerini kaldırarak rastgele bir sayı da çekebilirsiniz.
        //Ayrıca kodda yer alan nextInt() ifadesi yerine nextDouble() da kullanılabilir.
         double rastSayı = rastgele.nextDouble();

        //Eğer rastgele sayı alırken 0'dan değilde 1'den başlamasını ve 100 sayısının da dahil edilmesini istiyorsak;
        Random rastgele2 = new Random();
        int rastSayi2 = rastgele2.nextInt(100)+1;
        /*

        nextInt(b) -> [0, (b-1)] 0 dan başlayıp b-1'e kadar olan sayılar, 0 ve b-1 dahıl
        Örn; nextInt(10) -> [0, 9] -> 0, 1,2,3,4,5,6,7,8,9 bunlardan bı tanesı
            nextInt(24) -> [0, 23] -> [0, 24) -> 0 dahıl 24'e kadar, 24 dahıl değıl yanı hıçbır zaman 24 üretmez
            nextInt(100) -> [0, 99]

       nextInt(b) + k -> [k, b-1+k], k'dan başlayıo b-1+k'ya olan sayırlar, 0 ve b-1+k dahıl
                      -> [k, b+k)
       Örn;
            [3, 9] -> b = 9-3+1=7, k=3 -> nextInt(7) + 3
            [
         */

        //Belli bi aralıktaki sayıları bulmak için = Max sayı - Min sayı +1

        //ÖRNEKLE
        //3 ile 10 arasında rastgele sayı (3 ve 10 dahil) almak istiyoruz: 10-3+1=8

        int rastSayi3= rastgele.nextInt(8)+3;

        //100 ile 110 arasında rastgele sayı (100 ve 110 dahil) almak istiyoruz: 110-100+1=11
        int rastSayi4 = rastgele.nextInt(11)+100;

        // 3, 12 12-3+1=10,
        // 12-3=9 -> 12'ye kadar max sayıyı dahil etmek istemiyorsak +1 eklemiyoruz.
        int r1=rastgele.nextInt(10)+3;
        int r2=rastgele.nextInt(9)+3;

        // 34 ile 42 arasındaki 42 dahil değil.
        int r3 =rastgele.nextInt(8)+34;

        //21 ile 29 arasında 29 dahil.
        int r4 =rastgele.nextInt(9)+21;

        // -5 ile 5 arasında 5 dahil değil.
        int r5 = rastgele.nextInt(10)-5;


















    }
}
