package DöngülerExercises;

import java.util.Scanner;

public class Converting {
    public static void main(String[] args) {

//        Kullanıcıdan celcius değerini al ve fahrenheit'a çevir. Kullanıcı "q" inputu girerse "Program sonlandırılıyor..." diye ekrana yazıp programı sonlandır.
//        "q" inputu girmezse program çalışmaya devam etsin.

        // fahrenheit celciusa çevirme
//        double celsius = 40.4;
//        double fahrenheit = (9.0 / 5) * celsius + 32;
//        System.out.println(celsius + " celsius " + fahrenheit);

//        Örn-1;
//        in: celcius: 100
//        out: fahrenheit: 212
//        in: celcius: q
//        out: Program sonlandırılıyor...
//
//        Örn-2;
//        in: celcius: 100
//        out: fahrenheit: 212
//        in: celcius: 10
//        out: fahrenheit: 50
//        in: celcius: q
//        out: Program sonlandırılıyor...

//        System.out.println("celcius: ");
//        String celciusString = scanner.nextLine();
//        while (!celciusString.equals("q")) {
//            double celcius = Double.parseDouble(celciusString);
//            double fahrenheit = (9.0 / 5) * celcius +32;
//            System.out.println(celcius+ " celcius = " + fahrenheit + " fahrenheit");
//            System.out.println("celcius: ");
//            celciusString = scanner.nextLine();
//        }
//        System.out.println("Program sonlandırılıyor.");

        Scanner scanner = new Scanner(System.in);
//        String celciusString;
//        do {
//            System.out.println("celcius: ");
//            celciusString = scanner.nextLine();
//            if (celciusString.equals("q")) {
//                break;
//            } else {
//                double celcius = Double.parseDouble(celciusString);
//                double fahrenheit = (9.0 / 5) * celcius + 32;
//                System.out.println(celcius + " celcius = " + fahrenheit + " fahrenheit");
//            }
//        } while (true);
//        System.out.println("Program sonlandırılıyor.");


        System.out.println("celcius: ");
        for (String celciusString = scanner.nextLine(); !celciusString.equals("q"); celciusString = scanner.nextLine()) {
            double celcius = Double.parseDouble(celciusString);
            double fahrenheit = (9.0 / 5) * celcius + 32;
            System.out.println(celcius + " celcius = " + fahrenheit + " fahrenheit");
            System.out.println("celcius: ");
        }
        System.out.println("Program sonlandırılıyor.");


    }
}
