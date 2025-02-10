package example3;

import java.util.Scanner;

public class HarfNotuMain {

	public static void main(String[] args) {
		System.out.println("Lütfen bir not değeri giriniz:");
		Scanner scanner = new Scanner(System.in);
		int not = scanner.nextInt();

		switch (not / 10) {
		case 10:
		case 9:
			System.out.println("Harf notu: AA");
			break;
		case 8:
			System.out.println("Harf notu: BA");
			break;
		case 7:
			System.out.println("Harf notu: BB");
			break;
		case 6:
			System.out.println("Harf notu: CB");
			break;
		case 5:
			System.out.println("Harf notu: CC");
			break;
		case 4:
			System.out.println("Harf notu: DC");
			break;
		default:
			System.out.println("Harf notu: FF");
		}
	}
}