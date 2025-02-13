package example6;

import java.util.Arrays;

public class DiziKopyalama2 {
	public static void main(String[] args) {
		int[] original = { 2, 4, 6, 8 };
		int[] kopya = new int[original.length];

		System.arraycopy(original, 0, kopya, 0, original.length);

		System.out.println(Arrays.toString(kopya));
	}
}