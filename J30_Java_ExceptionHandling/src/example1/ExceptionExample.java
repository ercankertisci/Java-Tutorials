package example1;

public class ExceptionExample {
	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 0;
		int sonuc;

		try {
			sonuc = sayi1 / sayi2; // Hata oluşacak!
			System.out.println("Sonuç: " + sonuc);
		} catch (ArithmeticException e) {
			System.out.println("Hata oluştu: Bir sayıyı sıfıra bölemezsiniz!");
		}
	}
}