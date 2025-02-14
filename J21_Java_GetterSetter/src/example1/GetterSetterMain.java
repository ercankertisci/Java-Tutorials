package example1;

public class GetterSetterMain {

	public static void main(String[] args) {
		GetterSetter nesne1 = new GetterSetter();

		// Değer Atama (Setter ile)
		nesne1.setAd("Mert");
		nesne1.setSoyad("Can");
		nesne1.setYas(21);

		// Değer Okuma (Getter ile)
		System.out.println("Ad: " + nesne1.getAd());
		System.out.println("Soyad: " + nesne1.getSoyad());
		System.out.println("Yaş: " + nesne1.getYas());
	}
}