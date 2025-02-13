package example5;

public class DiziKopyalama {
	public static void main(String[] args) {
		int[] orijinal = { 1, 2, 3, 4, 5 };
		int[] kopya = new int[orijinal.length];

		for (int i = 0; i < orijinal.length; i++) {
			kopya[i] = orijinal[i];
		}

		for (int eleman : kopya) {
			System.out.println(eleman);
		}
	}
}