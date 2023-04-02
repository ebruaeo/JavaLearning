package ArrayListExercises;

import java.util.*;

public class SpotifyArrayList {
    public static void main(String[] args) {
        ArrayList<String> listeler = new ArrayList<>(Arrays.asList("relaxing", "girls night", "to my love"));
        ArrayList<String> relaxing = new ArrayList<>(Arrays.asList("Look After You", "Skin", "All The Wine"));
        ArrayList<String> girlsNight = new ArrayList<>(Arrays.asList("Bad Habits", "Thats What I Want", "Money", "Run", "Good 4 You"));
        ArrayList<String> toMyLove = new ArrayList<>(Arrays.asList("Perfect", "You Are The Reason", "Until I Found You", "Safe And Sound"));
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Çalma listeleri: " + listeler);

        System.out.println("Çalma listesi giriniz: ");
        String calmaListesi = scanner.nextLine().toLowerCase();


        if (calmaListesi.equals(listeler.get(0))) {
            int songsRelaxing = random.nextInt(relaxing.size());
            System.out.println(relaxing.get(songsRelaxing) + " çalınıyor. ");
        } else if (calmaListesi.equals(listeler.get(1))) {
            int songsGirlsNight = random.nextInt(girlsNight.size());
            System.out.println(girlsNight.get(songsGirlsNight));
        } else if (calmaListesi.equals(listeler.get(2))) {
            int songsToMyLove = random.nextInt(toMyLove.size());
            System.out.println(toMyLove.get(songsToMyLove));
        } else {
            System.out.println("Böyle bir çalma listesi bulunmamaktadır.");
        }

    }
}
