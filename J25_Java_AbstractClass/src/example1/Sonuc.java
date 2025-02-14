package example1;

//Main sınıfı
public class Sonuc {
	public static void main(String[] args) {
		Dikdortgen d1 = new Dikdortgen(5, 6);
		Ucgen u1 = new Ucgen(4, 8);

		System.out.println(d1.alanHesapla());
		System.out.println(u1.alanHesapla());
	}
}