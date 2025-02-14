package example4;

public class Dikdortgen {
	int en, boy;

	public Dikdortgen() { // Parametresiz constructor
		en = 0;
		boy = 0;
	}

	public Dikdortgen(int en, int boy) { // Parametreli constructor
		this.en = en;
		this.boy = boy;
	}

	public int alanHesapla() {
		return en * boy; // Alan hesaplama işlemi
	}
}