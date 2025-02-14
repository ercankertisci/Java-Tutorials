package example3;

import java.util.Arrays;

public class Doldurma {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] b1 = { 6, 7, 8, 9, 10 };

		// a1 dizisinin tamamını 1 ile doldur
		Arrays.fill(a1, 1);

		// b1 dizisinin 1. indisten 3. indise kadar olan elemanlarını 0 yap
		Arrays.fill(b1, 1, 3, 0);

		System.out.println("Eleman doldurduğumuz ilk dizi: ");
		for (int eleman : a1) {
			System.out.print(eleman + " ");
		}

		System.out.println("\nEleman doldurduğumuz ikinci dizi: ");
		for (int eleman : b1) {
			System.out.print(eleman + " ");
		}
	}
}