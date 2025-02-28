package examplee10;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
	public static void main(String[] args) {
		// TreeMap Tanımlama
		Map<String, Integer> treeMap = new TreeMap<>();

		// Değerler Ekleme
		treeMap.put("Banana", 2);
		treeMap.put("Apple", 5);
		treeMap.put("Cherry", 7);
		treeMap.put("Mango", 3);

		// Çıktı
		System.out.println("TreeMap İçeriği (Alfabetik Sıralı): " + treeMap);
	}
}