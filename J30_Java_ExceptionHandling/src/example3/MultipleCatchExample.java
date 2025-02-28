package example3;

public class MultipleCatchExample {
	public static void main(String[] args) {
		try {
			int[] sayilar = { 5, 10, 15 };
			int sonuc = sayilar[3] / 0; // Hem dizi hatası hem de sıfıra bölme hatası!
			System.out.println(sonuc);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizi sınırları aşıldı!");
		} catch (ArithmeticException e) {
			System.out.println("Bir sayıyı sıfıra bölemezsiniz!");
		}
	}
}