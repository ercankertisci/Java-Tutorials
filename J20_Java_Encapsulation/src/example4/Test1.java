package example4;

public class Test1 {
    public static void main(String[] args) {
        Hayvan kedi = new Hayvan();
        kedi.isim = "Tekir";
        kedi.yas = 3;

        System.out.println("Hayvan İsmi: " + kedi.isim);
        System.out.println("Hayvan Yaşı: " + kedi.yas);

        kedi.sesCikar();
    }
}