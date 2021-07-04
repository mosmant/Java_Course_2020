package Gun52.Soru1;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Furkan", "Lise");
        LiseOgrencisi lo2=new LiseOgrencisi("Necdet", "Lise");

        IlkOgrenci io1=new IlkOgrenci("Sevim","ilk");
        IlkOgrenci io2=new IlkOgrenci("Emir","ilk");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);
    }
}
