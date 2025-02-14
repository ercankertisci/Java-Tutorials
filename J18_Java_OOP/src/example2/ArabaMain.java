package example2;

public class ArabaMain {

	public static void main(String[] args) {
		Araba bmw = new Araba();
		bmw.yil = 2025;
		bmw.agirlik = 1.249;

		System.out.println("Yıl: " + bmw.yil);
		System.out.println("Ağırlık: " + bmw.agirlik);

		// Metodları çağırma
		bmw.frenYap();
		bmw.gazVer();
	}
}