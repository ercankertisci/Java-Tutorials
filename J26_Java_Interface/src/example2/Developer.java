package example2;

//Developer Sınıfı
public class Developer implements Calisan {
	@Override
	public void hesapla(int saatUcreti, int calismaSaati) {
		int maas = saatUcreti * calismaSaati;
		System.out.println("Developer Maaşı: " + maas);
	}
}