package Gun53.JavaPolymorphism.Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    public static void kimlikYaz(Kisi kisi)
    {
        System.out.println("kisi.ad = " + kisi.ad);
        System.out.println("kisi.soyad = " + kisi.soyad);
        System.out.println("kisi.gorev = " + kisi.gorev);

        // gelene öğrenci ise
        if (kisi instanceof Ogrenci)
           System.out.println(" = " + ((Ogrenci)kisi).getSube());

        // gelen calisan ise
        if (kisi instanceof Calisan)
            System.out.println(" = " + ((Calisan)kisi).getDepartman());
    }


}
