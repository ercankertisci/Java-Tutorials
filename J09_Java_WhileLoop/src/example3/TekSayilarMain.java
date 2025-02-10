package example3;

public class TekSayilarMain {

	public static void main(String[] args) {
		int sayi = 1;

		while (sayi <= 20) {
			if (sayi % 2 != 0) { // Sayı tek mi?
				System.out.println(sayi);
			}
			sayi++;
		}
	}
}
