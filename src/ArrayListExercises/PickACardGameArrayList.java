package ArrayListExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PickACardGameArrayList {
    public static void main(String[] args) {
        //  Rastgele iskambil kartı seçen bir program yaz
        //      Kart isimleri: As, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
        // Kart sınıfları: Karo, Küpe, Sinek, Maça

        Random random = new Random();

        ArrayList<String> cardNames = new ArrayList<>(Arrays.asList("As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"));
        ArrayList<String> cardSymbol = new ArrayList<>(Arrays.asList("Karo", "Kupa", "Sinek", "Maça"));

        int randomCardNames = random.nextInt(cardNames.size());
        int randomCardSymbol = random.nextInt(cardSymbol.size());

        System.out.println(cardNames.get(randomCardNames)+cardSymbol.get(randomCardSymbol));
















    }
}
