package example1;

public class Insan extends Canli {
	public String soyadi;

	@Override
	public String goster() {
		return "İsim: " + isim + "\n" + "Yaş: " + yas + "\n" + "Soyadı: " + soyadi;
	}
}