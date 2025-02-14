package example3;

public class GetterSetter {
    private String ad;
    private String soyad;
    private int yas;

    // Getter ve Setter
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas > 0) {
            this.yas = yas;
        } else {
            System.out.println("Geçersiz yaş: " + yas);
        }
    }
}