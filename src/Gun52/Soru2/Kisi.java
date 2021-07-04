package Gun52.Soru2;

public class Kisi {
    private String isim;
    private String adres;
    private  UyeTipi uyeTip;
    private Okul okul;

    public Kisi(String isim, String adres, UyeTipi uyeTip, Okul okul) {
        setIsim(isim);
        setAdres(adres);
        setUyeTip(uyeTip);
        setOkul(okul);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public UyeTipi getUyeTip() {
        return uyeTip;
    }

    public void setUyeTip(UyeTipi uyeTip) {
        this.uyeTip = uyeTip;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", uyeTip=" + uyeTip +
                ", okul=" + okul.getIsim() +
                '}';
    }
}
