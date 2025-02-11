package example5;

import java.util.Scanner;

public class ToplamMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		int toplam = 0;

		for (int i = 1; i <= sayi; i++) {
			toplam += i;
		}

		System.out.println("Toplam: " + toplam);
	}
}