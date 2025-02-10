package example1;

import java.util.Scanner;

public class OgrenciNotMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir not değeri giriniz:");
		int not = scanner.nextInt();

		if (not < 50) {
			System.out.println("Başarısız");
		} else {
			System.out.println("Başarılı");
		}
	}
}