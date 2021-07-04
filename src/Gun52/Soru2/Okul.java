package Gun52.Soru2;

import java.util.ArrayList;

public class Okul {
    private String isim;
    private int maxOgrSay;
    private ArrayList<Ogrenci> ogrencileri=new ArrayList<>();
    private ArrayList<Calisan> calisanlar=new ArrayList<>();

    public Okul(String isim, int maxOgrSay) {
        this.isim = isim;
        this.maxOgrSay = maxOgrSay;
    }

    public void ogrenciKayit(Ogrenci ogr)
    {
        ogrencileri.add(ogr);
    }

    public void calisanEkle(Calisan cal)
    {
        calisanlar.add(cal);
    }

    public void ogrenciListele()
    {
        for(Ogrenci o: ogrencileri)
        {
            System.out.println("o = " + o);
        }
    }

    public void calisanListele()
    {
        for(Calisan c: calisanlar)
        {
            System.out.println("o = " + c);
        }
    }






    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrSay() {
        return maxOgrSay;
    }

    public void setMaxOgrSay(int maxOgrSay) {
        this.maxOgrSay = maxOgrSay;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    public ArrayList<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }



    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrSay=" + maxOgrSay +
                ", ogrencileri=" + ogrencileri +
                ", calisanlar=" + calisanlar +
                '}';
    }
}
