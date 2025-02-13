package example6;

public class AsalSayiKontrolMain {
	static boolean asalMi(int sayi) {
		if (sayi <= 1)
			return false;
		for (int i = 2; i <= sayi / 2; i++) {
			if (sayi % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int sayi = 29;
		if (asalMi(sayi)) {
			System.out.println(sayi + " bir asal sayıdır.");
		} else {
			System.out.println(sayi + " bir asal sayı değildir.");
		}
	}
}