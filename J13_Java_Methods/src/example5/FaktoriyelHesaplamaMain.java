package example5;

import java.util.Scanner;

public class FaktoriyelHesaplamaMain {
    static long faktoriyel(int sayi) {
        long carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        return carpim;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();

        long sonuc = faktoriyel(sayi);
        System.out.println("Faktöriyel: " + sonuc);
    }
}