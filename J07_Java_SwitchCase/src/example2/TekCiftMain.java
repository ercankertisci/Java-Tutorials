package example2;

import java.util.Scanner;

public class TekCiftMain {

	public static void main(String[] args) {
		System.out.println("Bir değer giriniz:");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();

		switch (sayi) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Sayı tektir");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("Sayı çifttir");
			break;
		default:
			System.out.println("Lütfen 1 ile 10 arasında bir değer giriniz.");
		}
	}
}