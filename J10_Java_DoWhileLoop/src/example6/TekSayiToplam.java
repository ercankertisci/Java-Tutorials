package example6;

import java.util.Scanner;

public class TekSayiToplam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayi;

		do {
			System.out.println("Bir sayı giriniz (çıkmak için çift sayı giriniz):");
			sayi = scanner.nextInt();

			if (sayi % 2 != 0) {
				toplam += sayi;
			}
		} while (sayi % 2 != 0);

		System.out.println("Tek sayıların toplamı: " + toplam);
	}
}