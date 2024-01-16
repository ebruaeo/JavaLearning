package Methods;

import java.util.Scanner;

public class PalindromeChecker {
    /* ? Create a method called "isPalindrome" that takes a user-inputted string and
    ?checks if it's a palindrome (reads the same forwards and backwards).
    ?Display the result to the user. */


    static boolean isPalindrome(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.nextLine()));
    }


}
