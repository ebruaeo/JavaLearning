package ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListRandomMonth {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList <String> monthList = new ArrayList<>(Arrays.asList("January" , "February" , "March", "April" , "May", "June", "July", "August" ,"September", "October", "November", "December"));

        System.out.println(monthList.get(random.nextInt(12)));

    }
}
