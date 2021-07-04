package Gun57.Ornek2;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(4,5);
        d.setName("Dikdortgen");
        System.out.println("d = " + d);

        Cember c=new Cember(6);
        c.setName("Çember");
        System.out.println("c = " + c);

        c.ciz();
        d.ciz();
    }
}
