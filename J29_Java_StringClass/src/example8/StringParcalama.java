package example8;

import java.util.StringTokenizer;

public class StringParcalama {
	public static void main(String[] args) {
		String text = "Java-Programming-Language";
		StringTokenizer st = new StringTokenizer(text, "-");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}