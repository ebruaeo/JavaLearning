package topics;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListWorks {
    public static void main(String[] args) {
        // 1- ArrayList tanımlama ve oluştuma
        ArrayList<String> cities = new ArrayList<>();


        // 2- ArrayList içine eleman eklemek/koymak
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Boston");

        // 3- ArrayList'i ekrana basma
        System.out.println(cities);

        // 4- ArrayList içerisinden index ile eleman almak
        System.out.println(cities.get(1));
        String city = cities.get(2);
        System.out.println("city at index 2: " + city);

        /** OutOfBoundException mevcut */

        // 5.1- Herhangi bir index' eleman eklemek/koymak
        cities.add(1, "Las Vegas");
        System.out.println(cities);

        // 5.2- Herhangi bir index'teki elemanı değiştirmek
        cities.set(1, "Washington");
        System.out.println("index 1 is replaced: " + cities);

        // 6- index ile Eleman silmek
        cities.remove(2);
        System.out.println(cities);

        // 7.1- Objenin kendisi ile eleman silmek
        cities.remove("Las Vegas");
        System.out.println(cities);

        // 8- ArrayList'in boş olduğunu kontrol etmek
        System.out.println("is cities list empty? " + cities.isEmpty());

        // 9- ArrayList'teki eleman sayısını almak
        System.out.println("city count: " + cities.size());

        // 10.1- Bir elemanın indexini bulmak (Aynı elemandan birden fazla varsa ilkini verir)
        System.out.println("Boston index: " + cities.indexOf("Boston"));

        // 10.2- last index of
        cities.add("New York");
        System.out.println(cities);
        System.out.println("Last index of New York: " + cities.lastIndexOf("New York"));

        // 11- Bir elemanın var olup olmadığını kontrol etmek
        System.out.println("is Portland in cities list? " + cities.contains("Portland"));
        System.out.println("is New York in cities list? " + cities.contains("New York"));

        // 12- Tüm elemanları silmek
        cities.clear();
        System.out.println(cities);

        // 13- addAll


        // 14- removeAll


        // 15- containsAll

        /** 2D ArrayList */
//        ArrayList<String> cities = new ArrayList<>();
        ArrayList<ArrayList<String>> brandTable = new ArrayList<>();
        ArrayList<String> row0 = new ArrayList<>(Arrays.asList("Armani", "VS", "Sephora"));
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("Gratis", "Watsons", "Rossman"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("Starbucks", "Carribou", "Gloria"));

        brandTable.add(row0);
        brandTable.add(row1);
        brandTable.add(row2);

        System.out.println("Brand Table: \n" + brandTable);
        System.out.println("Row 0: " + brandTable.get(0));
        System.out.println("Row 1: " + brandTable.get(1));
        System.out.println("Row 2: " + brandTable.get(2));

        System.out.println("Brand table element [1,1]: " + brandTable.get(1).get(1));
        System.out.println("Brand table element [0,0]: " + brandTable.get(0).get(0));


        System.out.println();
        ArrayList<String> brands = new ArrayList<>(Arrays.asList("Armani", "VS", "Sephora"));

        System.out.println("Brand table contains " + brands);
        System.out.println(brandTable.contains(brands));

        ArrayList<ArrayList<String>> userTable = new ArrayList<>();
        ArrayList<String> user0 = new ArrayList<>(Arrays.asList("omerokumus", "qwaszx"));
        ArrayList<String> user1 = new ArrayList<>(Arrays.asList("nüübmuh", "123456"));
        ArrayList<String> user2 = new ArrayList<>(Arrays.asList("ebruaeo", "pisipisi"));

        userTable.add(user0);
        userTable.add(user1);
        userTable.add(user2);

        String userName = "omerokumus";
        String password = "qwaszx";
        ArrayList<String> user = new ArrayList<>(Arrays.asList(userName, password));
        if (userTable.contains(user)) {
            System.out.println("User Table contains " + user);
        }

        // 2D ArrayList - indexOf
        System.out.println("index of " + user + ": " + userTable.indexOf(user));


        // clone: ArrayList'in aynısını üretmek istiyorsan clone kullan
        ArrayList<String> userClone = (ArrayList<String>) user.clone();
        System.out.println("user: " + user);
        System.out.println("userClone: " + userClone);


        ArrayList<String> passcode = new ArrayList<>(Arrays.asList("a", "B", "C", "2", "1", "c"));
        Random random = new Random();
        int index = random.nextInt(passcode.size());

        String shuffled = passcode.get(index);
        passcode.remove(index);

        System.out.println(shuffled);
    }
}
