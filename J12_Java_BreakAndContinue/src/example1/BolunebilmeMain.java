package example1;

public class BolunebilmeMain {

	public static void main(String[] args) {
		int sayac = 10;

		for (int j = 1; j < sayac; j++) {
			if (sayac % j == 0) {
				System.out.println("Break Deyimi!");
				break;
			}
		}
	}
}