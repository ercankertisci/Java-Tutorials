package Example2;

public class VeriTipleri2 {

	public static void main(String[] args) {
		// Farklı veri türlerinde değişkenler oluştur
		String urunAdi = "Kahve";
		int adet = 5;
		double birimFiyat = 12.50;
		double toplamFiyat = adet * birimFiyat;
		boolean stoktaVarMi = true;
		char paraBirimi = '$';

		// Değişkenleri yazdır
		System.out.println("Ürün: " + urunAdi);
		System.out.println("Adet: " + adet);
		System.out.println("Birim Fiyatı: " + birimFiyat + paraBirimi);
		System.out.println("Toplam Fiyat: " + toplamFiyat + paraBirimi);
		System.out.println("Stok Durumu: " + (stoktaVarMi ? "Var" : "Yok"));
	}
}
