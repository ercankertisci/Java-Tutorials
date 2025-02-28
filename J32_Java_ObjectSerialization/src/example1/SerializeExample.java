package example1;

import java.io.*;

public class SerializeExample {
	public static void main(String[] args) {
		Person person = new Person("John", "Doe");

		try {
			FileOutputStream fileOut = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.println("Nesne serileştirildi ve 'person.ser' dosyasına kaydedildi.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}