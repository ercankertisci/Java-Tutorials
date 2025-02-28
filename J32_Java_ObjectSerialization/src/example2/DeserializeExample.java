package example2;

import java.io.*;

import example1.Person;

public class DeserializeExample {
	public static void main(String[] args) {
		Person person = null;
		String filePath = "person.ser"; // Dosya yolu değişken olarak tutuldu

		// Dosyanın var olup olmadığını kontrol et
		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("Hata: '" + filePath + "' dosyası bulunamadı!");
			return;
		}

		// Try-with-resources kullanarak güvenli akış yönetimi
		try (FileInputStream fileIn = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {

			person = (Person) in.readObject();
			System.out.println("Nesne geri yüklendi.");
			System.out.println("Ad: " + person.getFirstName());
			System.out.println("Soyad: " + person.getLastName());

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Deserializasyon sırasında hata oluştu!");
			e.printStackTrace();
		}
	}
}