package example2;

import java.util.Arrays;

public class Kopyalama2 {
	public static void main(String[] args) {
		int[] a1 = { 65, 21, 34, 14, 98, 11, 24 };
		int[] b1;

		System.out.print("Kopyalanacak olan dizi: ");
		for (int eleman : a1) {
			System.out.print(eleman + " ");
		}

		// 1. indisten 5. indise kadar kopyala
		b1 = Arrays.copyOfRange(a1, 1, 5);

		System.out.println("\nYeni oluşan dizi: ");
		for (int eleman : b1) {
			System.out.print(eleman + " ");
		}
	}
}