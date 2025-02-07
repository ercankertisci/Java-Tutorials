package Example6;

public class TypeCastingGeneralMain {

	public static void main(String[] args) {

		/* integer veri tipinden double veri tipine donusum */
		int sayi = 674;
		double sayi1 = (double) sayi;
		System.out.println(sayi1);

		/* double veri tipinden integer veri tipine donusum */

		double sayi2 = 234.7;
		int sayi3 = (int) sayi2;
		System.out.println(sayi3);

		/* float veri tipinden long veri tipine donusum */

		float sayi4 = 724.7f;
		long sayi5 = (long) sayi4;
		System.out.println(sayi5);

		/* long veri tipinden float veri tipine donusum */

		long sayi6 = 4320;
		float sayi7 = (float) sayi6;
		System.out.println(sayi7);
	}

}