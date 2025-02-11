package example2;

public class DonguSonlandirmaMain {

	public static void main(String[] args) {
		int i = 0;

		do {
			if (i == 10) {
				System.out.println("i değeri 10'a eşittir");
				break;
			} else {
				System.out.println("i değeri: " + i);
				i++;
			}
		} while (true);
	}
}