package example3;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> cities = new Vector<>();
		cities.add("New York");
		cities.add("London");
		cities.add("Tokyo");

		System.out.println("Vector Elemanları: " + cities);
	}
}