package example1;

import java.util.Arrays;

public class Kopyalama {
	public static void main(String[] args) {
		String[] a1 = { "kadikoy", "uskudar", "besiktas", "istanbul", "turkiye" };
		String[] b1;

		System.out.print("Kopyalanacak olan dizi: ");
		for (String eleman : a1) {
			System.out.print(eleman + " ");
		}

		// İlk iki elemanı kopyala
		b1 = Arrays.copyOf(a1, 2);

		System.out.print("\nYeni oluşan dizi: ");
		for (String eleman : b1) {
			System.out.print(eleman + " ");
		}
	}
}