package example3;

public class OverloadingOrnek3 {
	static void bilgi(String ad, int yas) {
		System.out.println("Ad: " + ad + ", Yaş: " + yas);
	}

	static void bilgi(int yas, String ad) {
		System.out.println("Yaş: " + yas + ", Ad: " + ad);
	}

	public static void main(String[] args) {
		bilgi("Ayşe", 30);
		bilgi(25, "Zeynep");
	}
}