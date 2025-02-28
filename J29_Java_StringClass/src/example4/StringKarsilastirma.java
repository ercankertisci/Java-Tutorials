package example4;

public class StringKarsilastirma {
	public static void main(String[] args) {
		String a = "Barcelona";
		String b = "Madrid";
		String c = "Barcelona";

		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
	}
}