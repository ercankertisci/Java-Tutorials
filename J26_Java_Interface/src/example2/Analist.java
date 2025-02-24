package example2;

//Analist Sınıfı
public class Analist implements Calisan {
	@Override
	public void hesapla(int saatUcreti, int calismaSaati) {
		int maas = saatUcreti * calismaSaati;
		System.out.println("Analist Maaşı: " + maas);
	}
}