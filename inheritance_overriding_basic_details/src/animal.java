
public class animal {//main (super)class
    private String tur;
    private String isim ;
    private int kilo ;
    private double boy ;
    private int ayak_sayısı ;
    public animal(String tur,String isim,int kilo,double boy,int ayak_sayısı){
        this.tur = tur ;
        this.isim = isim ;
        this.kilo = kilo ;
        this.boy = boy ;
        this.ayak_sayısı = ayak_sayısı ;
   
    }
    
    public void yemekYe(){
        System.out.println("the animal is eating");
    }
    public void hareketeGec(int hız){
        System.out.println("animal moving at "+hız +"km/h");
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tür) {
        this.tur = tür;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public int getAyak_sayısı() {
        return ayak_sayısı;
    }

    public void setAyak_sayısı(int ayak_sayısı) {
        this.ayak_sayısı = ayak_sayısı;
    }
    
    
}
