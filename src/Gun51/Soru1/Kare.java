package Gun51.Soru1;

public class Kare extends Dikdortgen {

    public Kare(double genislik) {
        super(genislik, genislik);
    }

    public String toString() {
        return "uzunluk "+"alan"+getAlan()+
                " cevre"+ getCevre();
    }

}
