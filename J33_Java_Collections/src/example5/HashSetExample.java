package example5;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Alice");
		uniqueNames.add("Bob");
		uniqueNames.add("Charlie");
		uniqueNames.add("Alice"); // Tekrar eden eleman eklenemez.

		System.out.println("HashSet Elemanları: " + uniqueNames);
	}
}