package example4;

public class Hayvan {

    public String isim,cins;
    public int yas;

    public Hayvan(String ismi, String cinsi, int yasi)
    {
        this.isim = ismi;
        this.cins = cinsi;
        this.yas = yasi;
    }
    public void cinsinibelirt(){
        System.out.println("Cins:" + cins);
    }

    public void isimbelirt(){
        System.out.println("Isim:" + isim);
    }

    public void yasbelirt(){
        System.out.println("Yas:" + yas);
    }
}