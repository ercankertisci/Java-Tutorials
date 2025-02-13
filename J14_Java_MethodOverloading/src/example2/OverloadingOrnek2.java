package example2;

public class OverloadingOrnek2 {
    static void yazdir(int sayi) {
        System.out.println("Integer değer: " + sayi);
    }

    static void yazdir(String metin) {
        System.out.println("String değer: " + metin);
    }

    public static void main(String[] args) {
        yazdir(42);
        yazdir("Java Metot Overloading");
    }
}