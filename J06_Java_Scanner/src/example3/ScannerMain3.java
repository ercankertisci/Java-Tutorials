package example3;

import java.util.Scanner;

public class ScannerMain3 {

	public static void main(String[] args) {
		System.out.println("Lutfen isim giriniz");
		Scanner giris1 = new Scanner(System.in);
		String isim = giris1.nextLine();
		System.out.println("Lutfen soyadinizi giriniz");
		String soyad = giris1.nextLine();
		System.out.println("Lutfen yasinizi giriniz");
		int yas = giris1.nextInt();
		System.out.println("Adiniz:" + isim + " " + "Soyadiniz:" + soyad + " " + "Yasiniz:" + yas);
	}

}