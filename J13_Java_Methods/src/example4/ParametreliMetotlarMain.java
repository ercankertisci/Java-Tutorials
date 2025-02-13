package example4;

public class ParametreliMetotlarMain {
    static void topla(int a, int b) {
        System.out.println("Toplama Sonucu: " + (a + b));
    }

    static void cikarma(int a, int b) {
        System.out.println("Çıkarma Sonucu: " + (a - b));
    }

    static void carpma(int a, int b) {
        System.out.println("Çarpma Sonucu: " + (a * b));
    }

    static void bolme(int a, int b) {
        System.out.println("Bölme Sonucu: " + (a / b));
    }

    public static void main(String[] args) {
        topla(5, 10);
        cikarma(15, 5);
        carpma(3, 7);
        bolme(20, 4);
    }
}