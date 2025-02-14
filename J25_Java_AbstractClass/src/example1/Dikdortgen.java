package example1;

//Dikdörtgen sınıfı
public class Dikdortgen extends Sekil {
	public Dikdortgen(double x, double y) {
		super(x, y);
	}

	@Override
	public double alanHesapla() {
		System.out.println("Dikdörtgenin Alanı:");
		return kenar1 * kenar2;
	}
}