package example2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10); // Tekrar eden eleman eklenebilir.

		System.out.println("LinkedList Elemanları: " + numbers);
	}
}