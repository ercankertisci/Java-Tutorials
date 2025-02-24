package example2;

//Yönetici Sınıfı
public class Yonetici implements Calisan {
	@Override
	public void hesapla(int saatUcreti, int calismaSaati) {
		int maas = saatUcreti * calismaSaati;
		System.out.println("Yönetici Maaşı: " + maas);
	}
}