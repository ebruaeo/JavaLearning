package Methods;

public class isEven {
    /* !Write a Java method called "isEven" that takes an integer as a parameter and returns true if it's even and false if it's odd.
    ! Write a main method to test the "isEven" method with different integers. */

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
    }


}
