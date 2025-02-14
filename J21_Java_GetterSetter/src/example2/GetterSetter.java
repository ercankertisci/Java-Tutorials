package example2;

public class GetterSetter {
    private String ad,soyad;
    private int yas;

    public String getad(){
        return ad;
    }

    public void setad(String ad){
        this.ad=ad;
    }
    public String getsoyad(){
        return soyad;
    }
    public void setsoyad(String soyad){
        this.soyad=soyad;
    }
    public int getyas(){
        return yas;
    }
    public void setyas(int yas){
        this.yas=yas;
    }

    public GetterSetter(String ad,String soyad,int yas){
        setad(ad);
        setsoyad(soyad);
        setyas(yas);

    }
}