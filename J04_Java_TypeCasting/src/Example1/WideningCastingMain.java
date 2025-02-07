package Example1;

public class WideningCastingMain {

	public static void main(String[] args) {
		int sayi = 22;
		double buyukSayi = sayi; // Otomatik dönüştürme: int to double

		System.out.println(sayi); // Çıktı: 22
		System.out.println(buyukSayi); // Çıktı: 22.0
	}

}