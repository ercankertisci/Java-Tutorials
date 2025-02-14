package example1;

public class Test {

	public static void main(String[] args) {
		Hayvan kedi = new Hayvan();
		kedi.isim = "Tekir";
		kedi.boy = 30;

		kedi.kos();
		kedi.avlan();

		System.out.println("İsim: " + kedi.isim);
		System.out.println("Boy: " + kedi.boy);
	}
}