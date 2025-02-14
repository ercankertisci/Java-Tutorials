package example1;

public class ArabaMain {

	public static void main(String[] args) {

		// Araba sınıfından bmw nesnesi oluşturma
		Araba bmw = new Araba();
		bmw.yil = 2025;
		bmw.agirlik = 1.249;

		// Nesnenin özelliklerini yazdırma
		System.out.println("Yıl: " + bmw.yil);
		System.out.println("Ağırlık: " + bmw.agirlik);
	}
}