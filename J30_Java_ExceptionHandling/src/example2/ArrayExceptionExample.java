package example2;

public class ArrayExceptionExample {
	public static void main(String[] args) {
		int[] sayilar = { 10, 20, 30, 40 };

		try {
			System.out.println("5. Eleman: " + sayilar[4]); // Hata oluşacak!
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hata: Dizinin sınırlarını aştınız!");
		}
	}
}