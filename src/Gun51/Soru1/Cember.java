package Gun51.Soru1;

public class Cember extends Sekil {
    private double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getCevre() {
        return 2 * Math.PI * yaricap;
    }


}
