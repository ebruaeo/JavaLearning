package Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodParameters {

    /*
Methods can have parameters, which they can use in their code.
The parameters are defined in the parentheses, and can be used like variables in the method.
For example, let's add a name String parameter to our welcome() function:
     */
  /*  static void welcome(String name) {
        System.out.println("Welcome, " + name);
    }*/
    //The method above takes a String called name as its parameter, which is used in the method.

    //TODO when calling the method, we need to pass it a value for the name parameter inside the parentheses:
    static void welcome(String name) {
        System.out.println("Welcome, " + name);
    }

    public static void main(String[] args) {
        welcome("James");
        welcome("Amy");
        isEvenOrOdd(5);
        isEvenOrOdd(4);
        ArrayList<String> ceAlınanDersler = new ArrayList<>(Arrays.asList("Mat-1", "Digital Design", "Computer Programming-1"));
        ArrayList<String> meAlınanDersler = new ArrayList<>(Arrays.asList("Mat-1", "Fizik-1", "Diferansiyel Denklemler"));

        printAvailableLectures(ceAlınanDersler);
        printAvailableLectures(meAlınanDersler);
    }
    //This way, we can call our method with different parameters and generate different results based on them.

    static void isEvenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }

    static void printAvailableLectures(ArrayList<String> lectures) {
        System.out.println("Alabileceğiniz dersler: " + lectures);
        System.out.println("Birden fazla ders seçilirse seçilen dersler virgül ile ayrılmak zorundadır.");
    }
}
