package example2;

public class Main {

	public static void main(String[] args) {
		Kedi kedi = new Kedi("Tekir", 3);

		System.out.println("İsim: " + kedi.isim);
		System.out.println("Yaş: " + kedi.yas);
		kedi.sesCikar(); // Üst sınıftan miras alınan metod
		kedi.miyavla(); // Alt sınıfa özgü metod
	}
}