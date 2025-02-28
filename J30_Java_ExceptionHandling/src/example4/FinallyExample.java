package example4;

public class FinallyExample {
	public static void main(String[] args) {
		try {
			int sayi = 10 / 0; // Hata oluşturur
		} catch (ArithmeticException e) {
			System.out.println("Hata: Sıfıra bölme hatası!");
		} finally {
			System.out.println("Bu blok her durumda çalışır!");
		}
	}
}