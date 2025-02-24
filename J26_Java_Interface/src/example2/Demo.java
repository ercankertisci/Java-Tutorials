package example2;

//Main Sınıfı
public class Demo {
	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.hesapla(160, 7);

		Yonetici y1 = new Yonetici();
		y1.hesapla(200, 10);

		Analist a1 = new Analist();
		a1.hesapla(150, 6);

		Tester t1 = new Tester();
		t1.hesapla(160, 5);
	}
}