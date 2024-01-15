package Methods;

public class MethodsOverloading {
    public static void toplama(int a, int b, int c) {
        System.out.println("toplam: " + (a + b + c));
    }

    public static void toplama(int a, int b) {
        System.out.println("toplamları: " + (a + b));
    }

    public static void main(String[] args) {
        toplama(1, 2, 4);
        toplama(2, 4);
    }

}
