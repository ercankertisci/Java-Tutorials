package example3;

import java.util.Scanner;

public class SayiKarsilastirmaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen birinci sayıyı giriniz:");
		int sayi1 = scanner.nextInt();

		System.out.println("Lütfen ikinci sayıyı giriniz:");
		int sayi2 = scanner.nextInt();

		if (sayi1 == sayi2) {
			System.out.println("Sayılar eşittir");
		} else if (sayi1 < sayi2) {
			System.out.println("İkinci sayı büyüktür");
		} else {
			System.out.println("Birinci sayı büyüktür");
		}
	}
}