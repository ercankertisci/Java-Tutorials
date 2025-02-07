package Example2;

public class NarrowingCastingMain {

	public static void main(String[] args) {
		double buyukSayi = 3.42d;
		int sayi = (int) buyukSayi; // Manuel dönüştürme: double to int

		System.out.println(buyukSayi); // Çıktı: 3.42
		System.out.println(sayi); // Çıktı: 3
	}

}
