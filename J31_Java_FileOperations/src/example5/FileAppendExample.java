package example5;

import java.io.*;

public class FileAppendExample {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\temp\\example.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.newLine();
			bw.write("Bu yeni eklenen bir satırdır.");

			bw.close();
			System.out.println("Dosyaya veri eklendi!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}