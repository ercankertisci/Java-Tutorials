package examplee11;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
	public static void main(String[] args) {
		// Hashtable Tanımlama
		Map<Integer, String> hashtable = new Hashtable<>();

		// Değerler Ekleme
		hashtable.put(201, "Laptop");
		hashtable.put(202, "Monitor");
		hashtable.put(203, "Keyboard");

		// Null eklenemez! Hata verir.
		// hashtable.put(null, "Mouse"); // NullPointerException fırlatır!
		// hashtable.put(204, null); // NullPointerException fırlatır!

		// Çıktı
		System.out.println("Hashtable İçeriği: " + hashtable);
	}
}