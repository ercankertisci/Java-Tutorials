package example2;

public class Sekil {
	// 1. Metod: Tek parametre
	public void alanHesapla(int kenar) {
		System.out.println("Kare Alanı: " + (kenar * kenar));
	}

	// 2. Metod: İki parametre
	public void alanHesapla(int uzunluk, int genislik) {
		System.out.println("Dikdörtgen Alanı: " + (uzunluk * genislik));
	}

	// 3. Metod: Üç parametre
	public void alanHesapla(double taban, double yukseklik, double faktor) {
        System.out.println("Üçgen Alanı: " + (taban * yukseklik * faktor));
    }
}