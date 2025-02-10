package example1;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		System.out.println("Lutfen bir sayi giriniz");
		Scanner tara = new Scanner(System.in);
		int sayi = tara.nextInt();
		System.out.println("Girmiş olduğunuz sayi: " + sayi);
	}

}