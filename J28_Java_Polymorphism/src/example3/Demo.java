package example3;

//(Main)
public class Demo {
	public static void main(String[] args) {
		Sekil s1 = new Dikdortgen(4, 5);
		System.out.println("Dikdörtgen Alanı: " + s1.getArea());

		Sekil s2 = new Ucgen(4, 5);
		System.out.println("Üçgen Alanı: " + s2.getArea());
	}
}