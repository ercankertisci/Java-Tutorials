package Example5;

public class IntStringCastingMain {

	public static void main(String[] args) {
		int sayi1 = 12;
		String deger1 = Integer.toString(sayi1);
		String deger2 = String.valueOf(sayi1);

		System.out.println(deger1 + " " + deger2);
	}

}