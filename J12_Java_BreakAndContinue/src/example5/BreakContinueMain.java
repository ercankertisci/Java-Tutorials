package example5;

public class BreakContinueMain {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 10) {
				break;
			} else if (i == 2) {
				continue;
			}
			System.out.println("Aldığı değerler: " + i);
		}
	}
}