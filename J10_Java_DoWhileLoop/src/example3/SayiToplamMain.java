package example3;

import java.util.Scanner;

public class SayiToplamMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayi;

		do {
			System.out.println("Bir sayı giriniz (çıkmak için 0 giriniz):");
			sayi = scanner.nextInt();
			toplam += sayi;
		} while (sayi != 0);

		System.out.println("Toplam: " + toplam);
	}
}