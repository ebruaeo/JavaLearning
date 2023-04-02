package ArrayListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class FindFutureDatesArrayList {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<String> daysOfWeek = new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

        System.out.println("What day is it today?");
        String dayOfToday = scanner.nextLine().toLowerCase();

        int indexOfToday = daysOfWeek.indexOf(dayOfToday);

        System.out.println("How many days?");
        int DaysLater = Integer.parseInt(scanner.nextLine());

        int futureDate = (indexOfToday+DaysLater)%7;

        System.out.println(daysOfWeek.get(futureDate));

        switch (futureDate) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
        }

    }
}
