package Gun54.Soru;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println("d.cevresi= " + d.cevresi(4,5));
        System.out.println("d.alani = " + d.alani(4,5));

        Cember c=new Cember();
        System.out.println("c.alani = " + c.alani(4));
        System.out.println("c.cevresi = " + c.cevresi(4));

        Kare k=new Kare();
        System.out.println("k.alani = " + k.alani(4));
        System.out.println("k.cevresi = " + k.cevresi(4));

    }
}
