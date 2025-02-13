package example7;

public class BasamakToplami {
    static int basamakToplami(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;
    }

    public static void main(String[] args) {
        int sayi = 12345;
        System.out.println("Basamak Toplamı: " + basamakToplami(sayi));
    }
}