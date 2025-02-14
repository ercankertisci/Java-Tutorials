package example2;

public class Kedi extends Hayvan {
    public Kedi(String isim, int yas) {
        super(isim, yas); // Üst sınıfın constructor'ını çağırır
    }

    public void miyavla() {
        System.out.println("Kedi: Miyav miyav!");
    }
}