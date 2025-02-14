package example5;

import java.util.Arrays;

public class DiziArama {
	public static void main(String[] args) {
		int[] sayilar = { 3, 6, 9, 12, 15 };
		int aranan = 12;

		int sonuc = Arrays.binarySearch(sayilar, aranan);

		if (sonuc >= 0) {
			System.out.println("Eleman bulundu, İndis: " + sonuc);
		} else {
			System.out.println("Eleman bulunamadı.");
		}
	}
}