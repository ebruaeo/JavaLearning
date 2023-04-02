package topics;

public class TypeCasting {
    public static void main(String[] args) {
        // int -> double, double-> string, int -> string vs.

        // double -> int
        double d1 = 3.5;
        int i1 = (int) d1; // i1 3 değerini alır. 3.5'in noktadan sonrası atılır
        // Yukarıdaki örnek explicit casting örneğidir. Explicit Casting: bilgisayar kendisi anlayıp çeviremez, bizim söylememiz
        // gerekir.

        i1 = (int) (3.5 + 2.1);

        // double -> string
        double d2 = 5.5;
        String s1 = "" + d2;
        String s2 = String.valueOf(d2);

        i1 = (int) (d1 + d2);

        // int -> double
        int i2 = 3;
        double d3 = (double) i2; // her int bir double sayıdır. bu sebeple gereksiz casting.
        // Yukarıdaki örnek implicit casting örneğidir. Implicit casting: bilgisayar kendisi anlıyor ve dönüştürüyor.
        d3 = i2; // implicit casting


        // int -> string
        int i3 = 22;
        String s3 = "" + i3;
        String s4 = String.valueOf(i3);


        // String -> int
        // ** String'in sadece sayılardan oluşması ve tam sayı olması gerekiyor. yoksa hata verir
        String s5 = "123";
        int i5 = Integer.parseInt(s5);
        int i6 = Integer.valueOf(s5);


        // String -> double
        // ** String'in tam sayı ya da ondalıklı sayı olması gerekiyor. yoksa hata verir
        String s6 = "11.1";
        double d6 = Double.parseDouble(s6);
        double d7 = Double.valueOf(s6);

        String s7 = "222";
        double d8 = Double.parseDouble(s7);

        // Hatalı dönüşüm
//        d8 = Double.parseDouble("12a");

    }
}
