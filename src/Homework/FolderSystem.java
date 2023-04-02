package Homework;

import java.util.Scanner;

public class FolderSystem {
    public static void main(String[] args) {
        /*- Klasör Sistemi
        Bir bilgisayarda 3 tane klasör var. Klasör isimleri Müzikler, Filmler, Fotoğraflar.
        Müzikler klasöründe müzik-1.mp3, müzik-2.mp3, müzik-3.mp3;
        Filmler klasöründe film-1.mp4, film-2.mp4;
        Fotoğraflar klasöründe foto-1.jpg, foto-2.jpg şeklinde dosyalar mevcut. Dosya isimlerindeki .mp3, .mp4, ve .jpg uzantı olarak isimlendirilir.

        Bir program yaz. Kullanıcıya aşağıdaki gibi bir menü sun
            Hoşgeldiniz, lütfen ne yapmak istediğinizi belirtin;
            1- Var olan klasörleri göster
            2- Herhangi bir klasörü aç
            3- Yeni klasör ekle
            4- Çıkış
        Kullanıcı 1 girerse ekrana
            Var olan klasörler: Müzikler, Filmler, Fotoğraflar şeklinde yaz. +++++
        Kullanıcı 2 girerse açmak istediği klasör adını case-insensitive olarak iste. ++++++++
        Yanlış bir klasör adı girerse "Böyle bir klasör bulunmamaktadır" şeklinde ekrana yazıp programı sonlandır. +++++++++++++
        Doğru bir klasör adı girerse "<Klasör adı> açıldı" diye ekrana yazıp aşağıdaki gibi bir menü sun ++++++++++
            Ne yapmak istersiniz?
            1- Dosya aç
            2- Dosya ekle
            3- Çıkış

            Kullanıcı burada 1 girerse açmak istediği dosyanın adını case-insensitive olarak iste. +
            Dosya adı uzantılı da olabilir uzantısız da. Örn; foto-1.jpg ya da foto-1 +
            Yanlış dosya adı girerse "Böyle bir dosya bulunmamaktadır" diye ekrana yazdırıp programı sonlandır +
            Doğru dosya adı girerse "<Dosya adı> açıldı." diye ekrana bastır. Dosya adı uzantıyla birlikte yazılmalı. +
             Örn; kullanıcı dosya adı için foto-1 yazdı ama ekrana "foto-1.jpg açıldı" şeklinde yazmalı

            Kullanıcı burada 2 girerse eklemek istediği dosya adını case-insensitive olarak iste.+
            Dosya adı uzantılı da olabilir uzantısız da. Örn; foto-3.jpg ya da foto-3+
            Ardından "<Dosya adı> eklendi. Var olan dosyalar; <Dosya isimleri>" şeklinde ekrana yazdır.+
            Örn; "foto-3.jpg eklendi. Var olan dosyalar; foto-1.jpg, foto-2.jpg, foto-3.jpg". Dosya isimleri uzantılarıyla birlikte yazılmalı+ 

            Kullanıcı burada 3 girerse. "Program sonlandırılıyor." yazıp programı sonlandır +

        Kullanıcı 3 girerse eklemek istediği klasör adını case-sensitive olarak iste ve ekrana "<klasör adı> klasörü eklendi.
        Var olan klasörler: <Klasör adları>. Örn; kullanıcı "sesler" yazarsa "sesler klasörü eklendi. Var olan klasörler: Müzikler, Filmler, Fotoğraflar, sesler"+
        Kullanıcı 4 girerse "Program sonlandırılıyor." diye yazıp programı sonlandır+

         */
        Scanner scanner = new Scanner(System.in);
        String musicsFolder = "Musics";
        String moviesFolder = "Movies";
        String photosFolder = "Photos";

        String music1 = "music-1.mp3", music2 = "music-2.mp3", music3 = "music-3.mp3";
        String movie1 = "movie-1.mp4", movie2 = "movie-2.mp4";
        String photo1 = "photo-1.jpg", photo2 = "photo-2.jpg";

        String mp3 = ".mp3";
        String jpg = ".jpg";
        String mp4 = ".mp4";

        System.out.println("Welcome, choose what to do");
        System.out.println("1- Show folders");
        System.out.println("2- Open a folder");
        System.out.println("3- Add new folder");
        System.out.println("4- Exit");

        int firstChoice = Integer.parseInt(scanner.nextLine());

        if (firstChoice == 1) {
            System.out.println("Folders: " + moviesFolder + " " + musicsFolder + " " + photosFolder);
        } else if (firstChoice == 2) {
            System.out.println("Enter folder name: ");
            String folderName = scanner.nextLine();

            if (!folderName.equalsIgnoreCase("musics") && !folderName.equalsIgnoreCase("movies") && !folderName.equalsIgnoreCase("photos")) {
                System.out.println("No folder");
            } else {
                System.out.println(folderName.toLowerCase() + " folder is opened.");
                System.out.println("What do you want to do?");
                System.out.println("1- Open file");
                System.out.println("2- Add new file");
                System.out.println("3- Exit");

                int secondChoice = Integer.parseInt(scanner.nextLine());

                if (secondChoice == 1) {
                    System.out.println("File name: ");
                    String fileName = scanner.nextLine().toLowerCase();


                    if (fileName.equals(movie1) || fileName.equals(movie2) ||
                            fileName.equals(music1) || fileName.equals(music2) || fileName.equals(music3) ||
                            fileName.equals(photo1) || fileName.equals(photo2)) {
                        System.out.println("File name: " + fileName);
                    } else if (fileName.equals("movie-1") || fileName.equals("movie-2")) {
                        System.out.println("File name: " + fileName + mp4);
                    } else if (fileName.equals("music-1") || fileName.equals("music-2") || fileName.equals("music-3")) {
                        System.out.println("File name: " + fileName + mp3);
                    } else if (fileName.equals("photo-1") || fileName.equals("photo-2")) {
                        System.out.println("File name: " + fileName + jpg);
                    } else {
                        System.out.println("File cannot found.");
                    }

                } else if (secondChoice == 2) {
                    System.out.println("Enter a file name");
                    String fileToAdd = scanner.nextLine().toLowerCase();
//                    if (folderName.equalsIgnoreCase(musicsFolder)) {
//                        if (!fileToAdd.endsWith(mp3)){
//                            fileToAdd += mp3;
//                        }
//                        System.out.println(fileToAdd + " added.");
//                        System.out.println("files: " + fileToAdd + " " + music1 + " " + music2 + " " + music3);
//                    } else if (folderName.equalsIgnoreCase(moviesFolder)) {
//                        if (!fileToAdd.endsWith(mp4)){
//                            fileToAdd += mp4;
//                        }
//                        System.out.println(fileToAdd + " added.");
//                        System.out.println("Files: " + fileToAdd + " " + movie1 + " " + movie2);
//                    } else {
//                        if (!fileToAdd.endsWith(jpg)){
//                            fileToAdd += jpg;
//                        }
//                        System.out.println(fileToAdd + " added.");
//                        System.out.println("Files: " + fileToAdd + " " + photo1 + " " + photo2);
//                    }


                    if (folderName.equalsIgnoreCase(musicsFolder) && !fileToAdd.endsWith(mp3)) {
                        System.out.println(fileToAdd + mp3 + " added.");
                        System.out.println("files: " + fileToAdd + mp3 + " " + music1 + " " + music2 + " " + music3);
                    } else if (folderName.equalsIgnoreCase(musicsFolder) && fileToAdd.endsWith(mp3)) {
                        System.out.println(fileToAdd + " added.");
                        System.out.println("files: " + fileToAdd + " " + music1 + " " + music2 + " " + music3);
                    } else if (folderName.equalsIgnoreCase(moviesFolder) && !fileToAdd.endsWith(mp4)) {
                        System.out.println(fileToAdd + mp4 + " added.");
                        System.out.println("Files: " + fileToAdd + mp4 + " " + movie1 + " " + movie2);
                    } else if (folderName.equalsIgnoreCase(moviesFolder) && fileToAdd.endsWith(mp4)) {
                        System.out.println(fileToAdd + " added.");
                        System.out.println("Files: " + fileToAdd + " " + movie1 + " " + movie2);
                    } else if (folderName.equalsIgnoreCase(photosFolder) && !fileToAdd.endsWith(jpg)) {
                        System.out.println(fileToAdd + jpg + " added.");
                        System.out.println("Files: " + fileToAdd + jpg + " " + photo1 + " " + photo2);
                    } else if (folderName.equalsIgnoreCase(photosFolder) && fileToAdd.endsWith(jpg)) {
                        System.out.println(fileToAdd + " added.");
                        System.out.println("Files: " + fileToAdd + " " + photo1 + " " + photo2);
                    }
                } else if (secondChoice == 3) {
                    System.out.println("End of program");
                }
            }
        } else if (firstChoice == 3) {
            System.out.println("Enter folder name: ");
            String f3 = scanner.nextLine();
            System.out.println(f3 + " added. ");
            System.out.println("Folders: " + musicsFolder + " " + moviesFolder + " " + photosFolder + " " + f3);
        } else if (firstChoice == 4) {
            System.out.println("End of program");
        }


    }
}
