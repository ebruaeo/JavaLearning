import topics.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCatalog {
    /*  Yazar-Kitap ismi-Tür
        menü: 1- kitap ödünç almak 2-kitap iade 3- çıkış
        kullanıcıdan input al
     */

    public static void main(String[] args) {
        ArrayList<String> library = getLibrary();
        printMenu();
        readInput();
        printBooks(library);
    }


    static ArrayList<String> getLibrary() {
        ArrayList<String> library = new ArrayList<>();
        library.add("Jane Austen - Pride and Prejudice - Romance");
        library.add("George Orwell - 1984 - Dystopian");
        library.add("J.K. Rowling - Harry Potter and the Sorcerer's Stone - Fantasy");
        library.add("Mark Twain - The Adventures of Huckleberry Finn - Adventure");
        library.add("Agatha Christie - Murder on the Orient Express - Mystery");
        library.add("F. Scott Fitzgerald - The Great Gatsby - Classic");
        library.add("William Golding - Lord of the Flies - Fiction");
        library.add("J.R.R. Tolkien - The Fellowship of the Ring - Fantasy");
        library.add("Harper Lee - To Kill a Mockingbird - Coming of Age");
        library.add("Leo Tolstoy - War and Peace - Historical Fiction");
        return library;
    }

    static void printMenu() {
        System.out.println("1- kitap ödünç almak");
        System.out.println("2- kitap iade");
        System.out.println("3- çıkış");
    }

    static String readInput() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
            System.out.println("Yanlış seçim");
            choice = scanner.nextLine();
        }
        return choice;
    }

    static void printBooks(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

}
