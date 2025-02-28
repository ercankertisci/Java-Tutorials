package example3;

import java.io.*;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\temp\\example.txt");
		FileWriter fw = new FileWriter(file, false);
		BufferedWriter writer = new BufferedWriter(fw);

		writer.write("BufferedWriter kullanarak dosya yazma işlemi gerçekleştirdik!");
		writer.newLine(); // Yeni satır ekler
		writer.write("Bu bir test satırıdır.");

		writer.flush(); // Buffer içeriğini dosyaya yazar
		writer.close();

		System.out.println("Dosyaya yazma işlemi tamamlandı!");
	}
}