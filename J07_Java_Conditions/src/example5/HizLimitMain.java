package example5;

import java.util.Scanner;

public class HizLimitMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen hızınızı giriniz:");
		int hiz = scanner.nextInt();

		if (hiz > 90) {
			System.out.println("Radara girdiniz!");

			if (hiz <= 120) {
				System.out.println("Para cezası: 120 TL");
			} else if (hiz <= 150) {
				System.out.println("Para cezası: 150 TL");
			} else if (hiz <= 180) {
				System.out.println("Para cezası: 180 TL");
			} else {
				System.out.println("Ehliyetinize el konuldu");
			}
		} else {
			System.out.println("Kurallara uyduğunuz için teşekkürler");
		}
	}
}