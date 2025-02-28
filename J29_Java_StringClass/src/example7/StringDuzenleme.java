package example7;

public class StringDuzenleme {
	public static void main(String[] args) {
		String kelime = "   Python Programming   ";

		System.out.println(kelime.substring(5, 10)); // "Progr"
		System.out.println(kelime.trim()); // Boşlukları kaldırır
		System.out.println(kelime.replace("Python", "Java")); // "Java Programming"
		System.out.println(kelime.toUpperCase()); // BÜYÜK HARF
		System.out.println(kelime.toLowerCase()); // küçük harf
	}
}