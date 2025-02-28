package example6;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> orderedSet = new LinkedHashSet<>();
		orderedSet.add("Banana");
		orderedSet.add("Apple");
		orderedSet.add("Cherry");
		orderedSet.add("Apple"); // Tekrar eden eleman eklenmez.

		System.out.println("LinkedHashSet Elemanları: " + orderedSet);
	}
}