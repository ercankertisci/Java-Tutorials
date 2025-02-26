package example3;

//Alt sınıf (Subclass) - Üçgen
public class Ucgen extends Sekil {
	private int taban, yukseklik;

	public Ucgen(int taban, int yukseklik) {
		this.taban = taban;
		this.yukseklik = yukseklik;
	}

	@Override
	public double getArea() {
		return 0.5 * taban * yukseklik;
	}
}