package _2homeworkRepetition;

import java.util.Random;
import java.util.Scanner;

public class spotify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd =new Random();

        System.out.println("Şarkı listesi: ");
        String list = sc.nextLine();
        int songsin1 = rd.nextInt(10);
        int songsin2 =rd.nextInt(15);
        int songsin3 = rd.nextInt(20);


        switch (list) {
            case "L1":
                System.out.println(songsin1 + "." + " song is playing.");
                break;
            case "L2":
                System.out.println(songsin2 + "." + " song is playing.");
                break;
            case "L3":
                System.out.println(songsin3 + "." + " song is playing.");
                break;
            default:
                System.out.println("There is no list.");
                break;
        }

//        if (list.equals("L1")) {
//            System.out.println(songsin1+"."+ " song is playing.");
//        } else if (list.equals("L2")) {
//            System.out.println(songsin2+"."+" song is playing.");
//        } else if (list.equals("L3")) {
//            System.out.println(songsin3 + "."+ " song is playing.");
//        } else
//            System.out.println("There is no list.");



    }
}
