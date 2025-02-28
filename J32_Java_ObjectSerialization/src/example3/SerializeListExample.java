package example3;

import java.io.*;
import java.util.ArrayList;

import example1.Person;

public class SerializeListExample {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("Alice", "Smith"));
		people.add(new Person("Bob", "Johnson"));
		people.add(new Person("Charlie", "Brown"));

		try {
			FileOutputStream fileOut = new FileOutputStream("people.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(people);
			out.close();
			fileOut.close();
			System.out.println("Liste serileştirildi.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}