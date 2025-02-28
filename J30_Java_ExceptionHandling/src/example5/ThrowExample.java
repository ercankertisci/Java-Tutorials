package example5;

public class ThrowExample {
	static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Yaşınız 18'den küçük, giriş yapamazsınız!");
		} else {
			System.out.println("Hoş geldiniz!");
		}
	}

	public static void main(String[] args) {
		checkAge(16); // Hata verecek!
	}
}