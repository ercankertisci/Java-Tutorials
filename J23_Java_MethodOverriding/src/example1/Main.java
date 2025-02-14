package example1;

public class Main {

	public static void main(String[] args) {
		Insan insan = new Insan();
		insan.isim = "Zeynep";
		insan.yas = 30;
		insan.soyadi = "Sayar";

		System.out.println(insan.goster());
	}
}