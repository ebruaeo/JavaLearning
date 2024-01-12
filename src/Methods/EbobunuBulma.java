package Methods;

import java.util.Scanner;

public class EbobunuBulma {

    public static void ebobBulma(int a, int b) {
        int min = Math.min(a,b);
        int ebob = 1;
        for (int i = 1; i <= min ; i++) {
            if (a%i==0 && b%i==0) {
                ebob =i;
            }

        }

        System.out.println(ebob);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        ebobBulma(a,b);

    }


















}
