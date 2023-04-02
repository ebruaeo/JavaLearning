package ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserLogInArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> userNameList = new ArrayList<>(
//                Arrays.asList()
        );
        ArrayList<String> passwordList = new ArrayList<>();

        userNameList.add("omerokumus");
        userNameList.add("eminokumus");
        userNameList.add("ebruaeo");
        userNameList.add("ebruaeo1");
        userNameList.add("ebruaeo2");
        userNameList.add("ebruaeo3");

        passwordList.add("12345");
        passwordList.add("qwaszx");
        passwordList.add("qwerty");
        passwordList.add("qwerty1");
        passwordList.add("qwerty2");
        passwordList.add("qwerty3");

        System.out.println(userNameList);
        System.out.println(passwordList);


        System.out.println("Kullanıcı adınız: ");
        String userName = sc.nextLine();
        System.out.println("Şifreniz: ");
        String password = sc.nextLine();


        if (userNameList.contains(userName)) {
            if (passwordList.get(userNameList.indexOf(userName)).equals(password)) {
                System.out.println("Welcome " + userName);
            } else {
                System.out.println("Password is incorrect.");
            }
        } else {
            System.out.println("User name is incorrect.");
        }


//        if (userName.equals(userNameList.get(0)) && password.equals(passwordList.get(0))) {
//            System.out.println("Welcome " + userNameList.get(0));
//        } else if (userName.equals(userNameList.get(1)) && password.equals(passwordList.get(1))) {
//            System.out.println("Welcome " + userNameList.get(1));
//        } else if (userName.equals(userNameList.get(2)) && password.equals(passwordList.get(2))) {
//            System.out.println("Welcome " + userNameList.get(2));
//        } else if (!userNameList.contains(userName)) {
//            System.out.println("User name is incorrect.");
//        } else if (!passwordList.contains(password)) {
//            System.out.println("Password is incorrect. ");
//
//        }


    }
}
