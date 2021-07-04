package Gun34._01_Soru;

public class Ders {
    String dersAd;
    int saati;

    public static Ders dersOlustur(String dersAd, int saati)
    {
        Ders ders=new Ders();
        ders.dersAd =dersAd;
        ders.saati =saati;

        return  ders;
    }


}
