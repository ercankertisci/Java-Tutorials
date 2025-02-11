package example7;

public class PiramitMain {

	public static void main(String[] args) {
		int satir = 5;

		for (int i = 1; i <= satir; i++) {
			for (int j = satir - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
