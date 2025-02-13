package example1;

public class OverloadingOrnek1 {
    static void toplama(int a, int b) {
        System.out.println("Toplam (2 parametre): " + (a + b));
    }

    static void toplama(int a, int b, int c) {
        System.out.println("Toplam (3 parametre): " + (a + b + c));
    }

    public static void main(String[] args) {
        toplama(5, 10);
        toplama(5, 10, 15);
    }
}