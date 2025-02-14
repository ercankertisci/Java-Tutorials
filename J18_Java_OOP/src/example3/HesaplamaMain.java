package example3;

public class HesaplamaMain {

	public static void main(String[] args) {
		Hesaplama hesap = new Hesaplama();

		int toplam = hesap.toplama(4, 5);
		int fark = hesap.cikarma(10, 3);
		int carpim = hesap.carpma(6, 7);
		float bolum = hesap.bolme(20, 4);

		System.out.println("Toplama: " + toplam);
		System.out.println("Çıkarma: " + fark);
		System.out.println("Çarpma: " + carpim);
		System.out.println("Bölme: " + bolum);
	}
}