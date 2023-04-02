package topics;

public class Exercise {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int sayi4 = 7;

        // en büyüğü hangisi

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("sayi1 en büyüktür");
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("sayi2 en büyüktür");
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            System.out.println("sayi3 en büyüktür");
        }

        // çözüm 2
        int bıggest = 2; // dummy value
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            bıggest = sayi1;
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            bıggest = sayi2;
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            bıggest = sayi3;
        }
        System.out.println("en büyük sayı:" + bıggest);
        System.out.println("en büyük sayının 2 katı:" + bıggest * 2);

//        int score = 0;
//        if (goalOlduMu)
//            score++;

        // çözüm 3
        int araSonuc = Math.max(sayi1, sayi2);
        int enBuyuk = Math.max(araSonuc, sayi3);
        System.out.println("en büyük sayı:" + enBuyuk);


        // en büyük sayı bulma

        int s1 = 20;
        int s2 = 25;
        int s3 = 2;
        int s4 = 7;

        if (s1 > s2 && s1 > s3 && s1 > s4) {
            System.out.println("s1 en büyük sayıdır");
        } else if (s2 > s1 && s2 > s3 && s2 > s4) {
            System.out.println("s2 en büyüktür");
        } else if (s3 > s1 && s3 > s2 && s3 > s4) {
            System.out.println("s3 en büyüktür");
        } else
            System.out.println("s4 en büyüktür.");



    }


}
