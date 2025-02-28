package example5;

public class StringKarsilastirma2 {
	public static void main(String[] args) {
		String a = "Berlin";
		String b = "Amsterdam";

		System.out.println(a.compareTo(b)); // Pozitif değer
		System.out.println(b.compareTo(a)); // Negatif değer
		System.out.println(a.compareTo("Berlin")); // 0
	}
}