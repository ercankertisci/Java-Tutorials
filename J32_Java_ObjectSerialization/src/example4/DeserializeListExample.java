package example4;

import java.io.*;
import java.util.ArrayList;

import example1.Person;

public class DeserializeListExample {
	public static void main(String[] args) {
		ArrayList<Person> people = null;

		try {
			FileInputStream fileIn = new FileInputStream("people.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			people = (ArrayList<Person>) in.readObject();
			in.close();
			fileIn.close();

			System.out.println("Liste geri yüklendi.");
			for (Person p : people) {
				System.out.println("Ad: " + p.getFirstName() + ", Soyad: " + p.getLastName());
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}