package Example4;

public class StringIntCastingMain2 {

	public static void main(String[] args) {
		String a = "10";

		int yeni1 = Integer.valueOf(a);
		System.out.println("carpim sonucu=" + yeni1 * yeni1);

		/* parseInt ve valueOf metodu string ifadeleri integer'a çevirmektedir. */
	}

}