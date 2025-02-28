package example8;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(101, "Alice");
		students.put(102, "Bob");
		students.put(103, "Charlie");

		System.out.println("HashMap Öğrenci Listesi: " + students);
	}
}