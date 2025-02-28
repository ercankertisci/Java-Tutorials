package example1;

import java.io.*;

public class FileWriteExample {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\example.txt"); // Dosya yolu
		try {
			FileWriter writer = new FileWriter(file);
			String content = "John Doe\nNew York\nJava Programming\nFile Handling";
			writer.write(content);
			writer.close();
			System.out.println("Dosya başarıyla oluşturuldu ve yazıldı!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}