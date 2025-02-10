package example1;

import java.util.Scanner;

public class SayiSwitchCaseMain {

	public static void main(String[] args) {
		System.out.println("Lütfen 1-10 arasında bir değer giriniz:");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("Sayı 1'dir");
			break;
		case 2:
			System.out.println("Sayı 2'dir");
			break;
		case 3:
			System.out.println("Sayı 3'dir");
			break;
		case 4:
			System.out.println("Sayı 4'dir");
			break;
		case 5:
			System.out.println("Sayı 5'dir");
			break;
		case 6:
			System.out.println("Sayı 6'dir");
			break;
		case 7:
			System.out.println("Sayı 7'dir");
			break;
		case 8:
			System.out.println("Sayı 8'dir");
			break;
		case 9:
			System.out.println("Sayı 9'dir");
			break;
		case 10:
			System.out.println("Sayı 10'dur");
			break;
		default:
			System.out.println("Lütfen 1 ile 10 arasında bir değer giriniz.");
		}
	}
}