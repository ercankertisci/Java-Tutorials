package example4;

import java.util.Arrays;

public class DiziSiralama {
	public static void main(String[] args) {
		int[] sayilar = { 42, 15, 23, 8, 4 };

		System.out.println("Orijinal Dizi: " + Arrays.toString(sayilar));

		Arrays.sort(sayilar);

		System.out.println("Sıralanmış Dizi: " + Arrays.toString(sayilar));
	}
}