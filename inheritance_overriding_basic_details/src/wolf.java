
public class wolf extends animal{
    private int dis_sayısı;

    public wolf(String tur, String isim, int kilo, double boy, int ayak_sayısı,int dis_sayısı) {
        super(tur, isim, kilo, boy, ayak_sayısı);
        this.dis_sayısı = dis_sayısı ;
        
    }

    /**
     * @return the dis_sayısı
     */
    public int getDis_sayısı() {
        return dis_sayısı;
    }

    /**
     * @param dis_sayısı the dis_sayısı to set
     */
    public void setDis_sayısı(int dis_sayısı) {
        this.dis_sayısı = dis_sayısı;
    }
    public void savas(){
        System.out.println("wolf fighting");
    }
    public void kos(int hız){
        
        System.out.println("wolf moving at "+hız +"km/h");
        hareketeGec(hız);//super anahtar kelimesi ile yazma...
        //super kullanmadığında override etmek zorunda kalmıyoruz.
    }
    public void hareketeGec(int hız){
        System.out.println("wolf moving....");
        
    }

        
        
    }
    
