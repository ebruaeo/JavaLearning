package Methods;

public class PrimeNumbers {
    /* ! Create a method called "isPrime" that checks if a given integer is a prime number.
    ! Write a main method to test the "isPrime" method by checking various numbers.  */

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }


}
