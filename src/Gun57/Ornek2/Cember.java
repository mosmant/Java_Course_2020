package Gun57.Ornek2;

public class Cember extends Sekil {
    private double yaricap;

    public Cember(double yaricap)
    {
        //super();
        this.yaricap=yaricap;
    }

    @Override
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return 2*Math.PI*yaricap;
    }
}
