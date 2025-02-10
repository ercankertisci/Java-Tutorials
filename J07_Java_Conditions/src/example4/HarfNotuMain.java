package example4;

import java.util.Scanner;

public class HarfNotuMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir not değeri giriniz:");
		int not = scanner.nextInt();

		if (not >= 90) {
			System.out.println("Harf notu: A");
		} else if (not >= 80) {
			System.out.println("Harf notu: B");
		} else if (not >= 70) {
			System.out.println("Harf notu: C");
		} else if (not >= 60) {
			System.out.println("Harf notu: D");
		} else {
			System.out.println("Harf notu: F");
		}
	}
}