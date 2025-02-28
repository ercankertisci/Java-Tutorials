package example9;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		// LinkedHashMap Tanımlama
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

		// Değerler Ekleme
		linkedHashMap.put(101, "John");
		linkedHashMap.put(102, "Emily");
		linkedHashMap.put(103, "Michael");
		linkedHashMap.put(104, "Sophia");

		// Çıktı
		System.out.println("LinkedHashMap İçeriği: " + linkedHashMap);
	}
}