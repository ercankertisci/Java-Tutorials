package example2;

import java.util.Scanner;

public class SayiToplamMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int toplam = 0;

		System.out.println("Sayıları girin (çıkmak için 0 girin):");
		int sayi = scanner.nextInt();

		while (sayi != 0) {
			toplam += sayi;
			System.out.println("Sayıları girin (çıkmak için 0 girin):");
			sayi = scanner.nextInt();
		}

		System.out.println("Toplam: " + toplam);
	}
}