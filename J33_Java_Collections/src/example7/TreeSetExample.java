package example7;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<Integer> sortedNumbers = new TreeSet<>();
		sortedNumbers.add(50);
		sortedNumbers.add(10);
		sortedNumbers.add(30);
		sortedNumbers.add(20);
		sortedNumbers.add(40);

		System.out.println("TreeSet Elemanları (Sıralı): " + sortedNumbers);
	}
}