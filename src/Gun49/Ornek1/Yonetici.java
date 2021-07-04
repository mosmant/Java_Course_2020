package Gun49.Ornek1;

public class Yonetici {
    String ad;
    String soyad;
    int yas;
    double maas;
    String departman;
    int sicilNo;

    public double getMaas() {
        return maas;
    }

    public void zamYap(int yuzde)
    {
        System.out.println(yuzde+
                " oranında zam yapıldı");
    }

}
