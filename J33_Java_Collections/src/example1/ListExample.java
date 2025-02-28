package example1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Alice"); // Tekrar eden eleman eklenebilir.

		System.out.println("List Elemanları: " + names);

		names.remove("Bob");
		System.out.println("Bob Silindi: " + names);
	}
}