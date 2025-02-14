package example6;

public class MatrisCarpma {
	public static void main(String[] args) {
		int[][] matris1 = { { 1, 2 }, { 3, 4 } };
		int[][] matris2 = { { 2, 0 }, { 1, 2 } };
		int[][] carpim = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					carpim[i][j] += matris1[i][k] * matris2[k][j];
				}
				System.out.println("Çarpım[" + i + "][" + j + "] = " + carpim[i][j]);
			}
		}
	}
}