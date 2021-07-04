package Gun38.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd= "Yıldırım Lisesi";

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
