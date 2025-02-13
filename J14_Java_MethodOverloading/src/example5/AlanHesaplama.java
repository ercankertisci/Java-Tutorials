package example5;

public class AlanHesaplama {
	static double alan(double yaricap) {
		return Math.PI * yaricap * yaricap; // Dairenin alanı
	}

	static int alan(int kenar) {
		return kenar * kenar; // Karenin alanı
	}

	static int alan(int uzunKenar, int kisaKenar) {
		return uzunKenar * kisaKenar; // Dikdörtgenin alanı
	}

	public static void main(String[] args) {
		System.out.println("Dairenin Alanı: " + alan(7.0));
		System.out.println("Karenin Alanı: " + alan(5));
		System.out.println("Dikdörtgenin Alanı: " + alan(10, 6));
	}
}