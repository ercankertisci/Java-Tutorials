package example7;

import java.util.Arrays;

public class DiziSiralama {
	public static void main(String[] args) {
		int[] sayilar = { 42, 12, 7, 19, 35 };
		Arrays.sort(sayilar);

		for (int sayi : sayilar) {
			System.out.println(sayi);
		}
	}
}