package example5;

public class Kare {
	int en, boy;

	public Kare() { // Parametresiz constructor
		en = 0;
		boy = 0;
	}

	public Kare(int x) { // Tek parametreli constructor
		en = boy = x;
	}

	public Kare(int en, int boy) { // Çift parametreli constructor
		this.en = en;
		this.boy = boy;
	}
}