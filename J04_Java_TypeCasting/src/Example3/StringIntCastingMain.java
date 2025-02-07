package Example3;

public class StringIntCastingMain {

	public static void main(String[] args) {

		String a = "20";

		int yeni1 = Integer.parseInt(a);
		System.out.println("carpim sonucu=" + yeni1 * yeni1);

		/* parseInt ve valueOf metodu string ifadeleri integer'a çevirmektedir. */
	}

}