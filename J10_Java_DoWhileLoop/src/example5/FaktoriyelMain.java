package example5;

import java.util.Scanner;

public class FaktoriyelMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;

		do {
			faktoriyel *= sayi;
			sayi--;
		} while (sayi > 0);

		System.out.println("Faktöriyel: " + faktoriyel);
	}
}