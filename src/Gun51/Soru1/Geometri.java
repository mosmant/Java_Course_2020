package Gun51.Soru1;

public class Geometri {
    public static void main(String[] args) {

        Cember c = new Cember(3);
        System.out.println("c.getCevre() = " + c.getCevre());

        //System.out.println("c.getAlan() = " + c.getAlan());

        Dikdortgen d = new Dikdortgen(5, 4);
        System.out.println("d.getAlan() = " + d.getAlan());
        System.out.println("d.getCevre() = " + d.getCevre());

        Kare k = new Kare(5);
        System.out.println("k.getAlan() = " + k.getAlan());
        System.out.println("k.getCevre() = " + k.getCevre());
        System.out.println("k = " + k);
    }
}
