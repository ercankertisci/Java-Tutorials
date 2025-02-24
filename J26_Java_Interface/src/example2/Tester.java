package example2;

//Tester Sınıfı
public class Tester implements Calisan {
	@Override
	public void hesapla(int saatUcreti, int calismaSaati) {
		int maas = saatUcreti * calismaSaati;
		System.out.println("Tester Maaşı: " + maas);
	}
}