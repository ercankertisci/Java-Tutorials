package example4;

public class BolunmeMain {

	public static void main(String[] args) {
		for (int i = 3; i < 50; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i + " sayısı 3 ile tam bölünebilmektedir");
		}
	}
}