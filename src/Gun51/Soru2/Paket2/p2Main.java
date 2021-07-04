package Gun51.Soru2.Paket2;
import Gun51.Soru2.Paket1.p1Hayvan;

public class p2Main {
    public static void main(String[] args) {
        p1Hayvan h=new p1Hayvan();
        h.ad="köpek";
        // h.yas, h.cinsi erişilemiyor çünkü
        //default ve protected

        p2Kedi kedi=new p2Kedi("kopuk", "scotish");
        System.out.println("kedi = " + kedi);
        //kedi.cinsi Sadece subclass dan ulaşılabiliyor.
    }
}
