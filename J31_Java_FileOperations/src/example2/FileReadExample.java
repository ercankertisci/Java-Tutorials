package example2;

import java.io.*;

public class FileReadExample {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\example.txt");

		try {
			FileReader reader = new FileReader(file);
			char[] data = new char[(int) file.length()];
			reader.read(data);
			System.out.println(new String(data));
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}