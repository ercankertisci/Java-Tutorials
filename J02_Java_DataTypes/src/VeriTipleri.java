
public class VeriTipleri {

	public static void main(String[] args) {
		// Farklı veri türlerinde değişkenler oluştur
		int elmaSayisi = 30;
		float elmaFiyati = 3.75f;
		float toplamFiyat = elmaSayisi * elmaFiyati;
		char paraBirimi = '₺';

		// Değişkenleri yazdır
		System.out.println("Elma sayısı: " + elmaSayisi);
		System.out.println("Elma fiyatı: " + elmaFiyati + paraBirimi);
		System.out.println("Toplam fiyat = " + toplamFiyat + paraBirimi);

	}

}