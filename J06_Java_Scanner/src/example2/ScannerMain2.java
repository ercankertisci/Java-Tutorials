package example2;

import java.util.Scanner;

public class ScannerMain2 {

	public static void main(String[] args) {
		System.out.println("Lutfen birinci sayi giriniz");
		Scanner tara1 = new Scanner(System.in);
		int sayi1 = tara1.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz");
		int sayi2 = tara1.nextInt();
		System.out.println("Toplam=" + (sayi1 + sayi2));
	}

}