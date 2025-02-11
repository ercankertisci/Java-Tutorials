package example3;

import java.util.Scanner;

public class FaktoriyelMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}

		System.out.println("Faktöriyel: " + faktoriyel);
	}
}