package Methods;

import java.util.Scanner;

public class ExerciseStringManipulation {


    //    Create a method called "reverseString" that takes a String as input and returns the reverse of that String.
    //    Write a main method to test the "reverseString" method by passing various strings.



        static  String reverseString(String s) {

                String r = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                        r += s.charAt(i);
                }

                return r;
        }


        public static void main(String[] args) {

                System.out.println(reverseString("1234"));
        }
        }






















