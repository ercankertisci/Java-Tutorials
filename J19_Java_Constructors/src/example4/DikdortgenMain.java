package example4;

public class DikdortgenMain {

	public static void main(String[] args) {
		Dikdortgen dik1 = new Dikdortgen(); // Parametresiz constructor
		Dikdortgen dik2 = new Dikdortgen(5, 8); // Parametreli constructor

		System.out.println("Dikdörtgen 1 Alanı: " + dik1.alanHesapla());
		System.out.println("Dikdörtgen 2 Alanı: " + dik2.alanHesapla());
	}
}