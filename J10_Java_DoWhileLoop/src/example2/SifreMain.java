package example2;

import java.util.Scanner;

public class SifreMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String dogruSifre = "12345";
		String girilenSifre;

		do {
			System.out.println("Şifrenizi giriniz:");
			girilenSifre = scanner.nextLine();

			if (!girilenSifre.equals(dogruSifre)) {
				System.out.println("Hatalı şifre, tekrar deneyin.");
			}
		} while (!girilenSifre.equals(dogruSifre));

		System.out.println("Başarıyla giriş yaptınız.");
	}
}
