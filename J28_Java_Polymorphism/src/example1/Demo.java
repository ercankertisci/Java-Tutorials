package example1;

//Ana program (Main)
public class Demo {
	public static void main(String[] args) {
		Hayvan hayvan1 = new Kus(); // Kuş nesnesi
		hayvan1.hareketEt(); // "Kuş uçuyor..."

		Hayvan hayvan2 = new Balik(); // Balık nesnesi
		hayvan2.hareketEt(); // "Balık yüzüyor..."
	}
}