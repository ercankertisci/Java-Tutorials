package example1;

//Soyut sınıf (Abstract Class)
public abstract class Sekil {
	double kenar1, kenar2;

	// Constructor (Yapıcı Metod)
	public Sekil(double x, double y) {
		kenar1 = x;
		kenar2 = y;
	}

	// Soyut metod (Abstract Method)
	public abstract double alanHesapla();
}