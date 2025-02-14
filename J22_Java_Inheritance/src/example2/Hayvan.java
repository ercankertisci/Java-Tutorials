package example2;

public class Hayvan {
    public String isim;
    public int yas;

    public Hayvan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}