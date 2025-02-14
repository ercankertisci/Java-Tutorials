package example3;

public class YapicilarMain {

	public static void main(String[] args) {
		Yapicilar nesne1 = new Yapicilar(); // Parametresiz constructor çağrılır
		Yapicilar nesne2 = new Yapicilar(25); // Parametreli constructor çağrılır

		System.out.println("Nesne1 - Sayı1: " + nesne1.sayi1);
		System.out.println("Nesne2 - Sayı2: " + nesne2.sayi2);
	}
}