package example3;

public class GetterSetterMain {

	public static void main(String[] args) {
		GetterSetter nesne1 = new GetterSetter();

		// Setter ile değer atama
		nesne1.setAd("Mert");
		nesne1.setSoyad("Can");
		nesne1.setYas(-5); // Geçersiz değer
		nesne1.setYas(37); // Geçerli değer

		// Getter ile değer okuma
		System.out.println("Ad: " + nesne1.getAd());
		System.out.println("Soyad: " + nesne1.getSoyad());
		System.out.println("Yaş: " + nesne1.getYas());
	}
}