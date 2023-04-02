package ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class userSignUpArrayList {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> oldUsers = new ArrayList<>(Arrays.asList("eminokumus", "omerokumus", "pisipisi"));

        System.out.println("userName: ");
        String userName = scanner.nextLine();
        System.out.println("password: ");
        String password = scanner.nextLine();

        int r1 = random.nextInt(90);
        int r2 = random.nextInt(90);

        if (!oldUsers.contains(userName)) {
            if (password.length() >= 8) {
                System.out.println("Kullanıcı Oluşturuldu.");
            } else {
                System.out.println("Şifre en az 8 karakter olmalı");
            }
        } else {
            System.out.println("Kullanıcı adı zaten alınmış. ");
            System.out.println("Şunları deneyebilirsiniz");
            System.out.println(userName+r1);
            System.out.println(userName+r2);
        }










    }
}
