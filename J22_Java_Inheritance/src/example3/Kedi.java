package example3;

public class Kedi extends Hayvan {

	public Kedi(String cinsi, String ismi, int yasi) {
		super.cins = cinsi;
		super.isim = ismi;
		super.yas = yasi;
	}

	public void miyav() {
		System.out.println("miyav miyav miyav");
	}
}