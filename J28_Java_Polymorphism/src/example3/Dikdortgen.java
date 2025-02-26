package example3;

//Alt sınıf (Subclass) - Dikdörtgen
public class Dikdortgen extends Sekil {
	private int en, boy;

	public Dikdortgen(int en, int boy) {
		this.en = en;
		this.boy = boy;
	}

	@Override
	public double getArea() {
		return en * boy;
	}
}