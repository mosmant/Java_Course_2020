package Gun57.Ornek2;

public class Dikdortgen extends Sekil{
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik)
    {
        //super();
        this.genislik=genislik;
        this.uzunluk=uzunluk;
    }

    @Override
    double alan() {
        return uzunluk*genislik;
    }

    @Override
    double cevre() {
        return (uzunluk+genislik)*2;
    }
}
