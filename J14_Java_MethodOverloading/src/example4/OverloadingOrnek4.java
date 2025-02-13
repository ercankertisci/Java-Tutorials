package example4;

public class OverloadingOrnek4 {
	static int hesapla(int a, int b) {
		return a + b;
	}

	static double hesapla(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println("Toplam: " + hesapla(10, 5)); // int metodunu çağırır
		System.out.println("Çarpım: " + hesapla(2.5, 4.0)); // double metodunu çağırır
	}
}