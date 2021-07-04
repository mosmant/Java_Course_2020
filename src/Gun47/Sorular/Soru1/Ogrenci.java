package Gun47.Sorular.Soru1;

public class Ogrenci {
    private int okulNo;
    private String ad;
    private String soyad;
    private int yas;

    private static int ID=1;

    public Ogrenci(String ad, String soyad, int yas) throws Exception {
//        this.ad = ad;
//        this.soyad = soyad;
//        this.yas = yas;
        setOkulNo();
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public int getOkulNo() {
        return okulNo;
    }

    private void setOkulNo() {
        this.okulNo = ID++;
    }

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

    // Exception : Checked ları da kapsayan genel exception
    // olduğundan CHECKED gibi işlem gördüğünden
    // THROWS veya try-catch zorunlu olmakta
    public void setYas(int yas) throws Exception {
        if (yas > 15)
            throw new Exception("Yaş sınırı 15");
        else
            this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }


}
