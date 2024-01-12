package Loops;

public class Break_Continue {

    public static void main(String[] args) {

        // BREAK

        int sayiyiBuldunMu;
        for (int i = 1; i<=10; i++ ) {
            if (i==4) {
                sayiyiBuldunMu=i;
                break; // DÖNGÜYÜ KIR
            }
        }
        System.out.println("kjhgfd");









        // CONTINUE
        // Döngüyü sadece 1 kereye mahsus kırar
        // 1 2 3 4 5 6 - - 9 10

        for (int i2 = 1; i2<=10; i2++ ) {
           if (i2 == 7 || i2 == 8 ) {
               continue;
           }   System.out.println(i2);
        }






    }
}
