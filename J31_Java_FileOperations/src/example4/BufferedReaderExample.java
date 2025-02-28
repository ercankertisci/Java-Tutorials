package example4;

import java.io.*;

public class BufferedReaderExample {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\temp\\example.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}