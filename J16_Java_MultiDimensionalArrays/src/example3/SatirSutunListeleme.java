package example3;

public class SatirSutunListeleme {
	public static void main(String[] args) {
		int[][] dizi = new int[2][2];

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				dizi[i][j] = i + j; // Değer atama
				System.out.println("Dizi[" + i + "][" + j + "] = " + dizi[i][j]);
			}
		}

		// Matris şeklinde yazdırma
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + "\t");
			}
			System.out.println();
		}
	}
}