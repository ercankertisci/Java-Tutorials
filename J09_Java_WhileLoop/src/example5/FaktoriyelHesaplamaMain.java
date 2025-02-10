package example5;

import java.util.Scanner;

public class FaktoriyelHesaplamaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;

		while (sayi > 0) {
			faktoriyel *= sayi;
			sayi--;
		}

		System.out.println("Faktöriyel: " + faktoriyel);
	}
}