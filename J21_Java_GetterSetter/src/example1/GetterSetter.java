package example1;

public class GetterSetter {
	private String ad;
	private String soyad;
	private int yas;

	// Getter Metodları
	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public int getYas() {
		return yas;
	}

	// Setter Metodları
	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}