package Methods;

public class asalbulma {
    public static boolean asalBulma(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (asalBulma(i)) {
                System.out.println(i);
            }

        }
    }


}
