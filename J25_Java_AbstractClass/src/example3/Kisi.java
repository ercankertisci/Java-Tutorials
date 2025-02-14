package example3;

//Soyut sınıf (Abstract Class)
public abstract class Kisi {
	private String isim;
	private int numara;

	public Kisi(String isim, int numara) {
		this.isim = isim;
		this.numara = numara;
	}

	public void goster() {
		System.out.println("İsim: " + isim);
		System.out.println("Numara: " + numara);
	}
}