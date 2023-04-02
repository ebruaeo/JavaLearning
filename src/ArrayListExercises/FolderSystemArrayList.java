package ArrayListExercises;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FolderSystemArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> folders = new ArrayList<>();
        ArrayList<String> musics = new ArrayList<>();
        ArrayList<String> movies = new ArrayList<>();
        ArrayList<String> photos = new ArrayList<>();
        ArrayList<String> exts = new ArrayList<>();


        folders.add("musics");
        folders.add("movies");
        folders.add("photos");

        musics.add("music-1.mp3");
        musics.add("music-2.mp3");
        musics.add("music-3.mp3");

        movies.add("movie-1.mp4");
        movies.add("movie-2.mp4");

        photos.add("photo-1.jpg");
        photos.add("photo-2.jpg");

        exts.add(".jpg");
        exts.add(".mp3");
        exts.add(".mp4");

        System.out.println(folders);
        System.out.println(musics);
        System.out.println(movies);
        System.out.println(photos);
        System.out.println(exts);

        System.out.println("Welcome, choose what to do");
        System.out.println("1- Show folders");
        System.out.println("2- Open a folder");
        System.out.println("3- Add new folder");
        System.out.println("4- Exit");

        int firstChoice = Integer.parseInt(scanner.nextLine());

        if (firstChoice == 1) {
            System.out.println("Folders: " + folders);
        } else if (firstChoice == 2) {
            System.out.println("Enter folder name: ");
            String folderName = scanner.nextLine();

            if (!folders.contains(folderName)) {
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

                    if (musics.contains(fileName)) {
                        System.out.println(fileName + " opened. "); // çalışıyo
                    } else if (musics.contains(fileName + exts.get(1))) {
                        System.out.println(fileName + exts.get(1) + " opened.");
                    } else if (movies.contains(fileName)) {
                        System.out.println(fileName + " opened.");
                    } else if (movies.contains(fileName + exts.get(2))) {
                        System.out.println(fileName + exts.get(2) + " opened.");
                    } else if (photos.contains(fileName)) {
                        System.out.println(fileName + " opened.");
                    } else if (photos.contains(fileName + exts.get(0))) {
                        System.out.println(fileName + exts.get(0) + " opened.");
                    }
                } else if (secondChoice == 2) {
                    System.out.println("Enter a file name");
                    String fileToAdd = scanner.nextLine().toLowerCase();
                    if (folderName.equalsIgnoreCase("musics")) {
                        if (!fileToAdd.endsWith(exts.get(1))) {
                            fileToAdd += exts.get(1);
                        }
                        System.out.println(fileToAdd + " added.");
                        musics.add(fileToAdd);
                        System.out.println("Files: " + musics);
                    } else if (folderName.equalsIgnoreCase("movies")) {
                        if (!fileToAdd.endsWith(exts.get(2))) {
                            fileToAdd += exts.get(2);
                        }
                        System.out.println(fileToAdd + " added.");
                        movies.add(fileToAdd);
                        System.out.println("Files: " + movies);
                    } else if (folderName.equalsIgnoreCase("photos")) {
                        if (!fileToAdd.endsWith(exts.get(0))) {
                            fileToAdd += exts.get(0);
                        }
                        System.out.println(fileToAdd + " added.");
                        photos.add(fileToAdd);
                        System.out.println("Files: " + photos);
                    }
                } else if (secondChoice == 3) {
                    System.out.println("End of program");
                }
            }
        } else if (firstChoice == 3) {
            System.out.println("Enter folder name: ");
            String FolderToAdd = scanner.nextLine();
            System.out.println("The Folder " + FolderToAdd + " added.");
            folders.add(FolderToAdd);
            System.out.println("Folders: " + folders);
        } else if (firstChoice == 4) {
            System.out.println("End of program");
        }
    }
}