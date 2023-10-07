package ArraysExercises;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {


        /** 1-den 5'e kadar olan sayıları tersten yazma */
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }
        /** 1 ile 100 arasında olan rastgele sayılardan oluşan 10 elemanlı Array oluşturma */

//        Random random = new Random();
//
//        int [] numbers = new int[10];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int randomNumber = random.nextInt(100);
//            numbers[i] = randomNumber;
//            System.out.println(numbers [i]);
//        }

        /** Kullanıcının belirttiği aralıkta olan rastgele sayılardan oluşan ve kullanıcının belirttiği kadar eleman sayılı Array oluşturma */
//
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("Dizi kaç elemanlı olsun: ");
//        int diziUzunluk = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Sayılar kaçtan başlasın ");
//        int başlangıc= Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Sayılar kaça kadar devam etsin ");
//        int son = Integer.parseInt(scanner.nextLine());
//
//        int [] numbers = new int[diziUzunluk];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int randomNumber = random.nextInt(son-başlangıc)+başlangıc;
//            numbers[i] = randomNumber;
//            System.out.println(numbers[i]);
//        }

        /** Verilen bir Array içerisindeki istenilen elemanı bul */

        Scanner scanner = new Scanner(System.in);

        String[] cities = {"new york", "rome", "istanbul", "london", "las vegas"};

        System.out.println("Enter city name: ");
        String cityinput = scanner.nextLine();
        //  int index = -1;
        boolean isFound = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(cityinput)) {
                // index = i;
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


    //        (Reverse the numbers entered) Write a program that reads ten integers and displays
    //        them in the reverse of the order in which they were read.
}
