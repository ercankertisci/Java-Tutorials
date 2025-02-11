package example3;

public class SayiDegerleriMain {

	public static void main(String[] args) {
		for (int a = 0; a < 10; a++) {
			if (a == 3) {
				continue;
			}
			System.out.println("a değişkeninin aldığı değerler: " + a);
		}
	}
}