package example3;

//Otomobil Sınıfı
public class Otomobil implements Arac {
	@Override
	public void sagaDon() {
		System.out.println("Otomobil sağa dönüyor");
	}

	@Override
	public void solaDon() {
		System.out.println("Otomobil sola dönüyor");
	}

	@Override
	public void geriGit() {
		System.out.println("Otomobil geri gidiyor");
	}
}