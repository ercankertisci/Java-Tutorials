package example5;

public class MatrisToplama {
	public static void main(String[] args) {
		int[][] matris1 = { { 1, 2 }, { 3, 4 } };
		int[][] matris2 = { { 5, 6 }, { 7, 8 } };
		int[][] toplam = new int[2][2];

		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris1[i].length; j++) {
				toplam[i][j] = matris1[i][j] + matris2[i][j];
				System.out.println("Toplam[" + i + "][" + j + "] = " + toplam[i][j]);
			}
		}
	}
}