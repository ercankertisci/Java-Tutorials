package example6;

import java.util.Arrays;

public class DiziKarsilastirma {
	public static void main(String[] args) {
		int[] dizi1 = { 1, 2, 3 };
		int[] dizi2 = { 1, 2, 3 };
		int[] dizi3 = { 3, 2, 1 };

		System.out.println("Dizi1 ve Dizi2 eşit mi? " + Arrays.equals(dizi1, dizi2));
		System.out.println("Dizi1 ve Dizi3 eşit mi? " + Arrays.equals(dizi1, dizi3));
	}
}