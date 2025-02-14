package example1;

//Üçgen sınıfı
public class Ucgen extends Sekil {
	public Ucgen(double x, double y) {
		super(x, y);
	}

	@Override
	public double alanHesapla() {
		System.out.println("Üçgenin Alanı:");
		return (kenar1 * kenar2) / 2;
	}
}