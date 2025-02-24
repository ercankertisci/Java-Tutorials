package example1;

//Interface'i Implement Eden Sınıf
public class Matematik implements HesapMakinesi {
	@Override
	public void topla(int x, int y) {
		System.out.println("Toplam = " + (x + y));
	}

	@Override
	public void carp(int a, int b, int c) {
		System.out.println("Çarpım = " + (a * b * c));
	}
}
