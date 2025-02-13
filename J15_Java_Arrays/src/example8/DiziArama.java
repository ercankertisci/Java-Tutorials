package example8;

import java.util.Arrays;

public class DiziArama {
	public static void main(String[] args) {
		int[] sayilar = { 11, 3, 7, 15, 19 };
		Arrays.sort(sayilar); // Önce sıralıyoruz
		int sonuc = Arrays.binarySearch(sayilar, 15);

		if (sonuc >= 0) {
			System.out.println("Bulundu, İndis: " + sonuc);
		} else {
			System.out.println("Bulunamadı");
		}
	}
}
